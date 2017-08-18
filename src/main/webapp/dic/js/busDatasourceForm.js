
var menuTitle=parent.$('#mainTabs').tabs('getSelected').panel('options').title;
var getEditUrl="../busDatasource/getBusdatasourceById";
var saveEditUrl="../busDatasource/saveBusdatasource";
$(function(){
	var datasourceId=getQueryString("datasourceId");
	ajax(getEditUrl+"?datasourceId="+datasourceId).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载业务数据源数据失败!，','danger');
		}else{
			$("#datasourceForm").form('load',data.datasource);// 初始化表单
		}
	}).fail(function(data){
		
	})
});
function saveEdit(){
	var res=$('#datasourceForm').form('enableValidation').form('validate');
	if(!res) return;
	var formJson = $('#datasourceForm').serializeObject();   
     ajax(saveEditUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.result>0){
			$.messager.alert('业务数据源','修改数据源成功!，','success');
			updateTabs(menuTitle,formJson.dName);
			parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('业务数据源','修改数据源失败!，','danger');
		}
	});
}