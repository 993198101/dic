/**
 * Created by ChenShuai on 2017/7/27 0011.
 */
$(function() {
	$("#w").window('close');
	$("#ctrlTypeModel").window('close');
	if (getQueryString("moduleId") != null) {
		queryParams.moduleId = getQueryString("moduleId");
	}
	if (getQueryString("projectId") != null) {
		queryParams.projectId = getQueryString("projectId");
	}
	if (getQueryString("datasourceId") != null) {
		queryParams.datasourceId = getQueryString("datasourceId");
	}
	if (getQueryString("tableId") != null) {// 如果是编辑到此页面，加载值
		tableId = getQueryString("tableId");
		loadEdit(tableId);
	}
	// 加载下拉
	ajax("../table/getStableOptionList?projectId=" + queryParams.projectId
					+ "&datasourceId=" + queryParams.datasourceId).done(
			function(data) {
				$(".yes_no_option_list").combobox('loadData', data.yesOrNo);
				$(".module_option_list").combobox('loadData', data.moduleList);
				$(".tablespace-option-list").combobox('loadData',data.tablespaceList);
				$(".col-type-option-list").combobox('loadData',data.colTypeList);
			}).fail(function(error) {
		$.messager.alert("加载下拉框", "加载下拉框失败", "danger");
	});

});
var tableId = "-1";
var tableName = "newTable"
var addOrEditTableUrl = "../table/addOrEditTable";
var firstCLickPk = true;
var queryParams = {};
function back() {
	$("#w").window('close');
}
// 加载字段tableField的操作按钮： 编辑、删除
function button(value, row, index) {
	return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editTableField("
			+ row.rowId
			+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' type='button' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteTableField("
			+ row.rowId + ");'>删除</button>";
}
// 加载table数据
var loadEditUrl = "../table/getTableCustom"
function loadEdit(tableId) {
	ajax(loadEditUrl + "?tableId=" + tableId).done(function(data) {
		console.log(data);
		// 表信息赋值
		$("#tableInfoForm").form('load', data.tableCustom.tableInfo);
		// 字段赋值
		tableFieldList = data.tableCustom.tableFields;
		tableFieldListBackup = tableFieldList.concat(); // 数组复制
		var i = 0;
		for (i = 0; i < tableFieldList.length; i++) {
			tableFieldList[i].rowId = i;
		}
		tableFieldNextId = i;
		$('#tableFieldDatagrid').datagrid('loadData', {
			"rows" : tableFieldList,
			"total" : tableFieldList.length
		});
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
		modelToViewPK();// 勾选下方,根据pk和字段初始化表单与字段勾选
		var b=0;
		for (b=0;b<tableFKList.length;b++){
			tableFKList[b].rowId=b;
		}
		rowIdFK=b;
		$('#tableFKDatagrid').datagrid('loadData', tableFKList);
		reSelectFK();
		var c=0;
		for (c=0;c<tableUniqueList.length;c++){
			tableUniqueList[c].rowId=c;
		}
		rowIdUnique=c;
		$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
		reSelectUnique();
		// 外键赋值
		// 唯一约束赋值
		// 索引页赋值
		tableIndexList = data.tableCustom.tableIndexs;
		var a=0;
		for (a=0;a<tableIndexList.length;a++){
			tableIndexList[a].indexRowId=a;
		}
		indexRowId=a;
		$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
		reSelectIndex();
	}).fail(function(error) {
		$.messager.alert("表信息加载", "表信息加载失败，错误码" + error.status, "danger");
	});
}
function onSelect(title, index) {
	switch (title) {
		case "外键管理":
			$("#checkboxFK").children(".datagrid-header-check").children("input[type='checkbox']")[0].disabled = true;
		break;
		case "唯一索引管理":
		break;
	}
	tableName=$("#tableName").textbox('getValue');
}
function tableFieldListChange() {
	//--------------------------主键-----------------------
	// 字段改变修改主键选择项
	var tableFieldNames=[];
	for(var i=0;i<tableFieldList.length;i++){
		tableFieldNames.push(tableFieldList[i].fName);
	}
	//如果主键包含的字段不匹配先有字段，清空主键
	if(tablePK!=null)
	if(tablePK.consFieldName!=null&&tablePK.consFieldName!=undefined&&tablePK.consFieldName.length>0){
		for(var i=0;i<tablePK.consFieldName.length;i++){
			if($.inArray(tablePK.consFieldName[i].fName,tableFieldNames)==-1){
				$("#PKName").textbox('setValue','');
			}
		}
	}
	tablePKColumnsDatagrid = convertorPK(tableFieldList, tablePK);
	$('#tablePKColumnsDatagrid').datagrid('loadData', tablePKColumnsDatagrid);
	//--------------------------外键-----------------------
	if(tableFKList.length>0){
		for(var i=0;i<tableFKList.length;i++){
			var consFieldNameList=tableFKList[i].consFieldName;
			for(var j=0;j<consFieldNameList.length;j++){
				var consFieldName=consFieldNameList[j].fName;
				if($.inArray(consFieldName,tableFieldNames)==-1){
					selectFK = findTableFk(tableFKList[i].rowId);
					removeTableFK();
				}
			}
		}
	}
	reLoadTableFKColumnsDatagrid(tableFieldList, selectFK);
	//--------------------------唯一约束-----------------------
	if(tableUniqueList.length>0){
		for(var i=0;i<tableUniqueList.length;i++){
			var consFieldNameList=tableUniqueList[i].consFieldName;
			for(var j=0;j<consFieldNameList.length;j++){
				var consFieldName=consFieldNameList[j].fName;
				if($.inArray(consFieldName,tableFieldNames)==-1){
					selectUnique = findTableUnique(tableUniqueList[i].rowId);
					removeUnique();
				}
			}
		}
	}
	reLoadTableUniqueColumnsDatagrid(tableFieldList, selectUnique);
	//--------------------------索引-----------------------
	if(tableIndexList.length>0){
		for(var i=0;i<tableIndexList.length;i++){
			var consFieldNameList=tableIndexList[i].indexColCustomList;
			for(var j=0;j<consFieldNameList.length;j++){
				var consFieldName=consFieldNameList[j].colName;
				if($.inArray(consFieldName,tableFieldNames)==-1){
					selectIndex = findTableIndex(tableIndexList[i].indexRowId);
					removeTableIndex();
				}
			}
		}
	}
	reLoadTableIndexColumnsDatagrid(tableFieldList, selectIndex);
}
/**
 * 
 * 主键的管理的js开始
 */
var tablePK = null;
function convertorPK(tableFieldList, tablePK) {
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
function PKOnloadSuccess(data) {
	var rows = data.rows;
	for (var i = 0; i < rows.length; i++) {
		var index = $('#tablePKColumnsDatagrid').datagrid('getRowIndex',
				rows[i]);
		if (rows[i].checked) {
			$('#tablePKColumnsDatagrid').datagrid('checkRow', index);
		}
	}
}
function viewToModelPK() {
	var selectedRows = $('#tablePKColumnsDatagrid').datagrid('getChecked');
	if (selectedRows != undefined && selectedRows != null
			& selectedRows.length > 0) {
		tablePK = {
			consId:$('#tablePKForm').serializeObject().consId==""?null:$('#tablePKForm').serializeObject().consId,
			consName : null,
			consType : "PK",
			consTableId:tableId,
			consFieldName : [],
			consRefTableId : null,
			refConsFieldId : [],
			consIsReal : 'REAL'
		}
		tablePK.consName = $('#tablePKForm').serializeObject().PKName;
		for (var i = 0; i < selectedRows.length; i++) {
			tablePK.consFieldName.push({
				"fName" : selectedRows[i].columns
			});
		}
	} else {
		tablePK = null;
	}
	return tablePK;
}
function modelToViewPK() {
	tablePKColumnsDatagrid = convertorPK(tableFieldList, tablePK);
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
/**
 * 
 * 主键的管理的js结束
 */
function submitForm() {
	// 一获取表信息、字段、主键、外键、唯一约束、索引判断是否合法，组成json提交
	if ($('#tableInfoForm').form('enableValidation').form('validate') == false) {
		return false;
	}
	var tableInfo = $('#tableInfoForm').serializeObject(); // tableInfo页的form表单
	if(queryParams.datasourceId!=null&&queryParams.datasourceId!=undefined)
	tableInfo.tOfDatasource = queryParams.datasourceId;
	if(queryParams.projectId!=null&&queryParams.projectId!=undefined)
	tableInfo.tOfProject = queryParams.projectId;
	if(queryParams.moduleId!=null&&queryParams.moduleId!=undefined)
	tableInfo.tOfModule = queryParams.moduleId;
	tableInfo.tId=tableId;
	var tableConstraints = new Array();
	if (tableFKList.length > 0)
		tableConstraints = tableConstraints.concat(tableFKList);
	tablePK = viewToModelPK();
	if (tablePK != null) {
		tableConstraints.push(tablePK);
	}
	if (tableUniqueList.length > 0) {
		tableConstraints = tableConstraints.concat(tableUniqueList);
	}
	if (tableIndexList.length > 0) {
		for (var i = 0; i < tableIndexList.length; i++) {
			tableIndexList[i].iOfDatasource = queryParams.datasourceId;
			tableIndexList[i].iOfProject = queryParams.projectId;
			tableIndexList[i].iOfModule = queryParams.moduleId;
		}
	}
	var formJson = {
		tableInfo : tableInfo,
		tableFields : tableFieldList,
		tableConstraints : tableConstraints,
		tableIndexs : tableIndexList
	}
//	 console.log(formJson);
//	 return false;
	ajax(addOrEditTableUrl, JSON.stringify(formJson), 'post').done(
			function(data) {
				if (data.status == "failure") {
					if(tableId=="-1"){
						$.messager.alert("新增表", "新增表失败", "danger");
					}else{
						$.messager.alert("修改表", "修改表失败", "danger");
					}
				} else {
					if(tableId=="-1"){
						parent.$.messager.alert("新增表", "新增表成功", "success");
						parent.$('#dataGrid').datagrid('reload');
						parent.$('#w').window('close');
					}else{
						location.reload();
					}
					
				}
			});
}

/**
 * tableInfo tab 页的js在此开始
 */
var getTableInfoUrl = "/table/getTableInfos"

/**
 * tableInfo tab 页的js在此结束
 */

/**
 * tableField tab 页的js在此开始
 */

// 字段新增，暂不同步到数据库，当表的新建或修改完成的时才去进行获取字段的信息进行新建。
var tableFieldList = [];
var tableFieldListBackup = tableFieldList.concat();
var getTableFieldAllUrl = "../table/getTableFields";
var tableFieldParams = {};
var isEdit = false; // 用来判断 字段的弹出是编辑还是新增操作
var tableFieldNextId = 0; // 由于暂时不进入数据库，所以用序号来标识 各个行，新增时加+，如果是编辑
// 此值的起始值变成最大的fId+1

// 第一次编辑表时，读取各个字段.对各个字段的进行用 rowId做唯一标识，加载datagrid

// 重新加载datagrid ，之后刷新页面操作，用本地数据进行
function nexLoadTableField() {
	$('#tableFieldDatagrid').datagrid('loadData', {
		"rows" : tableFieldList,
		"total" : tableFieldList.length
	});
}
// 新增字段，由于不直接进入数据库，设置rowId到页面 隐藏表单域
function addTableField() {
	$('#addTableFiledForm').form('load', {
		"rowId" : tableFieldNextId,
		"fOfTable":tableId
	});
	$("#w").window('open');
}
// 新增或修改字段的提交，用isEdit进行判断，新增时【rowId++：tableFieldNextId++】
// 都是对tableFieldList进行操作，最后直接使用tableFieldList;
function submitTableFieldForm() {
	var res = $('#addTableFiledForm').form('enableValidation').form('validate');
	var tableFieldJson = $('#addTableFiledForm').serializeObject();
	if (res == true) {
		if (isEdit == false) {
			tableFieldNextId++;
			for (var i = 0; i < tableFieldListBackup.length; i++) {
				if (tableFieldListBackup[i].fName == tableFieldJson.fName) {
					$.messager.alert("提示", "字段名不能重复", "danger");
					return false;
				}
			}
			tableFieldListBackup.push(tableFieldJson);
		} else {
			for (var i = 0; i < tableFieldListBackup.length; i++) {
				if (tableFieldListBackup[i].rowId == tableFieldJson.rowId) {
					tableFieldListBackup[i] = tableFieldJson;
				}
			}
		}
		tableFieldList = tableFieldListBackup.concat(); // 树组复制
		nexLoadTableField();
		$('#w').window('close');
		tableFieldListChange();
		isEdit = false;
	} else {
		$.messager.alert("添加字段", "失败,表单验证未通过", "danger");
	}
}
function test() {
	console.log(tableFieldList);
	console.log(tableFieldListBackup);
}
// 修改 字段，操作tableFieList
function editTableField(id) {
	var formJson = null;
	for (var i = 0; i < tableFieldListBackup.length; i++) {
		if (tableFieldListBackup[i].rowId == id) {
			formJson = tableFieldListBackup[i];
		}
	}
	tableFieldList = tableFieldListBackup.concat();
	$('#w').window('open');
	$('#addTableFiledForm').form('load', formJson);
	tableFieldListChange();
	isEdit = true;
}
// 删除字段，操作tableFieList
function deleteTableField(id) {
	var e=window.event || arguments.callee.caller.arguments[0];
	e.stopPropagation();
	for (var i = 0; i < tableFieldListBackup.length; i++) {
		if (tableFieldListBackup[i].rowId == id) {
			tableFieldListBackup.splice(i, 1);
		}
	}
	tableFieldList = tableFieldListBackup.concat();
	nexLoadTableField();
	tableFieldListChange();
}

// 字段查询,特别的删除元素 i--
function queryTableField() {
	tableFieldList = tableFieldListBackup.concat();
	for (var i = 0; i < tableFieldList.length; i++) {
		if (tableFieldList[i].fName != $('#fName').textbox('getValue')
				&& $('#fName').textbox('getValue') != "") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fDataElement != $('#fDataElement').combobox(
				'getValue')
				&& $('#fDataElement').combobox('getValue') != "") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fIsSuitQuery != $('#fIsSuitQuery').combobox(
				'getValue')
				&& $('#fIsSuitQuery').combobox('getValue') != "") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fCtrlType != $('#fCtrlType').combobox('getValue')
				&& $('#fCtrlType').combobox('getValue') != "") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
	}
	nexLoadTableField();
}

function openCtrlTypeModel() {
	$('#ctrlTypeModel').window('open');

}
function openFuncTypeModel() {
	$('#funcTypeModel').window('open');

}

/**
 * tableField tab 页的js在此结束
 */
/**
 * tablePK tab 页的js在此开始
 */
var getTablePKUrl = "table/getTablePKs";

/**
 * tablePK tab 页的js在此结束
 */

/**
 * tableFK tab 页的js在此开始
 * 
 * 新增 -》
 * 增加list-reload上方--清空关联表的选择项--清空关联列的model--根据选择的FK，reload下方，勾选下方（注意为了避免递归，进行判断此时下方页面已被勾选，不进行重复勾选）.
 * 勾选下方-》勾选下方，设置model，reload上方，选择上方的操作行，reload下方
 * ，勾选下方（注意为了避免递归，进行判断此时下方页面已被勾选，不进行重复勾选）. 关联表变化-》 下面关联列是 获取editor.target 赋列表的
 */

var selectIndexFK = undefined; // 页面选择的行
var selectFK = undefined; // 选择的FK
var editIndexFK = undefined; // 上方修改的序号
var editIndexFKCol=undefined;//下面正在修改的索引
var tableFKList = []; // 所有的外键集合
var rowIdFK = 1; // 自增Id
var choseRefTableId = undefined;// 选择的外键关联表Id
var refColumns = []; // 根据关联表变化的所有 关联列的modelList
var tableFKColumnsDatagrid = [];// 下方的datagrid的List
function addtableFK() {
	var FKName = tableName + "_FK" + rowIdFK;
	var tableFK = {
		rowId : rowIdFK,
		consName : FKName,
		consType : "FK",
		consFieldName : [],
		consRefTableId : null,
		refConsFieldId : [],
		consIsReal : 'REAL'
	}
	tableFKList.push(tableFK);
	rowIdFK++;
	selectFK = tableFKList[tableFKList.length - 1];
	appendFK();
}
function findTableFk(id) {
	for (var i = 0; i < tableFKList.length; i++) {
		if (tableFKList[i].rowId == id) {
			return tableFKList[i];
		}
	}
}
function appendFK() {
	$('#tableFKDatagrid').datagrid('loadData', tableFKList);
	editIndexFK = $('#tableFKDatagrid').datagrid('getRows').length - 1;
	$('#tableFKDatagrid').datagrid('selectRow', editIndexFK).datagrid(
			'beginEdit', editIndexFK);
	selectIndexFK = editIndexFK; // 设置选择的index
	$('#refTableCombobox').combobox('setValue', null); // 清空关联表的选择项
	refColumns.splice(0, refColumns.length); // 清空关联列的model
	reLoadTableFKColumnsDatagrid(tableFieldList, selectFK); // 根据选择的FK，reload下方datagrid
}
document.getElementById("tableFKDiv").onclick = function(e) {
	if (editIndexFK != undefined) {
		var row = $('#tableFKDatagrid').datagrid('getRows')[editIndexFK];
		if (row == null || row == undefined)
			return;
		var model = findTableFk(row.rowId);
		model.consName = row.consName;
		endEditing();
	}
	if(editIndexFKCol!=undefined){
		endEditingFKCol();
	}
	
}
document.getElementById("tableFKDatagridDiv").onclick = function(e) {
	e.stopPropagation();
}
document.getElementById("tabFKDiv").onclick = function(e) {
	e.stopPropagation();
}
function onClickRowFK(rowIndex, rowData) {
	if ($('#tableFKDatagrid').datagrid('getSelected') == null) {
		selectFK = undefined;
	} else {
		selectFK = findTableFk(rowData.rowId);
	}
	selectIndexFK = rowIndex;
	if (selectFK.consRefTableId != null) {
		$('#refTableCombobox').combobox('select', selectFK.consRefTableId);
	} else {
		$('#refTableCombobox').combobox('setValue', null);
		refColumns.splice(0, refColumns);
	}
	reLoadTableFKColumnsDatagrid(tableFieldList, selectFK);
}
function removeTableFK() {
	if (selectFK != undefined) {
		for (var i = 0; i < tableFKList.length; i++) {
			if (tableFKList[i].rowId == selectFK.rowId) {
				tableFKList.splice(i, 1);
				$('#tableFKDatagrid').datagrid('loadData', tableFKList);
				selectIndexFK = undefined;
				reSelectFK();
			}
		}
	}
}

function endEditing() {
	if (editIndexFK == undefined) {
		return true;
	}
	if ($('#tableFKDatagrid').datagrid('validateRow', editIndexFK)) {
		$('#tableFKDatagrid').datagrid('endEdit', editIndexFK);
		editIndexFK = undefined;
		return true;
	} else {
		return false;
	}
}
function endEditingFKCol(){
	if (editIndexFKCol == undefined) {
		return true;
	}
	if ($('#tableFKColumnsDatagrid').datagrid('validateRow', editIndexFKCol)) {
		$('#tableFKColumnsDatagrid').datagrid('endEdit', editIndexFKCol);
		var row = $('#tableFKColumnsDatagrid').datagrid('getRows')[editIndexFKCol];
		if (row == null || row == undefined)
			return;
		selectFK.refConsFieldId.push(row.select);
		$('#tableFKDatagrid').datagrid('loadData', tableFKList);
		reSelectFK();
		editIndexFKCol = undefined;
		return true;
	} else {
		return false;
	}
}
function onDblClickRowFK(index, field) {
	if (editIndexFK != index) {
		if (endEditing()) {
			$('#tableFKDatagrid').datagrid('selectRow', index).datagrid(
					'beginEdit', index);
			var ed = $('#tableFKDatagrid').datagrid('getEditor', {
				index : index,
				field : field
			});
			if (ed) {
				($(ed.target).data('textbox') ? $(ed.target).textbox('textbox')
						: $(ed.target)).focus();
			}
			editIndexFK = index;
		} else {
			setTimeout(function() {
				$('#tableFKDatagrid').datagrid('selectRow', editIndexFK);
			}, 0);
		}
	}
}

function convertor(tableFieldList, tableFK) {
	var datas = [];
	if(tableFK!=undefined&&tableFK!=null)
	if (tableFieldList != null)
		for (var i = 0; i < tableFieldList.length; i++) {
			var data = {
				'columns' : tableFieldList[i].fName
			};
			if (tableFK != null) {
				if (tableFK.consFieldName == undefined
						|| tableFK.consFieldName == null) {
					tableFK.consFieldName = new Array();
				}
				var tableFKNames = tableFK.consFieldName.concat();// 将外键名数组 复制
				// consFieldName数组中有的
				// 画对号
				for (var j = 0; j < tableFKNames.length; j++) {
					if (tableFieldList[i].fName == tableFKNames[j].fName) {
						data.checked = true;
						if (tableFK.refConsFieldId != null
								&& tableFK.refConsFieldId != undefined) {
							data.select = tableFK.refConsFieldId[0];
						} else {
							data.select = null;
						}
					}
				}

			}
			datas.push(data);
		}
	return datas;
}

function reLoadTableFKColumnsDatagrid(tableFieldList, tableFKs) {
	tableFKColumnsDatagrid = convertor(tableFieldList, tableFKs);
	$('#tableFKColumnsDatagrid').datagrid('loadData', tableFKColumnsDatagrid);
}

function onUncheckFK(rowIndex, rowData) {
	if (selectFK != undefined) {
		var FKNames = selectFK.consFieldName; // 选择的外键名对应的字段，数组应当只有一个，可多个
		if (FKNames.length != 0) {
			for (var i = 0; i < FKNames.length; i++) {
				if (FKNames[i].fName == rowData.columns) {
					FKNames.splice(i, 1);
				}
			}
		}
	}
	var target = $('#tableFKColumnsDatagrid').datagrid('getEditor', {
		index : rowIndex,
		field : 'select'
	}).target;
	target.combobox('setValue', null);
	$('#tableFKDatagrid').datagrid('loadData', tableFKList);
	reSelectFK();
	//// ChoseRefColEnable(rowIndex, false);
}
function onCheckFK(rowIndex, rowData) {
	if (selectFK != undefined) {
		selectFK.consFieldName.splice(0, selectFK.consFieldName.length);
		// 选择的外键名对应的字段，数组应当只有一个，可多个
		selectFK.consFieldName.push({
			"fName" : rowData.columns
		});
		$('#tableFKDatagrid').datagrid('loadData', tableFKList);
		reSelectFK();
		// ChoseRefColEnable(rowIndex, true);// 让关联列的下拉框可操作
	}
	selectFK.refConsFieldId.splice(0, selectFK.refConsFieldId.length);
}
function onDblClickRowFKCol(rowIndex,rowData){
	editIndexFKCol=rowIndex;
	$('#tableFKColumnsDatagrid').datagrid('beginEdit',rowIndex);
	var target = $('#tableFKColumnsDatagrid').datagrid('getEditor', {
		index : rowIndex,
		field : 'select'
	}).target;
	target.combobox('loadData', refColumns);
}
function refColFormatter(value,row){
	for(var i=0;i<refColumns.length;i++){
		if(refColumns[i].fId==value){
			return refColumns[i].fName;
		}
	}
}
function onLoadSuccessFK(data) {
	var rows = data.rows;
	for (var i = 0; i < rows.length; i++) {
		$('#tableFKColumnsDatagrid').datagrid('beginEdit', i);
		var index = $('#tableFKColumnsDatagrid').datagrid('getRowIndex',rows[i]);
		var target = $('#tableFKColumnsDatagrid').datagrid('getEditor', {
			index : index,
			field : 'select'
		}).target;
		target.combobox('loadData', refColumns);
		if (rows[i].select != null) {
			target.combobox('setValue', rows[i].select);
		} else {
			target.combobox('setValue', null);
		}
//		if (rows[i].checked == true) {
//			target.combobox('enable');
//		} else {
//			target.combobox('disable');
//		}
		$('#tableFKColumnsDatagrid').datagrid('endEdit', i);
	}
}
function FkTest() {
	console.log(selectFK);
}
function columnsFormatter(value, row, index) {
	var fieldNames = null;
	var fieldNamesString = '';
	if (row.consFieldName != null && row.consFieldName != undefined) {
		fieldNames = row.consFieldName.concat();
		for (var i = 0; i < fieldNames.length; i++) {
			fieldNamesString += fieldNames[i].fName;
			if (i != fieldNames.length - 1) {
				fieldNamesString += ',';
			}
		}
	}
	return fieldNamesString;
}

// 选择关联表
function choseRefTable(rec) {
	if (choseRefTableId == undefined || choseRefTableId != rec.tId) {
		var url = '../table/getTableFieldList?tableId=' + rec.tId;
		ajax(url).done(function(data) {
			refColumns = data;
			reLoadTableFKColumnsDatagrid(tableFieldList, selectFK);
		}).fail(function(error) {
			$.messager('关联字段', '关联字段加载失败', 'danger');
		});
		selectFK.consRefTableId = rec.tId;
		choseRefTableId = rec.tId;
	}
}
function ChoseRefColEnable(index, enable) {
	var target = $('#tableFKColumnsDatagrid').datagrid('getEditor', {
		index : index,
		field : 'select'
	}).target;
	if (enable) {
		target.combobox('enable');
	} else {
		target.combobox('disable');
	}
}

function choseRefCol(row) {
	if (row != null) {
		selectFK.refConsFieldId = new Array();
		selectFK.refConsFieldId.push(row.fId);
	}
}
function reSelectFK() {
	var rows = $("#tableFKDatagrid").datagrid('getRows');
	var length = rows.length;
	if (length > 0) {
		if (selectIndexFK == undefined) {
			selectIndexFK = 0;
		}
		$("#tableFKDatagrid").datagrid('selectRow', selectIndexFK);
		onClickRowFK(selectIndexFK, rows[selectIndexFK]);
	} else {
		selectFK=undefined;
		$('#refTableCombobox').combobox('setValue', null);
		refColumns.splice(0, refColumns);
		reLoadTableFKColumnsDatagrid([], selectFK);
	}
}
$(".alert-close").click(function() {
	$("#message").hide();
});
/**
 * tableFK tab 页的js在此结束
 */
/**
 * tableUnique tab 页的js在此开始
 * 
 */
var selectIndexUnique = undefined; // 页面选择的行
var selectUnique = undefined; // 选择的FK
var tableUniqueList = []; // 所有的外键集合
var rowIdUnique = 1; // 自增Id
var editIndexUnique = undefined;// 上面正在修改的唯一约束
function endEditingUnique() {
	if (editIndexUnique == undefined) {
		return true;
	}
	if ($('#tableUniqueDatagrid').datagrid('validateRow', editIndexUnique)) {
		$('#tableUniqueDatagrid').datagrid('endEdit', editIndexUnique);
		var row = $('#tableUniqueDatagrid').datagrid('getRows')[editIndexUnique];
		if (row == null || row == undefined)
			return;
		var model = findTableUnique(row.rowId);
		model.consName = row.consName;
		editIndexUnique = undefined;
		return true;
	} else {
		return false;
	}
}
function addtableUnique() {
	var UniqueName = tableName + "UNIQUE" + rowIdUnique;
	var tableUnique = {
		rowId : rowIdUnique,
		consName : UniqueName,
		consType : "Unique",
		consFieldName : [],
		consRefTableId : null,
		refConsFieldId : [],
		consIsReal : 'REAL'
	}
	tableUniqueList.push(tableUnique);
	rowIdUnique++;
	selectUnique = tableUniqueList[tableUniqueList.length - 1];
	appendUnique();
}
function appendUnique() {
	$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
	editIndexUnique = $('#tableUniqueDatagrid').datagrid('getRows').length - 1;
	$('#tableUniqueDatagrid').datagrid('selectRow', editIndexUnique).datagrid(
			'beginEdit', editIndexUnique);
	selectIndexUnique = editIndexUnique;
	reLoadTableUniqueColumnsDatagrid(tableFieldList, selectUnique);
}
document.getElementById("tableUniqueDiv").onclick = function(e) {
	if (editIndexUnique != undefined) {
		endEditingUnique();
	}
}
document.getElementById("tableUniqueDatagridDiv").onclick = function(e) {
	e.stopPropagation();
}
function findTableUnique(id) {
	for (var i = 0; i < tableUniqueList.length; i++) {
		if (tableUniqueList[i].rowId == id) {
			return tableUniqueList[i];
		}
	}
}
function reLoadTableUniqueColumnsDatagrid(tableFieldList, selectUnique) {
	var dataList = converterUnique(tableFieldList, selectUnique);
	$('#tableUniqueColumnsDatagrid').datagrid('loadData', dataList);
	if (selectUnique != null) {
		if (selectUnique.consFieldName == undefined
				|| selectUnique.consFieldName == null) {
			selectUnique.consFieldName = new Array();
		}
		var tableUniqueNames = selectUnique.consFieldName.concat();
		var rows = $('#tableUniqueColumnsDatagrid').datagrid('getRows');
		for (var i = 0; i < rows.length; i++) {
			var row = rows[i];
			var index = $('#tableUniqueColumnsDatagrid').datagrid(
					'getRowIndex', row);
			for (var j = 0; j < tableUniqueNames.length; j++) {
				if (row.columns == tableUniqueNames[j].fName) {
					$('#tableUniqueColumnsDatagrid')
							.datagrid('checkRow', index);
				}
			}
		}
	}
}
function converterUnique(tableFieldList, selectUnique) {
	var datas = [];
	if(selectUnique!=undefined&&selectUnique!=null)
	if (tableFieldList != null)
		for (var i = 0; i < tableFieldList.length; i++) {
			var data = {
				'columns' : tableFieldList[i].fName
			};
			datas.push(data);
		}
	return datas;
}
function onDblClickRowUnique(index, field) {
	if (editIndexUnique != index) {
		if (endEditingUnique()) {
			$('#tableUniqueDatagrid').datagrid('selectRow', index).datagrid(
					'beginEdit', index);
			var ed = $('#tableUniqueDatagrid').datagrid('getEditor', {
				index : index,
				field : field
			});
			if (ed) {
				($(ed.target).data('textbox') ? $(ed.target).textbox('textbox')
						: $(ed.target)).focus();
			}
			editIndexUnique = index;
		} else {
			setTimeout(function() {
				$('#tableUniqueDatagrid')
						.datagrid('selectRow', editIndexUnique);
			}, 0);
		}
	}
}
function onClickRowUnique(rowIndex, rowData) {
	if ($('#tableUniqueDatagrid').datagrid('getSelected') == null) {
		selectUnique = undefined;
	} else {
		selectUnique = findTableUnique(rowData.rowId);
	}
	selectIndexUnique = rowIndex;
	reLoadTableUniqueColumnsDatagrid(tableFieldList, selectUnique);
}
function removeUnique() {
	if (selectUnique != undefined) {
		for (var i = 0; i < tableUniqueList.length; i++) {
			if (tableUniqueList[i].rowId == selectUnique.rowId) {
				tableUniqueList.splice(i, 1);
				$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
				selectIndexUnique = undefined;
				reSelectUnique();
			}
		}
	}
}
function onCheckUnique(rowIndex, rowData) {
	if (selectUnique != undefined) {
		endEditingUnique();
		var flag = true;
		for (var i = 0; i < selectUnique.consFieldName.length; i++) {
			if (rowData.columns == selectUnique.consFieldName[i].fName) {
				flag = false;
				break;
			}
		}
		if (flag) {
			selectUnique.consFieldName.push({
				"fName" : rowData.columns
			});
			$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
			reSelectUnique();
		}
	}
}
function onUncheckUnique(rowIndex, rowData) {
	if (selectUnique != undefined) {
		var UniqueNames = selectUnique.consFieldName; // 选择的外键名对应的字段，数组应当只有一个，可多个
		if (UniqueNames.length != 0) {
			for (var i = 0; i < UniqueNames.length; i++) {
				if (UniqueNames[i].fName == rowData.columns) {
					UniqueNames.splice(i, 1);
				}
			}
		}
	}
	$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
	reSelectUnique();
}
function onCheckAllUnique(rows) {
	if (selectUnique != undefined) {
		endEditingUnique();
		for (var i = 0; i < rows.length; i++) {
			var flag = true;
			for (var j = 0; j < selectUnique.consFieldName.length; j++) {
				if (rows[i].columns == selectUnique.consFieldName[j].fName) {
					flag = false;
				}
			}
			if (flag) {
				selectUnique.consFieldName.push({
					"fName" : rows[i].columns
				});
			}

		}
		$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
		reSelectUnique();
	}
}
function onUncheckAllUnique(rows) {
	if (selectUnique != undefined) {
		var UniqueNames = selectUnique.consFieldName;
		UniqueNames.splice(0, UniqueNames.length);
		$('#tableUniqueDatagrid').datagrid('loadData', tableUniqueList);
		reSelectUnique();
	}
}
function reSelectUnique() {
	var rows = $("#tableUniqueDatagrid").datagrid('getRows');
	var length = rows.length;
	if (length > 0) {
		if (selectIndexUnique == undefined) {
			selectIndexUnique = 0;
		}
		$("#tableUniqueDatagrid").datagrid('selectRow', selectIndexUnique);
		onClickRowUnique(selectIndexUnique, rows[selectIndexUnique]);
	} else {
		selectUnique=undefined;
		reLoadTableUniqueColumnsDatagrid([], selectUnique);
	}
}
function UniqueTest() {
	console.log(tableUniqueList);
}
/**
 * tableUnique tab 页的js在此结束
 * 
 */

/**
 * tableIndex tab 页的js在此开始
 */
var selectIndexIndex = undefined; // 页面选择的行
var selectIndex = undefined; // 选择的索引
var tableIndexList = []; // 所有的索引的集合
var indexRowId = 1; // 自增Id
var editIndexIndex = undefined;// 上面 正在修改的索引
var editIndexIndexCol=undefined;//下面正在修改的索引
function endEditingIndex() {
	if (editIndexIndex == undefined) {
		return true;
	}
	if ($('#tableIndexDatagrid').datagrid('validateRow', editIndexIndex)) {
		$('#tableIndexDatagrid').datagrid('endEdit', editIndexIndex);
		var row = $('#tableIndexDatagrid').datagrid('getRows')[editIndexIndex];
		if (row == null || row == undefined)
			return;
		var model = findTableIndex(row.indexRowId);
		model.iName = row.iName;
		model.iType = row.iType;
		model.iSort = row.iSort;
		editIndexIndex = undefined;
		return true;
	} else {
		return false;
	}
}
function iTypeFormatter(value, row, index) {
	if (value == '0') {
		return "普通索引";
	}
	if (value == '1') {
		return "唯一索引";
	}
}
function iSortFormatter(value, row, index) {
	if (value == '0') {
		return "DESC";
	}
	if (value == '1') {
		return "ASC";
	}
}
function indexFormatter(value,row,index){
	var fieldNames = null;
	var fieldNamesString = '';
	if (row.indexColCustomList != null && row.indexColCustomList != undefined) {
		indexColCustomList = row.indexColCustomList.concat();
		for (var i = 0; i < indexColCustomList.length; i++) {
			fieldNamesString += indexColCustomList[i].colName;
			if(indexColCustomList[i].sort=='0'){
				fieldNamesString +="(DESC)";
			}else{
				fieldNamesString +="(ASC)";
			}
			if (i != indexColCustomList.length - 1) {
				fieldNamesString += ',';
			}
		}
	}
	return fieldNamesString;
}
function addtableIndex() {
	var tableIndex = {
		indexRowId : indexRowId,
		iName : tableName+"_INDEX" + indexRowId,
		iCnName : null,
		iDesc : null,
		iType : '0',
		iSort : '0',
		indexColCustomList : []
	}
	tableIndexList.push(tableIndex);
	indexRowId++;
	selectIndex = tableIndexList[tableIndexList.length - 1];
	appendIndex();
}
function appendIndex() {
	$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
	editIndexIndex = $('#tableIndexDatagrid').datagrid('getRows').length - 1;
	$('#tableIndexDatagrid').datagrid('selectRow', editIndexIndex).datagrid(
			'beginEdit', editIndexIndex);
	selectIndexIndex = editIndexIndex;
	reLoadTableIndexColumnsDatagrid(tableFieldList, selectIndex);
}
//点击页面进行保存页面修改
document.getElementById("tableIndexDiv").onclick = function(e) {
	if (editIndexIndex != undefined) {//保存上方
		endEditingIndex();
	}
	if(editIndexIndexCol!=undefined){
		endEditingIndexCol();
	}
}
document.getElementById("tableIndexDatagridDiv").onclick = function(e) {
	e.stopPropagation();
}
document.getElementById("tabIndexDiv").onclick = function(e) {
	e.stopPropagation();
}
function findTableIndex(id) {
	for (var i = 0; i < tableIndexList.length; i++) {
		if (tableIndexList[i].indexRowId == id) {
			return tableIndexList[i];
		}
	}
}
function reLoadTableIndexColumnsDatagrid(tableFieldList, selectIndex) {
	var dataList = converterIndex(tableFieldList, selectIndex);
	$('#tableIndexColumnsDatagrid').datagrid('loadData', dataList);
	if (selectIndex != null) {
		if (selectIndex.indexColCustomList == undefined || selectIndex.indexColCustomList == null) {
			selectIndex.indexColCustomList = new Array();
		}
		var tableIndexNames = selectIndex.indexColCustomList.concat();
		var rows = $('#tableIndexColumnsDatagrid').datagrid('getRows');
		for (var i = 0; i < rows.length; i++) {
			var row = rows[i];
			var index = $('#tableIndexColumnsDatagrid').datagrid('getRowIndex',
					row);
			for (var j = 0; j < tableIndexNames.length; j++) {
				if (row.columns == tableIndexNames[j].colName) {
					$('#tableIndexColumnsDatagrid').datagrid('checkRow', index);
				}
			}
		}
	}
}
function converterIndex(tableFieldList, selectUnique) {
	var datas = [];
	if(selectUnique!=null&&selectUnique!=null)
	if (tableFieldList != null)
		for (var i = 0; i < tableFieldList.length; i++) {
			var data = {
				'columns' : tableFieldList[i].fName,
				'sort':'1'
			};
			for(var j=0;j<selectIndex.indexColCustomList.length;j++){
				if(selectIndex.indexColCustomList[j].colName==data.columns){
					data.sort=selectIndex.indexColCustomList[j].sort;
				}
			}
			datas.push(data);
		}
	return datas;
}
function onDblClickRowIndex(index, field) {
	if (editIndexIndex != index) {
		if (endEditingIndex()) {
			$('#tableIndexDatagrid').datagrid('selectRow', index).datagrid(
					'beginEdit', index);
			var ed = $('#tableIndexDatagrid').datagrid('getEditor', {
				index : index,
				field : field
			});
			if (ed) {
				($(ed.target).data('textbox') ? $(ed.target).textbox('textbox')
						: $(ed.target)).focus();
			}
			editIndexIndex = index;
		} else {
			setTimeout(function() {
				$('#tableIndexDatagrid').datagrid('selectRow', editIndexIndex);
			}, 0);
		}
	}
}
function onClickRowIndex(rowIndex, rowData) {
	if ($('#tableIndexDatagrid').datagrid('getSelected') == null) {
		selectIndex = undefined;
	} else {
		selectIndex = findTableIndex(rowData.indexRowId);
	}
	selectIndexIndex = rowIndex;
	reLoadTableIndexColumnsDatagrid(tableFieldList, selectIndex);
}
function removeTableIndex() {
	if (selectIndex != undefined) {
		for (var i = 0; i < tableIndexList.length; i++) {
			if (tableIndexList[i].indexRowId == selectIndex.indexRowId) {
				tableIndexList.splice(i, 1);
				$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
				selectIndexIndex = undefined;
				reSelectIndex();
			}
		}
	}
}
function onCheckIndex(rowIndex, rowData) {
	if (selectIndex != undefined) {
		endEditingIndex();
		var flag = true;
		for (var i = 0; i < selectIndex.indexColCustomList.length; i++) {
			if (rowData.columns == selectIndex.indexColCustomList[i].colName) {
				flag = false;
				break;
			}
		}
		if (flag) {
			selectIndex.indexColCustomList.push({
				colName : rowData.columns,
				sort: rowData.sort,
			});
			$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
			reSelectIndex();
		}
	}
}
function onUncheckIndex(rowIndex, rowData) {
	if (selectIndex != undefined) {
		var indexColCustomList = selectIndex.indexColCustomList; // 选择的外键名对应的字段，数组应当只有一个，可多个
		if (indexColCustomList.length != 0) {
			for (var i = 0; i < indexColCustomList.length; i++) {
				if (indexColCustomList[i].colName == rowData.columns) {
					indexColCustomList.splice(i, 1);
				}
			}
		}
	}
	$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
	reSelectIndex();
}
function onCheckAllIndex(rows) {
	if (selectIndex != undefined) {
		endEditingIndex();
		for (var i = 0; i < rows.length; i++) {
			var flag = true;
			for (var j = 0; j < selectIndex.indexColCustomList.length; j++) {
				if (rows[i].columns == selectIndex.indexColCustomList[j].colName) {
					flag = false;
				}
			}
			if (flag) {
				selectIndex.indexColCustomList.push({
					"colName" : rows[i].columns,
					 sort:      rows[i].sort,
				});
			}
		}
		$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
		reSelectIndex();
	}
}
function onUncheckAllIndex(rows) {
	if (selectIndex != undefined) {
		var indexColCustomList = selectIndex.indexColCustomList;
		indexColCustomList.splice(0, indexColCustomList.length);
		$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
		reSelectIndex();
	}
}
function onDblClickRowIndexCol(rowIndex,rowData){//双击进行修改下方
	editIndexIndexCol=rowIndex;
	$('#tableIndexColumnsDatagrid').datagrid('beginEdit',rowIndex);
}
function endEditingIndexCol(){
	if (editIndexIndexCol == undefined) {
		return true;
	}
	if ($('#tableIndexColumnsDatagrid').datagrid('validateRow', editIndexIndexCol)) {
		$('#tableIndexColumnsDatagrid').datagrid('endEdit', editIndexIndexCol);
		var row = $('#tableIndexColumnsDatagrid').datagrid('getRows')[editIndexIndexCol];
		if (row == null || row == undefined)
			return;
		for(var i=0;i<selectIndex.indexColCustomList.length;i++){
			var col=selectIndex.indexColCustomList[i];
			if(col.colName==row.columns){
				col.sort=row.sort;
			}
		}
		$('#tableIndexDatagrid').datagrid('loadData', tableIndexList);
		reSelectIndex();
		editIndexIndexCol = undefined;
		return true;
	} else {
		return false;
	}
}
function reSelectIndex() {
	var rows = $("#tableIndexDatagrid").datagrid('getRows');
	var length = rows.length;
	if (length > 0) {
		if (selectIndexIndex == undefined) {
			selectIndexIndex = 0;
		}
		$("#tableIndexDatagrid").datagrid('selectRow', selectIndexIndex);
		onClickRowIndex(selectIndexIndex, rows[selectIndexIndex]);
	} else {
		selectIndex=undefined;
		reLoadTableIndexColumnsDatagrid([], selectIndex)
	}
}
function indexTest() {
	console.log(tableIndexList);
}
