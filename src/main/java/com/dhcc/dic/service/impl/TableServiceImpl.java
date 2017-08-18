package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TConsColumnsDao;
import com.dhcc.dic.dao.TConstraintsDao;
import com.dhcc.dic.dao.TCtrlTypeDao;
import com.dhcc.dic.dao.TFuncTypeDao;
import com.dhcc.dic.dao.TIndexColumnsDAO;
import com.dhcc.dic.dao.TIndexDao;
import com.dhcc.dic.dao.TTableDao;
import com.dhcc.dic.dao.TTableFieldDao;
import com.dhcc.dic.entity.ContraintsCustom;
import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TConsColumns;
import com.dhcc.dic.entity.TConstraints;
import com.dhcc.dic.entity.TConstraintsExample;
import com.dhcc.dic.entity.TCtrlType;
import com.dhcc.dic.entity.TCtrlTypeExample;
import com.dhcc.dic.entity.TFuncType;
import com.dhcc.dic.entity.TFuncTypeExample;
import com.dhcc.dic.entity.TIndexColumnsKey;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableExample;
import com.dhcc.dic.entity.TTableExample.Criteria;
import com.dhcc.dic.entity.TTableField;
import com.dhcc.dic.entity.TTableFieldExample;
import com.dhcc.dic.entity.TableCustom;
import com.dhcc.dic.service.TableService;
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
	public void addTable(String parentMenuId, TTable tTable) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tTable.settDate(mDate);
		this.tTableDao.insert(tTable);
		// this
	}

	@Override
	public int deleteTableById(String id) throws Exception {
		return this.tTableDao.deleteByPrimaryKey(id);
	}

	@Override
	public TTable getTableById(String id) throws Exception {
		// TODO Auto-generated method stub

		return this.tTableDao.selectByPrimaryKey(id);
	}

	@Override
	public void editTable(TTable tTable) throws Exception {
		// TODO Auto-generated method stub
		this.tTableDao.updateByPrimaryKeySelective(tTable);

	}

	@Override
	public List<TTable> getTableList() throws Exception {
		List<TTable> tableList;
		TTableExample example = new TTableExample();
		Criteria criteria = example.createCriteria();
		criteria.andTIdNotEqualTo("-1");
		tableList = this.tTableDao.selectByExample(example);
		return tableList;
	}

	@Override
	@Transactional
	public void addOrEditTable(TableCustom tableCustom) throws Exception {
		TTable table = tableCustom.getTableInfo();
		List<TTableField> fieldList = tableCustom.getTableFields();
		List<ContraintsCustom> cons = tableCustom.getTableConstraints();
		List<IndexDTO> indexs=tableCustom.getTableIndexs();
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
					example.createCriteria().andConsTableIdEqualTo(con.getConsRefTableId()).andConsTypeEqualTo("FK");
					List<TConstraints> refCon = this.tConstraintsDao.selectByExample(example);
					if (refCon != null && refCon.size() == 1) {
						con.setConsRefConsId(refCon.get(0).getConsId());
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
		if(indexs!=null&&indexs.size()>0){
			for(int i=0;i<indexs.size();i++){
				IndexDTO indexDTO=indexs.get(i);
				indexDTO.setiOfTable(table.gettId());
				indexDTO.setiSyncState("3");//已同步
				indexDTO.setiDate(mDate);
				this.tIndexDao.insert(indexDTO);
				List<String> refColNames=indexDTO.getRefColumns();
				for(String name:refColNames){
					for (TTableField field : fieldList) {
						if (field.getfName().equals(name)) {
							TIndexColumnsKey refCol=new TIndexColumnsKey(indexDTO.getiId(),field.getfId());
							this.tIndexColumnsDAO.insert(refCol);
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
			criteria.andCNameLike("%"+tCtrlType.getcName()+"%");
		}
		ctrlTypes = this.tCtrlTypeDao.selectByExample(example);
		return ctrlTypes;
	}
	@Override
	public List<TCtrlType> listCtrlType() throws Exception {
		return this.tCtrlTypeDao.selectByExample(new TCtrlTypeExample());
	}
	
}
