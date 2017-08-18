$(function(){
	if (getQueryString("indexId") != null) {
		indexId = getQueryString("indexId");
	}
	if(indexId==null){
		 $.messager.alert('获取数据','无传递参数!，','danger');
	}
	ajax(getEditUrl+"?indexId="+indexId).done(function(data){
		if(data==null){
			 $.messager.alert('获取数据','加载索引数据失败!，','danger');
		}else{
			$("#indexForm").form('load',data);// 初始化表单
			$("#refColumns").combogrid({
	    		panelWidth: 200,
	    		required:true,
	            multiple: true,
	            idField: 'fId',
	            textField: 'fName',
	            url: '../table/getTableFieldList',
	            queryParams: {
	        		tableId: data.iOfTable
	        	},
	            method: 'get',
	            value: [],
	            columns: [[
	                {field:'fId',title:'字段编号',width:80},
	                {field:'fName',title:'字段名',width:120},
	            ]]
	            });
			$('#refColumns').combogrid('setValue', data.refColumns);
		}
	}).fail(function(data){
		 $.messager.alert('获取数据','加载索引数据失败!，','danger');
	})
});
var indexId=null;
var getEditUrl="../index/getIndexDTO";
var updateIndexUrl="../index/updateIndex";
function choseRefTable(record){
	tableId=record.tId;
	$("#refColumns").combogrid('clear');
	$("#refColumns").combogrid('grid').datagrid('reload',{
		tableId: tableId
	});
}
function saveEdit(){
	var res=$('#indexForm').form('enableValidation').form('validate');
	if(!res) return;
	var formJson = $('#indexForm').serializeObject();
	if(!(formJson.refColumns instanceof Array)){
		formJson.refColumns=formJson.refColumns.split("030");
	}
     ajax(updateIndexUrl,JSON.stringify(formJson),'post').done(function(data){
		if(data.status="success"){
			$.messager.alert('索引','修改数据源成功!，','success');
			//updateTabs(menuTitle,formJson.iName);
			//parent.loadSec("../menu/getAllMenus");
		}else{
			$.messager.alert('索引','修改数据源失败!，','danger');
		}
	});
}