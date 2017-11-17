$(function(){
	if (getQueryString("seqId") != null) {
		seqId = getQueryString("seqId");
	}
	if (getQueryString("projectId") != null) {
		ajax('../seq/getOptionList?projectId='+getQueryString("projectId")).done(function(data){
			$('.module-list').combobox('loadData',data.moduleList);
			$('.yes_no_option_list').combobox('loadData',data.yesOrNoList);
			$('.table-list').combobox('loadData',data.tableList);
			if(seqId==null){
				 $.messager.alert('获取数据','无传递参数!，','danger');
			}else{
				loadEdit(seqId);
			}
		}).fail(function(error){
			$.messager.alert("加载下拉框", "加载下拉框失败", "danger");
		});
	}
});
var getEditUrl="../seq/getSeq"
var updateSeqUrl="../seq/updateSeq";
var seqId=null;
function loadEdit(id){
	ajax(getEditUrl+"?seqId="+id).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载序列数据失败!，','danger');
		}else{
			$("#seqForm").form('load',data);// 初始化表单
		}
	});
}
function choseRefTable(value,row){
	$("#sRefField").combobox('clear');
	var url="../table/getTableFieldList?tableId="+value.tId;
	$("#sRefField").combobox('reload',url);
}
function saveEdit(){
	var res=$('#seqForm').form('enableValidation').form('validate');
	if(!res) return;
	var formJson = $('#seqForm').serializeObject();
	ajax(updateSeqUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.status=="success"){
			$.messager.alert('序列','修改序列成功!，','success');
			//updateTabs(menuTitle,formJson.iName);
			//parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('序列','修改序列失败!，','danger');
		}
	});
}