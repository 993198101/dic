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
});
var getPageUrl="../table/getTablesByPage";
var deleteUrl="../table/removeTable";
var editUrl="../table/getTableById";
var loadSelectUrl="../sysDatasource/loadSelect";
var queryParams = {};
function add() {
	var url="gotoTableMainForm?moduleId="+queryParams.tOfModule+"&projectId="+queryParams.tOfProject+"&datasourceId="+queryParams.tOfDatasource;
    document.getElementById("tableMainFormIframe").src=url;
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
	var value=row.tSync;
	if(value=='0'){
		return "<button  class='easyui-linkbutton button-default' style='width: 90px;height: 34px;border-radius: 3px' onclick='viewDifferences("+row.tId+",0)'>查看差异</button>";
	}else if(value=='2'){
		return "<button  class='easyui-linkbutton button-default' style='width: 90px;height: 34px;border-radius: 3px' onclick='viewDifferences("+row.tId+",2,&apos;"+row.tName+"&apos;)'>查看差异</button>";
	}else if(value=='1'){
		return "<button  class='easyui-linkbutton button-default' style='width: 90px;height: 34px;border-radius: 3px' onclick='viewDifferences("+row.tName+",1)'>查看差异</button>";
	}
	else{
		return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editTable("+row.tId+")'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteTable("+row.tId+")'>删除</button>";
	}
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
function viewDifferences(param,type,param2){
	var url="";
	if(type=="0"){
		url="../menu/gotoDifTableMainForm?tableId="+param+"&type=0";
	}else if(type=="1"){
		url="../menu/gotoDifTableMainForm?tableName="+param+"&type=1";
	}else if(type=="2"){
		url="../menu/gotoDifTableMainForm?tableId="+param+"&type=2"+"&tableName="+param2+"&datasourceId="+queryParams.tOfDatasource;
	}
	parent.addMainTab("表差异_"+param,url);
}
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
	var url="../menu/gotoTableMainForm?tableId="+id;
	parent.addMainTab("表_"+id,url);
}

