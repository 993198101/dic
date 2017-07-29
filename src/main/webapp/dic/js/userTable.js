/**
 * Created by ChenShuai on 2017/7/11 0011.
 */
$(function () {
    $("#w").window('close');
});
var queryParams={};
var addUrl="../user/addUser?parentMenuId="+menuId;
var deleteUrl="../user/deleteUser";
var editUrl="../menu/gotoUserForm";
var loadSelectUrl="../user/loadSelect";

function  add() {
    $("#w").window('open');
}
function back(){
	$("#w").window('close');
}

function loadSelect() {
     var commoboxNode=new Array();
     ajax(loadSelectUrl).done(function (res) {
        console.log(res);
        $.each(res.data, function(i, item) {
            commoboxNode.push({
                id: item.id,
                text: item.text,
                selected:item.checked
            });
        });
        $("#choseDatabaseType").combobox('loadData',commoboxNode);

    })
}

function dataFilter(data){
	var tabledata={
			"total":data.total,
			"rows":data.list,
	}
	return tabledata;
}
function button(value,row,index){
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editSysdatasource("+row.uId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteUser("+row.uId+")'>删除</button>";
}

function submitForm(){
	var res=$('#addUserForm').form('enableValidation').form('validate');
	if(res==true){
		var formJson = $('#addUserForm').serializeObject();
		formJson.uAccess=arrToString(formJson.uAccess);
		ajax(addUrl,JSON.stringify(formJson),'post').done(function(data){
			$.messager.progress('close');//关闭进度
			 $("#w").window('close');
//			 增加用户  返回 0成功，1增加用户失败，2增加用户节点失败，3增加用户节点失败，4增加表空间节点失败
			 if(data.result==1){
				 $.messager.alert('增加用户','增加用户成功!','success');
			 }else{
				 $.messager.alert('增加用户','增加用户失败!，','danger');
			 }
			 parent.loadSec("../menu/getAllMenus");
			 $("#dataGrid").datagrid('reload',queryParams);
		}).fail(function(err){
			alert("错误码"+err.status);
		});
	}
	
	
}
function deleteUser(dId){
	/**
	 * 删除用户
	 * 1为成功，0为失败
	 */
	ajax(deleteUrl+"?dId="+dId).done(function(data) {
		if(data.result==1){
			$.messager.alert('删除用户','删除用户成功!','success');
			$("#dataGrid").datagrid('reload',queryParams);
		}else{
			$.messager.alert('删除用户','删除用户成功!','success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editSysdatasource(id){
	location.href=editUrl+"?userId="+id;
}
function query(){
	queryParams={};
	if($('#uCnName').textbox('getValue')!="")
		queryParams.uCnName=$('#uCnName').textbox('getValue');
	if($('#uUserName').textbox('getValue')!="")
		queryParams.uUserName=$('#uUserName').textbox('getValue');
	if($('#uPassword').textbox('getValue')!="")
		queryParams.uPassword=$('#uPassword').textbox('getValue');
	if($('#uTablespace').textbox('getValue')!="")
		queryParams.uTablespace=$('#uTablespace').textbox('getValue');
	if($('#uAccess').textbox('getValue')!=""){
		var arr=[];
		arr=$("#uAccess").combobox('getValues');
		queryParams.uAccess=dataProcessing(arr);
	}
	$('#dataGrid').datagrid('load',queryParams);
}
