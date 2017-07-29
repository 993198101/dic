//$("#myForm").form('load',{"email":"993198101q.com"}); 初始化表单

var getEditUrl="../user/getUserById";
var saveEditUrl="../user/saveUser";
$(function(){
	var userId=getQueryString("userId");
	ajax(getEditUrl+"?userId="+userId).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载用户数据失败!，','danger');
		}else{
			if(data.user.uAccess==null){
				delete data.user.uAccess;
			}
			$("#userForm").form('load',data.user);// 初始化表单
		}
	}).fail(function(data){
		
	})
});
function saveEdit(){
	var res=$('#userForm').form('enableValidation').form('validate');
	if(res==true){
		var formJson = $('#userForm').serializeObject();   
		formJson.uAccess=arrToString(formJson.uAccess);
		ajax(saveEditUrl,JSON.stringify(formJson),'post').done(function(data){
			if(data.result>0){
				$.messager.alert('项目','修改用户成功!，','success');
				parent.loadSec("../menu/getAllMenus");
			}else{
				$.messager.alert('项目','修改用户失败!，','danger');
			}
		}).fail(function(err){
			alert("错误码"+err.status);
		});
	}
	
}