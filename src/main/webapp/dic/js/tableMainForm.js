/**
 * Created by ChenShuai on 2017/7/27 0011.
 */
$(function() {
	$("#w").window('close');
	if (getQueryString("moduleId") != null) {
		queryParams.moduleId = getQueryString("moduleId");
	}
	if (getQueryString("tableId") != null) {
		loadEdit();
	}

});
var addOrEditTableUrl="../table/addOrEditTable";
// var addUrl="../sysDatasource/addSysDatasource?parentMenuId="+menuId;
var deleteUrl = "../sysDatasource/deleteSysDatasource";
var editUrl = "../menu/gotoSysDatasourceForm";
var loadSelectUrl = "../sysDatasource/loadSelect";
var queryParams = {
	moduleId : "0"
};

function back() {
	$("#w").window('close');
}

function loadSelect() {
	var commoboxNode = new Array();
	ajax(loadSelectUrl).done(function(res) {
		console.log(res);
		$.each(res.data, function(i, item) {
			commoboxNode.push({
				id : item.id,
				text : item.text,
				selected : item.checked
			});
		});
		$("#choseDatabaseType").combobox('loadData', commoboxNode);

	})
}
//加载字段tableField的操作按钮：  编辑、删除
function button(value, row, index) {
	return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editTableField("
			+ row.rowId
			+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' type='button' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteTableField("
			+ row.rowId + ");'>删除</button>";
}
//加载table数据
var loadEditUrl="/table/getEdit"
function loadEdit(tableId){
	ajax(loadEditUrl + "?tableId=" + tableId).done(function(data) {
		//表信息赋值
		$("#tableInfoForm").form('load',data.tableInfo);
		//字段赋值
		tableFieldList = data.tableFields;
		tableFieldListBackup = tableFieldList.concat(); // 数组复制
		var i = 0;
		for (i = 0; i < tableFieldList.length; i++) {
			tableFieldList[i].rowId = i;
		}
		tableFieldNextId = i + 1;
		$('#tableFieldDatagrid').datagrid('loadData', {
			"rows" : tableFieldList,
			"total" : tableFieldList.length
		});
		//主键赋值
		$('#tablePKForm').form('load',data);//*********未操作
		//外键赋值
		//唯一约束赋值
		//索引页赋值
		
	}).fail(function(error){
		$.messager.alert("表信息加载","表信息加载失败，错误码"+error.status,"danger");
	});
}
function query() {
	queryParams = {};
	if ($('#dId').textbox('getValue') != "")
		queryParams.dId = $('#dId').textbox('getValue');
	if ($('#dName').textbox('getValue') != "")
		queryParams.dName = $('#dName').textbox('getValue');
	if ($('#dDate').textbox('getValue') != "")
		queryParams.dDate = formatterDate(new Date($('#dDate').datebox(
				'getValue')));
	if ($('#dIp').textbox('getValue') != "")
		queryParams.dIp = $('#dIp').textbox('getValue');
	if ($('#dPort').textbox('getValue') != "")
		queryParams.dPort = $('#dPort').textbox('getValue');
	if ($('#dService').textbox('getValue') != "")
		queryParams.dService = $('#dService').textbox('getValue');
	if ($('#dUsername').textbox('getValue') != "")
		queryParams.dUsername = $('#dUsername').textbox('getValue');
	if ($('#choseDatabaseType').textbox('getValue') != "")
		queryParams.dDatabaseType = $('#choseDatabaseType').textbox('getValue');
	$('#dataGrid').datagrid('load', queryParams);

}
function submitForm() {
	if($('#tableInfoForm').form('enableValidation').form('validate')==false){
		return false;
	}
	var formJson={
		tableInfo:$('#tableInfoForm').serializeObject(),
		tableFields:tableFieldList
	}
	 ajax(addOrEditTableUrl,JSON.stringify(formJson),'post').done(function(data){
		 $.messager.progress('close');// 关闭进度
		 $("#w").window('close');
	 });
}
function deleteSysDatasource(dId) {
	/**
	 * 删除系统数据源 1为成功，0为失败
	 */
	ajax(deleteUrl + "?dId=" + dId).done(function(data) {
		console.log(data);
		if (data.result == 1) {
			$.messager.alert('删除系统数据源', '删除系统数据源成成功!', 'success');
			$("#dataGrid").datagrid('reload', queryParams);
		} else {
			$.messager.alert('删除系统数据源', '删除系统数据源成成功!', 'success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editSysdatasource(id) {
	location.href = editUrl + "?datasourceId=" + id;
}
/**
 * tableInfo  tab 页的js在此开始
 */
var getTableInfoUrl="/table/getTableInfos"
function loadTableInfo(tableId){
	ajax(getTableInfoUrl + "?tableId=" + tableId).done(function(data) {
		$("#tableInfoForm").form('load',data);
	}).fail(function(error){
		$.messager.alert("表信息加载","表信息加载失败，错误码"+error.status,"danger");
	});
}

/**
 * tableInfo  tab 页的js在此结束
 */

/**
 * tableField tab 页的js在此开始
 */

// 字段新增，暂不同步到数据库，当表的新建或修改完成的时才去进行获取字段的信息进行新建。
var tableFieldList = [];
var tableFieldListBackup = tableFieldList.concat();
var getTableFieldAllUrl = "../table/getTableFields";
var tableFieldParams = {};
var isEdit = false; // 用来判断   字段的弹出是编辑还是新增操作
var tableFieldNextId = 0; // 由于暂时不进入数据库，所以用序号来标识 各个行，新增时加+，如果是编辑
// 此值的起始值变成最大的fId+1

// 第一次编辑表时，读取各个字段.对各个字段的进行用 rowId做唯一标识，加载datagrid
function firstLoadTableField(params) {
	ajax(getTableFieldAllUrl, params).done(function(data) {
		tableFieldList = data.list;
		tableFieldListBackup = tableFieldList.concat(); // 数组复制
		var i = 0;
		for (i = 0; i < tableFieldList.length; i++) {
			tableFieldList[i].rowId = i;
		}
		tableFieldNextId = i + 1;
		$('#tableFieldDatagrid').datagrid('loadData', {
			"rows" : tableFieldList,
			"total" : data.total
		});
	}).fail(function(error) {
		$.messager.alert("加载字段", "加载字段失败", "danger");
	});
}
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
		"rowId" : tableFieldNextId
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
		isEdit = false;
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
	isEdit = true;
}
// 删除字段，操作tableFieList
function deleteTableField(id) {
	for (var i = 0; i < tableFieldListBackup.length; i++) {
		if (tableFieldListBackup[i].rowId == id) {
			tableFieldListBackup.splice(i, 1);
		}
	}
	tableFieldList = tableFieldListBackup.concat();
	nexLoadTableField();
}

// 字段查询,特别的删除元素 i--
function queryTableField() {
	tableFieldList = tableFieldListBackup.concat();
	for (var i = 0; i < tableFieldList.length; i++) {
		if (tableFieldList[i].fName != $('#fName').textbox('getValue')&&$('#fName').textbox('getValue')!="") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fDataElement != $('#fDataElement').combobox('getValue')&&$('#fDataElement').combobox('getValue')!=""){
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fIsSuitQuery != $('#fIsSuitQuery').combobox('getValue')&&$('#fIsSuitQuery').combobox('getValue')!=""){
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
		if (tableFieldList[i].fCtrlType != $('#fCtrlType').combobox('getValue')&&$('#fCtrlType').combobox('getValue')!="") {
			tableFieldList.splice(i, 1);
			i--;
			continue;
		}
	}
	nexLoadTableField();
}

/**
 * tableField tab 页的js在此结束
 */
/**
 * tablePK tab 页的js在此开始
 */
var getTablePKUrl="table/getTablePKs";
function loadTablePK(tableId){
	ajax(getTableFieldAllUrl+"?tableId"+tableId,{"consType":"PK"}).done(function(data) {
		$('#tablePKForm').form('load',data);
	}).fail(function(error){
		$.messager.alert("主键","表主键加载失败","danger");
	});
}

/**
 * tablePK tab 页的js在此结束
 */


/**
 * tableFK tab 页的js在此开始
 */
//外键约束新增，暂不同步到数据库，当表的新建或修改完成的时才去进行获取外键约束进行新建。
var tableFK = [];
var tableFKBackup = tableFK.concat();
var getTableFKAllUrl = "../table/getTableFKs";
var tableFKNextId = 0; // 由于暂时不进入数据库，所以用序号来标识 各个行，新增时加+1，如果是编辑以最大值+1
function addFK(){
	$('#FKDatagrid').datagrid('appendRow');
}

/**
 * tableFK tab 页的js在此结束
 */