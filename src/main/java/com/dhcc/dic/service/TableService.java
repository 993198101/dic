package com.dhcc.dic.service;

import java.util.List;

import com.dhcc.dic.entity.DifTableDTO;
import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TCtrlType;
import com.dhcc.dic.entity.TFuncType;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableField;
import com.dhcc.dic.entity.TableCustom;

public interface TableService {
	 List<TTable> getPage(int pageNum,int pageSize,TTable tTable) throws Exception;
	 int deleteTableById(String id) throws Exception;
	 List<TTable> getTableList() throws Exception;
	 void insertTable(TableCustom tableCustom) throws Exception;
	 void updateTable(TableCustom tableCustom) throws Exception;
	 TableCustom getTableCustom(String tableId) throws Exception;
	 DifTableDTO getDifTableDTO(String tableName,String datasourceId) throws Exception;
	 List<TTableField> getTableFieldList(String tableId) throws Exception;
	 List<SysOption> getSysOptionList() throws Exception;
	 
	 int saveFuncType(TFuncType tFuncType) throws Exception;
	 List<TFuncType> listFuncType() throws Exception;
	 List<TFuncType> getFuncTypesByPage(int page,int rows,TFuncType tFuncType) throws Exception;
	 TFuncType getFuncType(String id) throws Exception;
	 int removeFuncTypeById(String id) throws Exception;
	 int updateFuncType(TFuncType tFuncType) throws Exception;
	 
	 int saveCtrlType(TCtrlType tCtrlType) throws Exception;
	 List<TCtrlType> listCtrlType() throws Exception;
	 List<TCtrlType> getCtrlTypesByPage(int page,int rows,TCtrlType tCtrlType) throws Exception;
	 TCtrlType getCtrlType(String id) throws Exception;
	 int removeCtrlTypeById(String id) throws Exception;
	 int updateCtrlType(TCtrlType tCtrlType) throws Exception;
	 
}
