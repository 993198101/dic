package com.dhcc.dic.service.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TConsColumnsDao;
import com.dhcc.dic.dao.TConstraintsDao;
import com.dhcc.dic.dao.TCtrlTypeDao;
import com.dhcc.dic.dao.TDatasourceDao;
import com.dhcc.dic.dao.TFuncTypeDao;
import com.dhcc.dic.dao.TIndexColumnsDAO;
import com.dhcc.dic.dao.TIndexDao;
import com.dhcc.dic.dao.TTableDao;
import com.dhcc.dic.dao.TTableFieldDao;
import com.dhcc.dic.entity.ConstraintsDTO;
import com.dhcc.dic.entity.ContraintsCustom;
import com.dhcc.dic.entity.DifTableDTO;
import com.dhcc.dic.entity.IndexColumnsCustom;
import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TConsColumns;
import com.dhcc.dic.entity.TConsColumnsExample;
import com.dhcc.dic.entity.TConstraints;
import com.dhcc.dic.entity.TConstraintsExample;
import com.dhcc.dic.entity.TCtrlType;
import com.dhcc.dic.entity.TCtrlTypeExample;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TFuncType;
import com.dhcc.dic.entity.TFuncTypeExample;
import com.dhcc.dic.entity.TIndexColumns;
import com.dhcc.dic.entity.TIndexColumnsExample;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableExample;
import com.dhcc.dic.entity.TTableExample.Criteria;
import com.dhcc.dic.entity.TTableField;
import com.dhcc.dic.entity.TTableFieldExample;
import com.dhcc.dic.entity.TableCustom;
import com.dhcc.dic.service.TableService;
import com.dhcc.dic.util.DbUtil;
import com.dhcc.dic.util.MenuTreeUtil;
import com.github.pagehelper.PageHelper;

@Service
public class TableServiceImpl implements TableService {
	@Autowired
	private TTableDao tTableDao;
	@Autowired
	private TTableFieldDao tTableFieldDao;
	@Autowired
	private TConsColumnsDao tConsColumnsDao;
	@Autowired
	private TConstraintsDao tConstraintsDao;
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	@Autowired
	private TFuncTypeDao tFuncTypeDao;
	@Autowired
	private TCtrlTypeDao tCtrlTypeDao;
	@Autowired
	private TIndexDao tIndexDao;
	@Autowired
	private TIndexColumnsDAO tIndexColumnsDAO;
	@Autowired
	private TDatasourceDao tDatasourceDAO;
	@Override
	public List<TTable> getPage(int pageNum, int pageSize, TTable tTable) throws Exception {
		PageHelper.startPage(pageNum, pageSize);
		List<TTable> tables = null;
		TTableExample example = new TTableExample();
		Criteria criteria = example.createCriteria();
		if (tTable.gettId() != null) {
			criteria.andTIdEqualTo(tTable.gettId());
		}
		if (tTable.gettName() != null) {
			criteria.andTNameLike(tTable.gettName());
		}
		if (tTable.gettCnName() != null) {
			criteria.andTCnNameLike(tTable.gettName());
		}
		if (tTable.gettIsOnUse() != null) {
			criteria.andTIsOnUseEqualTo(tTable.gettIsOnUse());
		}
		if (tTable.gettOfTablespace() != null) {
			criteria.andTOfTablespaceEqualTo(tTable.gettOfTablespace());
		}
		if (tTable.gettDesc() != null) {
			criteria.andTDescLike(tTable.gettDesc());
		}
		if (tTable.gettSync() != null) {
			criteria.andTSyncEqualTo(tTable.gettSync());
		}
		if (tTable.gettDate() != null) {
			criteria.andTDateEqualTo(tTable.gettDate());
		}
		if (tTable.gettOfDatasource() != null) {
			criteria.andTOfDatasourceEqualTo(tTable.gettOfDatasource());
		}
		if (tTable.gettOfProject() != null) {
			criteria.andTOfProjectEqualTo(tTable.gettOfProject());
		}
		if (tTable.gettOfModule() != null) {
			criteria.andTOfModuleEqualTo(tTable.gettOfModule());
		}
		tables = this.tTableDao.selectByExample(example);
		return tables;
	}

	@Override
	public int deleteTableById(String id) throws Exception {
		return this.tTableDao.deleteByPrimaryKey(id);
	}

	@Override
	public TableCustom getTableCustom(String tableId) throws Exception {
		// 先去各个表取，组装TableCustom.返回
		TableCustom tableCustom = null;
		TTable tableInfo = this.tTableDao.selectByPrimaryKey(tableId);
		TConstraintsExample consExample = new TConstraintsExample();
		consExample.createCriteria().andConsRefTableIdEqualTo(tableId);
		List<ContraintsCustom> tableConstraints = this.tConstraintsDao.listContraintsCustoms(tableId);

		TTableFieldExample fieldExample = new TTableFieldExample();
		fieldExample.createCriteria().andFOfTableEqualTo(tableId);
		List<TTableField> tableFields = this.tTableFieldDao.selectByExample(fieldExample);
		List<IndexDTO> tableIndexs = this.tIndexDao.listTableIndexs(tableId);
		tableCustom = new TableCustom();
		tableCustom.setTableConstraints(tableConstraints);
		tableCustom.setTableFields(tableFields);
		tableCustom.setTableIndexs(tableIndexs);
		tableCustom.setTableInfo(tableInfo);
		return tableCustom;
	}
	
	@Override
	public DifTableDTO getDifTableDTO(String tableName, String datasourceId) throws Exception {
		DifTableDTO difTableDTO=null;
		TDatasource datasource=this.tDatasourceDAO.selectByPrimaryKey(datasourceId);
		if(datasource!=null){
			String url="jdbc:oracle:thin:@"+datasource.getdIp()+":"+datasource.getdPort()+":"+datasource.getdService();
			DbUtil dbUtil=new DbUtil(url,datasource.getdUsername(),datasource.getdPassword());;
			Connection con=dbUtil.getConnection();
			difTableDTO=new DifTableDTO();
			DatabaseMetaData dmd=con.getMetaData();
			ResultSet tableFieldRS=dmd.getColumns(null, datasource.getdUsername(), tableName, null);
			List<TTableField> tableFields=new ArrayList<TTableField>();			
			while(tableFieldRS.next()){
				TTableField field=new TTableField();
				field.setfName(tableFieldRS.getString("COLUMN_NAME"));
				field.setfType(tableFieldRS.getString("DATA_TYPE"));
				field.setfSize(tableFieldRS.getString("COLUMN_SIZE"));
				field.setfScale(tableFieldRS.getString("DECIMAL_DIGITS"));
				field.setfComment(tableFieldRS.getString("REMARKS"));
				tableFields.add(field);
			}
			difTableDTO.setTableFields(tableFields);
			//获取约束
			String getConsSQL="SELECT C.TABLE_NAME AS REF_CONS_TABLE,C.COLUMN_NAME AS CONS_REF_FIELD,B.COLUMN_NAME AS CONS_FIELD,A.CONSTRAINT_NAME AS CONS_NAME,A.CONSTRAINT_TYPE AS CONS_TYPE,A.TABLE_NAME AS CONS_TABLE_NAME,A.R_CONSTRAINT_NAME AS CONS_REF_CONS_NAME,A.DELETE_RULE FROM USER_CONSTRAINTS A"+
			        " LEFT JOIN USER_CONS_COLUMNS B ON A.CONSTRAINT_NAME=B.CONSTRAINT_NAME"+
			        " LEFT JOIN USER_CONS_COLUMNS C ON A.R_CONSTRAINT_NAME=C.CONSTRAINT_NAME"+
			        " WHERE A.TABLE_NAME=?";
			System.out.println(getConsSQL);
			PreparedStatement getConsSQLPS=con.prepareStatement(getConsSQL);
			getConsSQLPS.setString(1, tableName);
			ResultSet getConsRS=getConsSQLPS.executeQuery();
			List<ConstraintsDTO> tableConstraints=new ArrayList<ConstraintsDTO>();
			ConstraintsDTO cons=null;
			while(getConsRS.next()){
				String consName=getConsRS.getString("CONS_NAME");
				cons=null;
				for(ConstraintsDTO c:tableConstraints){
						if(c.getConsName().equals(consName)){
							cons=c;
							break;
						}
				}
				if(cons==null){
					cons=new ConstraintsDTO();
					cons.setConsName(consName);
					cons.setConsTableName(getConsRS.getString("CONS_TABLE_NAME"));
					cons.setConsRefConsName(getConsRS.getString("CONS_REF_CONS_NAME"));
					cons.setConsRefTableName(getConsRS.getString("REF_CONS_TABLE"));
					switch(getConsRS.getString("CONS_TYPE")){
						case "R":
							cons.setConsType("FK");
							break;
						case "P":
							cons.setConsType("PK");
							break;
						case "U":
							cons.setConsType("UNIQUE");
							break;
						default:
							;
					}
					tableConstraints.add(cons);
				}
				if(getConsRS.getString("CONS_FIELD")!=null){
					TTableField f=new TTableField();
					f.setfName(getConsRS.getString("CONS_FIELD"));
					cons.getConsField().add(f);
				}
				if(getConsRS.getString("CONS_REF_FIELD")!=null){
					TTableField f=new TTableField();
					f.setfName(getConsRS.getString("CONS_REF_FIELD"));
					cons.getRefConsField().add(f);
				}
			}
			difTableDTO.setTableConstraints(tableConstraints);
			//获取索引
			String getIndexSQL="SELECT A.INDEX_NAME AS I_NAME,A.INDEX_TYPE AS I_TYPE,A.TABLE_NAME AS I_TABLE_NAME,A.UNIQUENESS AS I_UNIQUE,B.COLUMN_NAME AS I_COL_NAME,B.DESCEND AS I_SORT,C.COLUMN_EXPRESSION AS I_EXPRESSION"
			+" FROM USER_INDEXES A"
			+" LEFT JOIN USER_IND_COLUMNS B ON A.INDEX_NAME=B.INDEX_NAME"
			+" LEFT JOIN USER_IND_EXPRESSIONS C ON C.INDEX_NAME=B.INDEX_NAME AND C.COLUMN_POSITION=B.COLUMN_POSITION"
			+ " WHERE A.TABLE_NAME=?";
			PreparedStatement getIndexPS=con.prepareStatement(getIndexSQL);
			getIndexPS.setString(1, tableName);
			System.out.println(getIndexSQL);
			ResultSet getIndexRS=getIndexPS.executeQuery();
			List<IndexDTO> indexList=new ArrayList<IndexDTO>();
			IndexDTO index=null;
			while(getIndexRS.next()){
				String indexName=getIndexRS.getString("I_TABLE_NAME");
				index=null;
				for (IndexDTO i:indexList){
					if(i.getiName().equals("I_NAME")){
						index=i;
					}
				}
				if(index==null){
					index=new IndexDTO();
					index.setiName(indexName);
					index.setiType(getIndexRS.getString("I_TYPE"));
					index.setIndexColCustomList(new ArrayList<IndexColumnsCustom>());
					indexList.add(index);
				}
				IndexColumnsCustom iCol=new IndexColumnsCustom();
				iCol.setSort(getIndexRS.getString("I_SORT"));
				if(iCol.getSort().equals("ASC")){
					iCol.setColName(getIndexRS.getString("I_COL_NAME"));
				}else{
					InputStream in=getIndexRS.getBinaryStream("I_EXPRESSION");
					 BufferedReader bf=new BufferedReader(new InputStreamReader(in,"UTF-8"));  
				     //最好在将字节流转换为字符流的时候 进行转码  
				     StringBuffer buffer=new StringBuffer();  
				     String line="";  
				     while((line=bf.readLine())!=null){  
				         buffer.append(line);  
				     }  
					iCol.setColName(buffer.toString());
				}
//				getIndexRS.getString("UNIQUENESS")
				index.getIndexColCustomList().add(iCol);
			}
			difTableDTO.setTableIndexs(indexList);
		}
		return difTableDTO;
	}

	@Override
	public List<TTable> getTableList() throws Exception {
		List<TTable> tableList;
		TTableExample example = new TTableExample();
		tableList = this.tTableDao.selectByExample(example);
		return tableList;
	}

	@Override
	@Transactional
	public void insertTable(TableCustom tableCustom) throws Exception {
		TTable table = tableCustom.getTableInfo();
		List<TTableField> fieldList = tableCustom.getTableFields();
		List<ContraintsCustom> cons = tableCustom.getTableConstraints();
		List<IndexDTO> indexs = tableCustom.getTableIndexs();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		table.settDate(mDate);
		table.settSync("3");
		this.tTableDao.insert(table);
		if (fieldList != null && fieldList.size() > 0)
			for (int i = 0; i < fieldList.size(); i++) {
				TTableField field = fieldList.get(i);
				field.setfOfTable(table.gettId());
				this.tTableFieldDao.insert(field);
			}
		if (cons != null && cons.size() > 0)
			for (int i = 0; i < cons.size(); i++) {
				ContraintsCustom con = cons.get(i);
				// 如是外键,有外键则根据约束关系去找consRefConsId设定后添加到约束表
				if (con.getConsRefTableId() != null && con.getConsType().equals("FK")) {
					TConstraintsExample example = new TConstraintsExample();
					example.createCriteria().andConsTableIdEqualTo(con.getConsRefTableId()).andConsTypeEqualTo("PK");
					List<TConstraints> refCon = this.tConstraintsDao.selectByExample(example);
					if (refCon != null && refCon.size() == 1) {
						con.setConsRefConsId(refCon.get(0).getConsId());
						con.setConsRefTableId(refCon.get(0).getConsTableId());
					}
				}
				con.setConsTableId(table.gettId());
				this.tConstraintsDao.insert(con);

				TTableField[] consFieldName = con.getConsFieldName();
				for (int j = 0; j < consFieldName.length; j++) {
					for (TTableField field : fieldList) {
						if (field.getfName().equals(consFieldName[j].getfName())) {
							TConsColumns consColumns = new TConsColumns();
							consColumns.setCcConsId(con.getConsId());
							consColumns.setCcTableId(table.gettId());
							consColumns.setCcTableFieldId(field.getfId());
							this.tConsColumnsDao.insert(consColumns);
							continue;
						}
					}
				}
			}
		if (indexs != null && indexs.size() > 0) {
			for (int i = 0; i < indexs.size(); i++) {
				IndexDTO indexDTO = indexs.get(i);
				indexDTO.setiOfTable(table.gettId());
				indexDTO.setiSyncState("3");// 已同步
				indexDTO.setiDate(mDate);
				this.tIndexDao.insert(indexDTO);
				List<IndexColumnsCustom> colsList = indexDTO.getIndexColCustomList();
				if (colsList != null && colsList.size() > 0)
					for (IndexColumnsCustom col : colsList) {
						for (TTableField field : fieldList) {
							if (field.getfName().equals(col.getColName())) {
								TIndexColumns tIndexColumns = new TIndexColumns();
								tIndexColumns.setColumnId(field.getfId());
								tIndexColumns.setSort(col.getSort());
								tIndexColumns.setIndexId(indexDTO.getiId());
								this.tIndexColumnsDAO.insert(tIndexColumns);
							}
						}
					}
			}
		}

	}

	/**
	 * 根据传入 的table进行判断是表信息、表字段、主键、外键、唯一约束、索引的修改对各个表进行操作 1：进行判断：原本的为空----传入的不为空
	 * ：新增 原本的不为空----传入的为空：删除 都不为空------进行循环
	 * 进行一次遍历（判断id是否为空，空则新增），多次（不为空判断是否相等，相等则更新，当j等于最后一个的时候 即传入的在旧的不存在进行删除）
	 */
	@Override
	@Transactional
	public void updateTable(TableCustom tableCustom) throws Exception {
		TTable table = tableCustom.getTableInfo();
		List<TTableField> fieldList = tableCustom.getTableFields();
		List<ContraintsCustom> consList = tableCustom.getTableConstraints();
		List<IndexDTO> indexList = tableCustom.getTableIndexs();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		TableCustom oldTableCustom = this.getTableCustom(table.gettId());
		if (oldTableCustom == null) {
			throw new RuntimeException();
		} else {
			this.tTableDao.updateByPrimaryKeySelective(table);
			List<TTableField> oldFieldList = oldTableCustom.getTableFields();
			for (int i = 0; i < oldFieldList.size(); i++) {
				TTableField oldField = oldFieldList.get(i);
				boolean findSame = false;
				for (int j = 0; j < fieldList.size(); j++) {
					TTableField newField = fieldList.get(j);
					if (newField.getfId() == null && i == 0) {// 新增
						// 寻找重名进行删除，意味着删除了原来的又新增同名的
						TTableFieldExample fieldExample = new TTableFieldExample();
						fieldExample.createCriteria().andFNameEqualTo(newField.getfName())
								.andFOfTableEqualTo(newField.getfOfTable());
						List<TTableField> sameNameFields = this.tTableFieldDao.selectByExample(fieldExample);
						if (sameNameFields != null && sameNameFields.size() > 0) {
							this.tTableFieldDao.deleteByPrimaryKey(sameNameFields.get(0).getfId());
						}
						this.tTableFieldDao.insert(newField);
						continue;
					} else if (oldField.getfId().equals(newField.getfId())) {// 修改
						this.tTableFieldDao.updateByPrimaryKey(newField);
						findSame = true;
						if (i == 0) {
							continue;
						} else {
							break;
						}
					}
				}
				if (!findSame) {
					this.tTableFieldDao.deleteByPrimaryKey(oldField.getfId());
				}
			}
			List<ContraintsCustom> oldConsList = oldTableCustom.getTableConstraints();
			if (oldConsList.size() > 0) {
				for (int i = 0; i < oldConsList.size(); i++) {
					ContraintsCustom oldCons = oldConsList.get(i);
					TConsColumnsExample example = new TConsColumnsExample();
					example.createCriteria().andCcConsIdEqualTo(oldCons.getConsId());
					this.tConsColumnsDao.deleteByExample(example);
					if (consList.size() > 0) {// 旧不为空、新不为空
						boolean findSame = false;
						for (int j = 0; j < consList.size(); j++) {
							ContraintsCustom cons = consList.get(j);
							if (cons.getConsId() == null && i == 0) {
								// 寻找重名进行删除，意味着删除了原来的又新增同名的
								// TConstraintsExample consExample=new
								// TConstraintsExample(); 需要修改表结构进行找出同名约束进行删除
								// consExample.createCriteria().andConsNameEqualTo(cons.getConsName()).and
								// List<TTableField>
								// sameNameFields=this.tTableFieldDao.selectByExample(fieldExample);
								// if(sameNameFields!=null&&sameNameFields.size()>0){
								// this.tTableFieldDao.deleteByPrimaryKey(sameNameFields.get(0).getfId());
								// }
								// 如是外键,有外键则根据约束关系去找consRefConsId设定后添加到约束表
								if (cons.getConsRefTableId() != null && cons.getConsType().equals("FK")) {
									TConstraintsExample example1 = new TConstraintsExample();
									example1.createCriteria().andConsTableIdEqualTo(cons.getConsRefTableId())
											.andConsTypeEqualTo("PK");
									List<TConstraints> refCon = this.tConstraintsDao.selectByExample(example1);
									if (refCon != null && refCon.size() == 1) {
										cons.setConsRefConsId(refCon.get(0).getConsId());
										cons.setConsRefTableId(refCon.get(0).getConsTableId());
									}
								}
								cons.setConsTableId(table.gettId());
								this.tConstraintsDao.insert(cons);
								TTableField[] consFieldName = cons.getConsFieldName();
								for (TTableField field : fieldList) {
									for (TTableField consField : consFieldName) {
										if (field.getfName().equals(consField.getfName())) {
											TConsColumns col = new TConsColumns();
											col.setCcConsId(cons.getConsId());
											col.setCcTableId(cons.getConsTableId());
											col.setCcTableFieldId(field.getfId());
											this.tConsColumnsDao.insert(col);
										}
									}
								}
								continue;
							} else if (oldCons.getConsId().equals(cons.getConsId())) {// 修改
								// 如是外键,有外键则根据约束关系去找consRefConsId设定后添加到约束表
								if (cons.getConsRefTableId() != null && cons.getConsType().equals("FK")) {
									TConstraintsExample example1 = new TConstraintsExample();
									example1.createCriteria().andConsTableIdEqualTo(cons.getConsRefTableId())
											.andConsTypeEqualTo("PK");
									List<TConstraints> refCon = this.tConstraintsDao.selectByExample(example1);
									if (refCon != null && refCon.size() == 1) {
										cons.setConsRefConsId(refCon.get(0).getConsId());
										cons.setConsRefTableId(refCon.get(0).getConsTableId());
									}
								}
								cons.setConsTableId(table.gettId());
								this.tConstraintsDao.updateByPrimaryKey(cons);
								TTableField[] consFieldName = cons.getConsFieldName();
								for (TTableField field : fieldList) {
									for (TTableField consField : consFieldName) {
										if (field.getfName().equals(consField.getfName())) {
											TConsColumns col = new TConsColumns();
											col.setCcConsId(cons.getConsId());
											col.setCcTableId(cons.getConsTableId());
											col.setCcTableFieldId(field.getfId());
											this.tConsColumnsDao.insert(col);
										}
									}
								}
								findSame = true;
								if (i == 0) {
									continue;
								} else {
									break;
								}
							}

						}
						if (!findSame) {
							this.tConstraintsDao.deleteByPrimaryKey(oldCons.getConsId());
						}
					} else { // 新传入的约束长度为空、而旧不空：全删
						for (int a = 0; a < oldConsList.size(); a++) {
							this.tConstraintsDao.deleteByPrimaryKey(oldConsList.get(a).getConsId());
						}
					}

				}
			} else {
				if (consList.size() > 0)
					for (int j = 0; j < consList.size(); j++) {
						ContraintsCustom cons = consList.get(j);
						// 如是外键,有外键则根据约束关系去找consRefConsId设定后添加到约束表
						if (cons.getConsRefTableId() != null && cons.getConsType().equals("FK")) {
							TConstraintsExample example1 = new TConstraintsExample();
							example1.createCriteria().andConsTableIdEqualTo(cons.getConsRefTableId())
									.andConsTypeEqualTo("PK");
							List<TConstraints> refCon = this.tConstraintsDao.selectByExample(example1);
							if (refCon != null && refCon.size() == 1) {
								cons.setConsRefConsId(refCon.get(0).getConsId());
								cons.setConsRefTableId(refCon.get(0).getConsTableId());
							}
						}
						cons.setConsTableId(table.gettId());
						this.tConstraintsDao.insert(cons);
						TTableField[] consFieldName = cons.getConsFieldName();
						for (TTableField field : consFieldName) {
							TConsColumns col = new TConsColumns();
							col.setCcConsId(cons.getConsId());
							col.setCcTableId(cons.getConsTableId());
							col.setCcTableFieldId(field.getfId());
							this.tConsColumnsDao.insert(col);
						}
					}
			}
			List<IndexDTO> oldIndexList = oldTableCustom.getTableIndexs();
			if (oldIndexList != null && oldIndexList.size() > 0) {
				for (int i = 0; i < oldIndexList.size(); i++) {
					IndexDTO oldIndexDTO = oldIndexList.get(i);
					TIndexColumnsExample exampleIndexCol=new TIndexColumnsExample();
					exampleIndexCol.createCriteria().andIndexIdEqualTo(oldIndexDTO.getiId());
					this.tIndexColumnsDAO.deleteByExample(exampleIndexCol);
					if (indexList != null && indexList.size() > 0) {// 旧不为空、新不为空
						boolean findSame=false;
						for (int j = 0; j < indexList.size(); j++) {
							IndexDTO indexDTO = indexList.get(j);
							if (indexDTO.getiId() == null && i == 0) {// 新增
								indexDTO.setiOfTable(table.gettId());
								indexDTO.setiSyncState("3");// 已同步
								indexDTO.setiDate(mDate);
								this.tIndexDao.insert(indexDTO);
								List<IndexColumnsCustom> colsList = indexDTO.getIndexColCustomList();
								if (colsList != null && colsList.size() > 0)
									for (IndexColumnsCustom col : colsList) {
										for (TTableField field : fieldList) {
											if (field.getfName().equals(col.getColName())) {
												TIndexColumns tIndexColumns = new TIndexColumns();
												tIndexColumns.setColumnId(field.getfId());
												tIndexColumns.setSort(col.getSort());
												tIndexColumns.setIndexId(indexDTO.getiId());
												this.tIndexColumnsDAO.insert(tIndexColumns);
											}
										}
									}
								continue;
							} else if (indexDTO.getiId().equals(oldIndexDTO.getiId())) {// 修改
								this.tIndexDao.updateByPrimaryKeySelective(indexDTO);
								List<IndexColumnsCustom> colsList = indexDTO.getIndexColCustomList();
								if (colsList != null && colsList.size() > 0)
									for (IndexColumnsCustom col : colsList) {
										for (TTableField field : fieldList) {
											if (field.getfName().equals(col.getColName())) {
												TIndexColumns tIndexColumns = new TIndexColumns();
												tIndexColumns.setColumnId(field.getfId());
												tIndexColumns.setSort(col.getSort());
												tIndexColumns.setIndexId(indexDTO.getiId());
												this.tIndexColumnsDAO.insert(tIndexColumns);
											}
										}
									}
								findSame=true;
								if (i == 0) {
									continue;
								} else {
									break;
								}
							}
							
						}
						if(!findSame){
								this.tIndexDao.deleteByPrimaryKey(oldIndexDTO.getiId());
						}
					} else {// 旧不为空、新为空
						for (int a = 0; a < oldIndexList.size(); a++) {
							this.tIndexDao.deleteByPrimaryKey(oldIndexList.get(a).getiId());
						}
					}
				}
			} else {// 旧为空、新不为空
				if (indexList != null && indexList.size() > 0) {
					for (int i = 0; i < indexList.size(); i++) {
						IndexDTO indexDTO = indexList.get(i);
						indexDTO.setiOfTable(table.gettId());
						indexDTO.setiSyncState("3");// 已同步
						indexDTO.setiDate(mDate);
						this.tIndexDao.insert(indexDTO);
						List<IndexColumnsCustom> colsList = indexDTO.getIndexColCustomList();
						if (colsList != null && colsList.size() > 0)
							for (IndexColumnsCustom col : colsList) {
								for (TTableField field : fieldList) {
									if (field.getfName().equals(col.getColName())) {
										TIndexColumns tIndexColumns = new TIndexColumns();
										tIndexColumns.setColumnId(field.getfId());
										tIndexColumns.setSort(col.getSort());
										tIndexColumns.setIndexId(indexDTO.getiId());
										this.tIndexColumnsDAO.insert(tIndexColumns);
									}
								}
							}
					}
				}
			}
		}

	}

	@Override
	public List<TTableField> getTableFieldList(String tableId) throws Exception {
		TTableFieldExample example = new TTableFieldExample();
		com.dhcc.dic.entity.TTableFieldExample.Criteria creiteria = example.createCriteria();
		creiteria.andFOfTableEqualTo(tableId);
		return this.tTableFieldDao.selectByExample(example);
	}

	@Override
	public List<SysOption> getSysOptionList() throws Exception {
		return this.tTableDao.getSysOptionList();
	}

	@Override
	public int saveFuncType(TFuncType tFuncType) throws Exception {
		return this.tFuncTypeDao.insert(tFuncType);

	}

	@Override
	public List<TFuncType> getFuncTypesByPage(int page, int rows, TFuncType tFuncType) throws Exception {
		PageHelper.startPage(page, rows);
		List<TFuncType> funcTypes = null;
		TFuncTypeExample example = new TFuncTypeExample();
		com.dhcc.dic.entity.TFuncTypeExample.Criteria criteria = example.createCriteria();
		if (tFuncType.getfId() != null) {
			criteria.andFIdEqualTo(tFuncType.getfId());
		}
		if (tFuncType.getfName() != null) {
			criteria.andFNameLike(tFuncType.getfName());
		}
		funcTypes = this.tFuncTypeDao.selectByExample(example);
		return funcTypes;
	}

	@Override
	public List<TFuncType> listFuncType() throws Exception {
		return this.tFuncTypeDao.selectByExample(new TFuncTypeExample());
	}

	@Override
	public int removeFuncTypeById(String id) throws Exception {
		return this.tFuncTypeDao.deleteByPrimaryKey(id);
	}

	@Override
	public TFuncType getFuncType(String id) throws Exception {
		return this.tFuncTypeDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateFuncType(TFuncType tFuncType) throws Exception {
		return this.tFuncTypeDao.updateByPrimaryKey(tFuncType);
	}

	@Override
	public int saveCtrlType(TCtrlType tCtrlType) throws Exception {
		return this.tCtrlTypeDao.insert(tCtrlType);

	}

	@Override
	public int removeCtrlTypeById(String id) throws Exception {
		return this.tCtrlTypeDao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCtrlType(TCtrlType tCtrlType) throws Exception {
		return this.tCtrlTypeDao.updateByPrimaryKey(tCtrlType);
	}

	@Override
	public TCtrlType getCtrlType(String id) throws Exception {
		return this.tCtrlTypeDao.selectByPrimaryKey(id);
	}

	@Override
	public List<TCtrlType> getCtrlTypesByPage(int page, int rows, TCtrlType tCtrlType) throws Exception {
		PageHelper.startPage(page, rows);
		List<TCtrlType> ctrlTypes = null;
		TCtrlTypeExample example = new TCtrlTypeExample();
		com.dhcc.dic.entity.TCtrlTypeExample.Criteria criteria = example.createCriteria();
		if (tCtrlType.getcId() != null) {
			criteria.andCIdEqualTo(tCtrlType.getcId());
		}
		if (tCtrlType.getcName() != null) {
			criteria.andCNameLike("%" + tCtrlType.getcName() + "%");
		}
		ctrlTypes = this.tCtrlTypeDao.selectByExample(example);
		return ctrlTypes;
	}

	@Override
	public List<TCtrlType> listCtrlType() throws Exception {
		return this.tCtrlTypeDao.selectByExample(new TCtrlTypeExample());
	}


}
