$(function(){
	if (getQueryString("type") != null) {// 如果是编辑到此页面，加载值
		var type = getQueryString("type");
		if(type=="0"){
			if (getQueryString("tableId") != null) {// 只有数据字典系统存在、数据库不存在
				tableId = getQueryString("tableId");
				loadSystem(tableId);
			}
		}else if(type=="1"){
			if (getQueryString("tableName") != null&&getQueryString("datasourceId") != null) {// 只有数据库存在、数据字典不存在
				datasourceId=getQueryString("datasourceId");
				tableName = getQueryString("tableName");
				loadDatabase(datasourceId,tableName);
			}
		}else if(type=="2"){
			if (getQueryString("tableId") != null) {//都存在属性有差异
				tableId = getQueryString("tableId");
				loadSystem(tableId);
			}
			if (getQueryString("tableName") != null&&getQueryString("datasourceId") != null) {// 只有数据库存在、数据字典不存在
				datasourceId=getQueryString("datasourceId");
				tableName = getQueryString("tableName");
				loadDatabase(datasourceId,tableName);
			}
		}
	}
});
var datasourceId="-1";
var tableName=undefined;
var tableId="-1";
var getTableCustomUrl="../table/getTableCustom";
var getDifTableCustomUrl="../table/getDifTableCustom";
function loadDatabase(datasourceId,tableName){
	ajax(getDifTableCustomUrl+"?tableName="+tableName+"&datasourceId="+datasourceId).done(function(data){
		if(data.status=="success"){
//			var tableInfo=data.tableCustom.tableInfo;
			var difTablePK=null;
			var difTableFKList=[];
			var difTableUniqueList=[];
			for (var j = 0; j < data.tableCustom.tableConstraints.length; j++) {
				var cons = data.tableCustom.tableConstraints[j];
				switch (cons.consType) {
				case "PK":// 主键赋值
					$('#difTablePKForm').form('load', {
						difPKName : cons.consName
					});// 表单赋名
					difTablePK = cons; // model赋值
					break;
				case "FK":
					difTableFKList.push(cons);
					break;
				case "Unique":
					difTableUniqueList.push(cons);
					break;
				}
			}
			modelToViewDifPk(data.tableCustom.tableFields,difTablePK);// 勾选下方,根据pk和字段初始化表单与字段勾选
		}else{
			$.message.alert("加载差异数据","系统出现异常","danger");
		}
		
	});
}
function loadSystem(tableId){
	ajax(getTableCustomUrl+"?tableId="+tableId).done(function(data){
		if(data.status=="success"){
			var tableInfo=data.tableCustom.tableInfo;
			var tablePK=null;
			var tableFKList=[];
			var tableUniqueList=[];
			for (var j = 0; j < data.tableCustom.tableConstraints.length; j++) {
				var cons = data.tableCustom.tableConstraints[j];
				switch (cons.consType) {
				case "PK":// 主键赋值
					$('#tablePKForm').form('load', {
						PKName : cons.consName,consId:cons.consId
					});// 表单赋名
					tablePK = cons; // model赋值
					break;
				case "FK":
					tableFKList.push(cons);
					break;
				case "Unique":
					tableUniqueList.push(cons);
					break;
				}
			}
			modelToViewPK(data.tableCustom.tableFields,tablePK);// 勾选下方,根据pk和字段初始化表单与字段勾选
		}else{
			$.message.alert("加载差异数据","系统出现异常","danger");
		}
	});
}

function modelToViewPK(tableFieldList,tablePK){
	var tablePKColumnsDatagrid = convertorPK(tableFieldList, tablePK);
	$('#tablePKColumnsDatagrid').datagrid('loadData', tablePKColumnsDatagrid);
	var rows = $('#tablePKColumnsDatagrid').datagrid('getRows');
	for (var i = 0; i < rows.length; i++) {
		var row = rows[i];
		var index = $('#tablePKColumnsDatagrid').datagrid('getRowIndex', row);
		if(tablePK!=null&&tablePK.consFieldName!=null)
		for (var j = 0; j < tablePK.consFieldName.length; j++) {
			if (tablePK.consFieldName[j].fName == row.columns) {
				$('#tablePKColumnsDatagrid').datagrid('checkRow', index);
			}
		}
	}
}
function modelToViewDifPk(difTableFieldList,difTablePK){
	var difTablePKColumnsDatagrid = convertorPK(difTableFieldList, difTablePK);
	$('#difTablePKColumnsDatagrid').datagrid('loadData', difTablePKColumnsDatagrid);
	var rows = $('#difTablePKColumnsDatagrid').datagrid('getRows');
	for (var i = 0; i < rows.length; i++) {
		var row = rows[i];
		var index = $('#difTablePKColumnsDatagrid').datagrid('getRowIndex', row);
		if(difTablePK!=null&&difTablePK.consField!=null)
		for (var j = 0; j < difTablePK.consField.length; j++) {
			if (difTablePK.consField[j].fName == row.columns) {
				$('#difTablePKColumnsDatagrid').datagrid('checkRow', index);
			}
		}
	}
}
function convertorPK(tableFieldList, tablePK){
	var datas = [];
	if (tableFieldList != null)
		for (var i = 0; i < tableFieldList.length; i++) {
			var data = {
				'columns' : tableFieldList[i].fName
			};
			if (tablePK != null) {
				if (tablePK.consFieldName == undefined|| tablePK.consFieldName == null) {
					tablePK.consFieldName = new Array();
				}
				var tablePKNames = tablePK.consFieldName.concat();// 将外键名数组 复制
				// consFieldName数组中有的
				// 画对号
				for (var j = 0; j < tablePKNames.length; j++) {
					if (tableFieldList[i].fName == tablePKNames[j].fName) {
						data.checked = true;
					}
				}
			}
			datas.push(data);
		}
	return datas;
}
function onSelect(){
	
}
function PKOnloadSuccess(){
	
}