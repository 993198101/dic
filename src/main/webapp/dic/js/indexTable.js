/**
 * Created by ChenShuai on 2017/8/14 0011.
 */
$(function () {
    $("#w").window('close');
    if (getQueryString("moduleId") != null) {
		queryParams.iOfModule = getQueryString("moduleId");
	}
	if (getQueryString("projectId") != null) {
		queryParams.iOfProject = getQueryString("projectId");
	}
	if (getQueryString("datasourceId") != null) {
		queryParams.iOfDatasource = getQueryString("datasourceId");
	}
    $('#dataGrid').datagrid({url:getPageUrl,queryParams:queryParams});
    $("#refColumns").combogrid({
    		panelWidth: 200,
    		required:true,
            multiple: true,
            idField: 'fId',
            textField: 'fName',
            url: '../table/getTableFieldList',
            queryParams: {
        		tableId: tableId
        	},
            method: 'get',
            value: [],
            columns: [[
                {field:'fId',title:'字段编号',width:80},
                {field:'fName',title:'字段名',width:120},
            ]]
            });
            
});
var queryParams={
		moduleId:"0"
};
var saveIndexUrl="../index/saveIndex";
var getPageUrl="../index/getIndexsByPage";
var removeIndexUrl="../index/removeIndex";
var editUrl="../menu/gotoIndexForm";
var tableId="0";
function query(){
	var queryParams={};
	if($('#iId').textbox('getValue')!="")
		queryParams.iId=$('#iId').textbox('getValue');
	if($('#iDate').datebox('getValue')!="")
		queryParams.iDate=$('#iDate').datebox('getValue');
	if($('#iType').combobox('getValue')!="")
		queryParams.iType=$('#iType').combobox('getValue');
	if($('#iOfTable').combobox('getValue')!="")
		queryParams.iOfTable=$('#iOfTable').combobox('getValue');
	if($('#iCnName').textbox('getValue')!="")
		queryParams.iCnName=$('#iCnName').textbox('getValue');
	if($('#iSyncState').combobox('getValue')!="")
		queryParams.iSyncState=$('#iSyncState').combobox('getValue');
	$('#dataGrid').datagrid('load',queryParams);
}
function choseRefTable(record){
	tableId=record.tId;
	$("#refColumns").combogrid('clear');
	$("#refColumns").combogrid('grid').datagrid('reload',{
		tableId: tableId
	});
}
function dataFilter(data){
	for(var i=0;i<data.list.length;i++){
		if(data.list[i].iType=="0"){
			data.list[i].iType="普通索引";
		}
		if(data.list[i].iType=="1"){
			data.list[i].iType="唯一索引";
		}
		if(data.list[i].iSyncState=="0"){
			data.list[i].iSyncState="系统存在,数据库不存在";
		}
		if(data.list[i].iSyncState=="1"){
			data.list[i].iSyncState="系统不存在,数据库存在";
		}
		if(data.list[i].iSyncState=="2"){
			data.list[i].iSyncState="存在差异属性";
		}
		if(data.list[i].iSyncState=="3"){
			data.list[i].iSyncState="已同步";
		}
		
	}
	var tabledata={
			"total":data.total,
			"rows":data.list,
	}
	return tabledata;
}
function button(value,row,index){
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editIndex("+row.iId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteIndex("+row.iId+")'>删除</button>";
}
function addIndex(){
	$("#w").window('open');
}
function back(){
	$("#w").window('close');
}
function submitForm(){
	var res=$('#addIndexForm').form('enableValidation').form('validate');
	if(!res) return ;
	var formJson = $('#addIndexForm').serializeObject();
	formJson.iOfProject=queryParams.iOfProject;
	formJson.iOfModule=queryParams.iOfModule;
	formJson.iOfDatasource=queryParams.iOfDatasource;
	if(!(formJson.refColumns instanceof Array)){
		formJson.refColumns=formJson.refColumns.split("030");
	}
	ajax(saveIndexUrl,JSON.stringify(formJson),'post').done(function(data){
		$.messager.progress('close');//关闭进度
		 $("#w").window('close');
		 if(data.status=="success"){
			 $.messager.alert('增加索引','增加索引成功!','success');
		 }else{
			 $.messager.alert('增加索引','增加索引失败!','danger');
		 }
		 parent.loadSec("../menu/getAllMenus");
		 $("#dataGrid").datagrid('reload',queryParams);
	}).fail(function(err){
		$.messager.alert('增加索引','增加索引失败!，错误码='+err.status,'danger');
	});
}
function deleteIndex(id){
	ajax(removeIndexUrl+"?id="+id).done(function(data) {
		if(data.status=="success"){
			$.messager.alert('删除索引','删除索引成功!','success');
			$("#dataGrid").datagrid('reload',queryParams);
		}else{
			$.messager.alert('删除索引','删除索引失败!','success');
		}
		parent.loadSec("../menu/getAllMenus");
	});
}
function editIndex(id){
	parent.addMainTab("索引_"+id,editUrl+"?indexId="+id);
}