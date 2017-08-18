/**
 * Created by ChenShuai on 2017/7/26 0011.
 */
$(function () {
    $("#w").window('close');
    if (getQueryString("moduleId") != null) {
		queryParams.tOfModule = getQueryString("moduleId");
	}
	if (getQueryString("projectId") != null) {
		queryParams.tOfProject = getQueryString("projectId");
	}
	if (getQueryString("datasourceId") != null) {
		queryParams.tOfDatasource = getQueryString("datasourceId");
	}
    $('#dataGrid').datagrid({url:getPageUrl,queryParams:queryParams});
    var url="gotoTableMainForm?moduleId="+queryParams.tOfModule+"&projectId="+queryParams.tOfProject+"&datasourceId="+queryParams.tOfDatasource;
    document.getElementById("tableMainFormIframe").src=url;
});
var getPageUrl="../table/getTablesByPage";
var deleteUrl="../table/removeTable";
var editUrl="../table/getTableById";
var loadSelectUrl="../sysDatasource/loadSelect";
var queryParams = {
		moduleId : "0",
		projectId:"0",
		datasourceId:"0"
	};
function add() {
	
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
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editTable("+row.tId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteTable("+row.tId+")'>删除</button>";
}
function query(){
	queryParams={};
	if($('#dId').textbox('getValue')!="")
		queryParams.dId=$('#dId').textbox('getValue');
	if($('#dName').textbox('getValue')!="")
		queryParams.dName=$('#dName').textbox('getValue');
	if($('#dDate').textbox('getValue')!="")
		queryParams.dDate=formatterDate(new Date($('#dDate').datebox('getValue')));
	//if($('#dIp').textbox('getValue')!="")
	//	queryParams.dIp=$('#dIp').textbox('getValue');
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
//function submitForm(){
//	var formJson={
//			tableInfo:null,
//			fields:null,
//			constraints:null
//	};
//	var tableInfoFormRes=$('#tableInfoForm').form('enableValidation').form('validate');
//	var tableFiledsForm=$('#tableFiledsForm').form('enableValidation').form('validate');
//	var tableInfoFormRes=$('#tableInfoForm').form('enableValidation').form('validate');
//	
//	var tableInfoFormJson = $('#tableInfoForm').serializeObject();
//	var tableFiledsFormJson = $('#tableFiledsForm').serializeObject();
//	var tableConstraintsFormJson = $('#tableConstraintsForm').serializeObject();
//	
//}
function deleteTable(id){
	ajax(deleteUrl+"?id="+id).done(function(data) {
		if(data.status=="failure"){
			$.messager.alert('删除表','删除表失败!内部异常','danger');
		}else{
			if(data.result==1){
				$.messager.alert('删除表','删除表成功!','success');
				$("#dataGrid").datagrid('reload',queryParams);
				parent.loadSec("../menu/getAllMenus");
			}else{
				$.messager.alert('删除表','删除表失败,该表已经不存在!','danger');
			}
		}	
	});
}
function editTable(id){
	parent.addMainTab("表_"+id,editUrl+"?tableId="+id);
}

