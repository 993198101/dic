$(function(){
	$("#w").window('close');
	if (getQueryString("moduleId") != null) {
		queryParams.sOfModule = getQueryString("moduleId");
	}
	if (getQueryString("projectId") != null) {
		queryParams.sOfProject = getQueryString("projectId");
	}
	if (getQueryString("datasourceId") != null) {
		queryParams.sOfDatasource = getQueryString("datasourceId");
	}
	$('#dataGrid').datagrid({
		url : getPageUrl,
		queryParams : queryParams
	});
	ajax('../seq/getOptionList?projectId='+getQueryString("projectId")).done(function(data){
		$('.module-list').combobox('loadData',data.moduleList);
		$('.yes_no_option_list').combobox('loadData',data.yesOrNoList);
		$('.table-list').combobox('loadData',data.tableList);
	}).fail(function(error){
		$.messager.alert("加载下拉框", "加载下拉框失败", "danger");
	});
});
var queryParams = {};
var saveSeqUrl = "../seq/saveSeq";
var getPageUrl = "../seq/getSeqsByPage";
var removeSeqUrl = "../seq/removeSeq";
var editUrl = "../menu/gotoSeqForm";
var tableId = "-1";
function query() {
	var queryParams = {};
	 if($('#sId').textbox('getValue')!="")
	 queryParams.sId=$('#sId').textbox('getValue');
	 if($('#sName').textbox('getValue')!="")
	 queryParams.sName=$('#sName').textbox('getValue');
	 if($('#sCnName').textbox('getValue')!="")
	 queryParams.sCnName=$('#sCnName').textbox('getValue');
	 if($('#sDesc').textbox('getValue')!="")
	 queryParams.sDesc=$('#sDesc').textbox('getValue');
	 if($('#sCnName').textbox('getValue')!="")
	 queryParams.sCnName=$('#sCnName').textbox('getValue');
	 if($('#sSyncState').combobox('getValue')!="")
	 queryParams.sSyncState=$('#sSyncState').combobox('getValue');
	 if($('#sOfModule').combobox('getValue')!="")
		 queryParams.sOfModule=$('#sOfModule').combobox('getValue');
	$('#dataGrid').datagrid('load', queryParams);
}

function dataFilter(data) {
	
	var tabledata = {
		"total" : data.total,
		"rows" : data.list,
	}
	return tabledata;
}
function button(value, row, seq) {
	return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editSeq("
			+ row.vId
			+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteSeq("
			+ row.vId + ")'>删除</button>";
}
function addSeq() {
	$("#w").window('open');
}
function back() {
	$("#w").window('close');
}
function submitForm() {
	var res = $('#addSeqForm').form('enableValidation').form('validate');
	if (!res)
		return;
	var formJson = $('#addSeqForm').serializeObject();
	formJson.sOfProject = queryParams.sOfProject;
	formJson.sOfModule = queryParams.sOfModule;
	formJson.sOfDatasource = queryParams.sOfDatasource;
	ajax(saveSeqUrl, JSON.stringify(formJson), 'post').done(function(data) {
		$.messager.progress('close');// 关闭进度
		$("#w").window('close');
		if (data.status == "success") {
			$.messager.alert('增加序列', '增加序列成功!', 'success');
		} else {
			$.messager.alert('增加序列', '增加序列失败!', 'danger');
		}
		parent.loadSec("../menu/getAllMenus");
		$("#dataGrid").datagrid('reload', queryParams);
	}).fail(function(err) {
		$.messager.alert('增加序列', '增加序列失败!，错误码=' + err.status, 'danger');
	});
}
function deleteSeq(id) {
	ajax(removeSeqUrl + "?id=" + id).done(function(data) {
		if (data.status == "success") {
			$.messager.alert('删除序列', '删除序列成功!', 'success');
			$("#dataGrid").datagrid('reload', queryParams);
		} else {
			$.messager.alert('删除序列', '删除序列失败!', 'success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editSeq(id) {
	parent.addMainTab("序列_" + id, editUrl + "?seqId=" + id);
}