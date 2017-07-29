//$("#myForm").form('load',{"email":"993198101q.com"}); 初始化表单

var getEditUrl="../sysDatasource/getSysdatasourceById";
var saveEditUrl="../sysDatasource/saveSysdatasource";
$(function(){
	var datasourceId=getQueryString("datasourceId");
	ajax(getEditUrl+"?datasourceId="+datasourceId).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载系统数据失败!，','danger');
		}else{
			$("#datasourceForm").form('load',data.datasource);// 初始化表单
		}
	}).fail(function(err){
		alert("错误码"+err.status);
	});
});
function saveEdit(){
	var formJson = $('#datasourceForm').serializeObject();   
     ajax(saveEditUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.result>0){
			$.messager.alert('项目','修改数据源成功!，','success');
			parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('项目','修改数据源失败!，','danger');
		}
	}).fail(function(err){
		alert("错误码"+err.status);
	});
}