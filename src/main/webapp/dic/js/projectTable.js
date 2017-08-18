/**
 * Created by ChenShuai on 2017/5/11 0011.
 */
$(function () {
   $("#w").window('close');
});


var getPageUrl="../project/getAllProjects";
var deleteUrl="../project/deleteProject";
var editUrl="../menu/gotoProjectForm";
var queryParams={};
function dataFilter(data){
	
	
	var tabledata={
			"total":data.total,
			"rows":data.list,
	}
	return tabledata;
}
function query(){
	queryParams={};
	if($('#pId').textbox('getValue')!="")
		queryParams.pId=$('#pId').textbox('getValue');
	if($('#pName').textbox('getValue')!="")
		queryParams.pName=$('#pName').textbox('getValue');
	if($('#pDate').textbox('getValue')!="")
		queryParams.pDate=formatterDate(new Date($('#pDate').datebox('getValue')));
	$('#dataGrid').datagrid('load',queryParams);
	
}


function button(value,row,index){
	return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editProject("+row.pId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteProject("+row.pId+")'>删除</button>";
}
function  add() {
    $("#w").window('open');
}
function submitForm(){
	$('#addProjectForm').form({
		onSubmit:function(){
			var res=$(this).form('enableValidation').form('validate');
			res?$.messager.progress():"";
			return res;
		},
		success: function(data){ 
			 $.messager.progress('close');//关闭进度
			 $("#w").window('close');
			 var data = eval('(' + data + ')');
//			 返回   0成功，1增加项目失败，2增加项目菜单失败，3子节点系统数据源增加失败，4子节点业务数据源增加失败
			 if(data.result==1){
				 $.messager.alert('增加项目','增加项目成功!','success');
			 }else{
				 $.messager.alert('增加项目','增加项目失败!','danger');
			 }
			 parent.loadSec("../menu/getAllMenus");
			 $("#dataGrid").datagrid('reload',queryParams);
		},
		
	});	
}
function back(){
	  $("#w").window('close');
}
function deleteProject(pId){
	ajax(deleteUrl+"?pId="+pId).done(function(data) {
		if(data.result==1){
			parent.loadSec("../menu/getAllMenus");
			$.messager.alert('删除项目','删除项目成功!','success');
		}else{
			$.messager.alert('删除项目','删除项目失败!','danger');
		}
		$("#dataGrid").datagrid('reload',queryParams);
	});
}
function editProject(id){
	parent.addMainTab("项目_"+id,editUrl+"?projectId="+id);
}
function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}


