/**
 * Created by ChenShuai on 2017/7/17 0011.
 */
$(function () {
    $("#w").window('close');
});
var addUrl="../module/addModule?parentMenuId="+menuId;
var deleteUrl="../module/deleteModule";
var editUrl="../menu/gotoModuleForm";
var queryParams={};
function  add() {
    $("#w").window('open');
}
function back(){
	$("#w").window('close');
}

function dataFilter(data){
	var tabledata={
			"total":data.total,
			"rows":data.list,
	}
	return tabledata;
}
function button(value,row,index){
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editModule("+row.mId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteModule("+row.mId+")'>删除</button>";
}
function query(){
	queryParams={};
	if($('#mId').textbox('getValue')!="")
		queryParams.mId=$('#mId').textbox('getValue');
	if($('#mName').textbox('getValue')!="")
		queryParams.mName=$('#mName').textbox('getValue');
	if($('#mDate').textbox('getValue')!="")
		queryParams.mDate=formatterDate(new Date($('#mDate').datebox('getValue')));
	if($('#mDesc').textbox('getValue')!="")
		queryParams.mDesc=$('#mDesc').textbox('getValue');
	$('#dataGrid').datagrid('load',queryParams);
	
}
function submitForm(){
	var res=$('#addModuleForm').form('enableValidation').form('validate');
	var formJson = $('#addModuleForm').serializeObject();
	if(res==true)
    ajax(addUrl,JSON.stringify(formJson),'post').done(function(data){
		$.messager.progress('close');//关闭进度
		 $("#w").window('close');
		 
//		 增加模块  返回 0成功，1增加模块失败，2增加模块节点失败，3增加用户节点失败，4增加表空间节点失败
		 if(data.result==1){
			 $.messager.alert('增加模块','增加模块成功!','success');
		 }else{
			 $.messager.alert('增加模块','增加模块失败!，','danger');
		 }
		 parent.loadSec("../menu/getAllMenus");
		 $("#dataGrid").datagrid('reload',queryParams);
	}).fail(function(err){
		alert("错误码"+err.status);
	});
	
}
function deleteModule(moduleId){
	/**
	 * 删除模块
	 * 1为成功，0为失败
	 */
	ajax(deleteUrl+"?moduleId="+moduleId).done(function(data) {
		console.log(data);
		if(data.result==1){
			$.messager.alert('删除模块','删除模块成成功!','success');
			$("#dataGrid").datagrid('reload',queryParams);
		}else{
			$.messager.alert('删除模块','删除模块成成功!','success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editModule(id){
	parent.addMainTab("模块_"+id,editUrl+"?moduleId="+id);
}
