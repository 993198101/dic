/**
 * Created by ChenShuai on 2017/7/26 0011.
 */
$(function () {
    $("#w").window('close');
    if(getQueryString("moduleId")!=null){
    	queryParams.moduleId=getQueryString("moduleId");
    }
    $('#dataGrid').datagrid({url:getPageUrl,queryParams:queryParams});
});
var getPageUrl="../table/getTablesByPage";
// var addUrl="../sysDatasource/addSysDatasource?parentMenuId="+menuId;
var deleteUrl="../sysDatasource/deleteSysDatasource";
var editUrl="../menu/gotoSysDatasourceForm";
var loadSelectUrl="../sysDatasource/loadSelect";
var queryParams={moduleId:"0"};
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
	if(data.list!=null)
	$.each(data.list,function(index,e){
		if(e.dDatabaseType=='1'){
			e.dDatabaseType="Oracle";
		}else if(e.dDatabaseType=='2'){
			e.dDatabaseType="DB2";
		}else if(e.dDatabaseType=='3'){
			e.dDatabaseType="MySQL";
		}else{
			e.dDatabaseType="undefinedDatabaseType";
		}
	});
	var tabledata={
			"total":data.total,
			"rows":data.list,
	}
	return tabledata;
}
function button(value,row,index){
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editSysdatasource("+row.dId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteSysDatasource("+row.dId+")'>删除</button>";
}
function query(){
	queryParams={};
	if($('#dId').textbox('getValue')!="")
		queryParams.dId=$('#dId').textbox('getValue');
	if($('#dName').textbox('getValue')!="")
		queryParams.dName=$('#dName').textbox('getValue');
	if($('#dDate').textbox('getValue')!="")
		queryParams.dDate=formatterDate(new Date($('#dDate').datebox('getValue')));
	if($('#dIp').textbox('getValue')!="")
		queryParams.dIp=$('#dIp').textbox('getValue');
	if($('#dPort').textbox('getValue')!="")
		queryParams.dPort=$('#dPort').textbox('getValue');
	if($('#dService').textbox('getValue')!="")
		queryParams.dService=$('#dService').textbox('getValue');
	if($('#dUsername').textbox('getValue')!="")
		queryParams.dUsername=$('#dUsername').textbox('getValue');
	if($('#choseDatabaseType').textbox('getValue')!="")
		queryParams.dDatabaseType=$('#choseDatabaseType').textbox('getValue');
	$('#dataGrid').datagrid('load',queryParams);
	
}
function submitForm(){
	var formJson={
			tableInfo:null,
			fields:null,
			constraints:null
	};
	var tableInfoFormRes=$('#tableInfoForm').form('enableValidation').form('validate');
	var tableFiledsForm=$('#tableFiledsForm').form('enableValidation').form('validate');
	var tableInfoFormRes=$('#tableInfoForm').form('enableValidation').form('validate');
	
	var tableInfoFormJson = $('#tableInfoForm').serializeObject();
	var tableFiledsFormJson = $('#tableFiledsForm').serializeObject();
	var tableConstraintsFormJson = $('#tableConstraintsForm').serializeObject();
	
	
//	if(res==true)
//    ajax(addUrl,JSON.stringify(formJson),'post').done(function(data){
//		$.messager.progress('close');//关闭进度
//		 $("#w").window('close');
//		 
////		 增加系统数据源  返回 0成功，1增加系统数据源失败，2增加系统数据源节点失败，3增加用户节点失败，4增加表空间节点失败
//		 if(data.result==1){
//			 $.messager.alert('增加系统数据源','增加系统数据源成功!','success');
//		 }else{
//			 $.messager.alert('增加系统数据源','增加系统数据源失败!，','danger');
//		 }
//		 parent.loadSec("../menu/getAllMenus");
//		 $("#dataGrid").datagrid('reload',queryParams);
//	}).fail(function(err){
//		alert("错误码"+err.status);
//	});
	
}
function deleteSysDatasource(dId){
	/**
	 * 删除系统数据源
	 * 1为成功，0为失败
	 */
	ajax(deleteUrl+"?dId="+dId).done(function(data) {
		console.log(data);
		if(data.result==1){
			$.messager.alert('删除系统数据源','删除系统数据源成成功!','success');
			$("#dataGrid").datagrid('reload',queryParams);
		}else{
			$.messager.alert('删除系统数据源','删除系统数据源成成功!','success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editSysdatasource(id){
	location.href=editUrl+"?datasourceId="+id;
}

