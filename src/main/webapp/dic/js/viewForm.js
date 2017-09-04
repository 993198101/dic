$(function(){
	if (getQueryString("viewId") != null) {
		viewId = getQueryString("viewId");
	}
	if(viewId==null){
		 $.messager.alert('获取数据','无传递参数!，','danger');
	}else{
		loadEdit(viewId);
	}
});
var getEditUrl="../view/getViewDTO"
var updateViewUrl="../view/updateView";
var viewId=null;
function loadEdit(id){
	ajax(getEditUrl+"?viewId="+id).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载视图数据失败!，','danger');
		}else{
			$("#viewForm").form('load',data.tView);// 初始化表单
			
			var thead=data.colName;
			if(thead!=null&&thead.length>0){
				for(var i=0;i<thead.length;i++){
					$("#viewHeadTr").append("<th>"+thead[i]+"</th>");
				}
			}
			var tbody=data.colList;
			if(tbody!=null&&tbody.length>0){
				for(var i=0;i<tbody.length;i++){
					$("#viewBody").append("<tr></tr>");
					for(var j=0;j<tbody[i].length;j++){
						$("#viewBody tr").last().append("<td>"+tbody[i][j]+"</td>");
					}
				}
			}
			
		}
	});
}
function saveEdit(){
	var res=$('#viewForm').form('enableValidation').form('validate');
	if(!res) return;
	var formJson = $('#viewForm').serializeObject();
	ajax(updateViewUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.status=="success"){
			$.messager.alert('视图','修改视图成功!，','success');
			//updateTabs(menuTitle,formJson.iName);
			//parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('视图','修改视图失败!，','danger');
		}
	});
}