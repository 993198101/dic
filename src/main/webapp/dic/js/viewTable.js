/**
 * Created by ChenShuai on 2017/8/31 0011.
 */
$(function() {
	$("#w").window('close');
	if (getQueryString("moduleId") != null) {
		queryParams.vOfModule = getQueryString("moduleId");
	}
	if (getQueryString("projectId") != null) {
		$('#vOfModule').combobox({
		    url:'../table/getModuleOptionList?projectId='+getQueryString("projectId"),
		});
		queryParams.vOfProject = getQueryString("projectId");
	}
	if (getQueryString("datasourceId") != null) {
		queryParams.vOfDatasource = getQueryString("datasourceId");
	}
	$('#dataGrid').datagrid({
		url : getPageUrl,
		queryParams : queryParams
	});
});
var queryParams = {};
var saveViewUrl = "../view/saveView";
var getPageUrl = "../view/getViewsByPage";
var removeViewUrl = "../view/removeView";
var editUrl = "../menu/gotoViewForm";
var tableId = "-1";
function query() {
	var queryParams = {};
	 if($('#vId').textbox('getValue')!="")
	 queryParams.vId=$('#vId').textbox('getValue');
	 if($('#vName').textbox('getValue')!="")
	 queryParams.vName=$('#vName').textbox('getValue');
	 if($('#vCnName').textbox('getValue')!="")
	 queryParams.vCnName=$('#vCnName').textbox('getValue');
	 if($('#vDesc').textbox('getValue')!="")
	 queryParams.vDesc=$('#vDesc').textbox('getValue');
	 if($('#vCnName').textbox('getValue')!="")
	 queryParams.vCnName=$('#vCnName').textbox('getValue');
	 if($('#vSyncState').combobox('getValue')!="")
	 queryParams.vSyncState=$('#vSyncState').combobox('getValue');
	 if($('#vOfModule').combobox('getValue')!="")
		 queryParams.vOfModule=$('#vOfModule').combobox('getValue');
	$('#dataGrid').datagrid('load', queryParams);
}

function dataFilter(data) {
	for (var i = 0; i < data.list.length; i++) {
		if (data.list[i].iType == "0") {
			data.list[i].iType = "普通视图";
		}
		if (data.list[i].iType == "1") {
			data.list[i].iType = "唯一视图";
		}
		if (data.list[i].iSyncState == "0") {
			data.list[i].iSyncState = "系统存在,数据库不存在";
		}
		if (data.list[i].iSyncState == "1") {
			data.list[i].iSyncState = "系统不存在,数据库存在";
		}
		if (data.list[i].iSyncState == "2") {
			data.list[i].iSyncState = "存在差异属性";
		}
		if (data.list[i].iSyncState == "3") {
			data.list[i].iSyncState = "已同步";
		}

	}
	var tabledata = {
		"total" : data.total,
		"rows" : data.list,
	}
	return tabledata;
}
function button(value, row, view) {
	return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editView("
			+ row.vId
			+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteView("
			+ row.vId + ")'>删除</button>";
}
function addView() {
	$("#w").window('open');
}
function back() {
	$("#w").window('close');
}
function submitForm() {
	var res = $('#addViewForm').form('enableValidation').form('validate');
	if (!res)
		return;
	var formJson = $('#addViewForm').serializeObject();
	formJson.vOfProject = queryParams.vOfProject;
	formJson.vOfModule = queryParams.vOfModule;
	formJson.vOfDatasource = queryParams.vOfDatasource;
	ajax(saveViewUrl, JSON.stringify(formJson), 'post').done(function(data) {
		$.messager.progress('close');// 关闭进度
		$("#w").window('close');
		if (data.status == "success") {
			$.messager.alert('增加视图', '增加视图成功!', 'success');
		} else {
			$.messager.alert('增加视图', '增加视图失败!', 'danger');
		}
		parent.loadSec("../menu/getAllMenus");
		$("#dataGrid").datagrid('reload', queryParams);
	}).fail(function(err) {
		$.messager.alert('增加视图', '增加视图失败!，错误码=' + err.status, 'danger');
	});
}
function deleteView(id) {
	ajax(removeViewUrl + "?id=" + id).done(function(data) {
		if (data.status == "success") {
			$.messager.alert('删除视图', '删除视图成功!', 'success');
			$("#dataGrid").datagrid('reload', queryParams);
		} else {
			$.messager.alert('删除视图', '删除视图失败!', 'success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editView(id) {
	parent.addMainTab("视图_" + id, editUrl + "?viewId=" + id);
}