
var getEditUrl="../project/getProjectById";
var saveEditUrl="../project/saveProject";
var menuTitle=parent.$('#mainTabs').tabs('getSelected').panel('options').title;
$(function(){
	ajax(getEditUrl+"?pId="+id).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载项目数据失败!，','danger');
		}else{
			$("#projectForm").form('load',{"pId":data.pId,"pName":data.pName,"pDesc":data.pDesc,"pDate":data.pDate});// 初始化表单
		}
	}).fail(function(data){
		
	})
});
function saveEdit(){
	var formJson = $('#projectForm').serializeObject();   
     ajax(saveEditUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.result>0){
			$.messager.alert('项目','修改项目成功!，','success');
			parent.loadSec("../menu/getAllMenus");
			updateTabs(menuTitle,formJson.pName);
		}else{
			$.messager.alert('项目','修改项目失败!，','danger');
		}
	});
}