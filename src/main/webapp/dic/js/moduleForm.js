//$("#myForm").form('load',{"email":"993198101q.com"}); 初始化表单

var getEditUrl="../module/getModuleById";
var saveEditUrl="../module/saveModule";
$(function(){
	var moduleId=getQueryString("moduleId");
	ajax(getEditUrl+"?moduleId="+moduleId).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载模块数据失败!，','danger');
		}else{
			$("#moduleForm").form('load',data.module);// 初始化表单
		}
	}).fail(function(data){
		
	})
});
function saveEdit(){
	var formJson = $('#moduleForm').serializeObject();   
     ajax(saveEditUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.result>0){
			$.messager.alert('模块','修改模块成功!，','success');
			parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('模块','修改模块失败!，','danger');
		}
	});
}