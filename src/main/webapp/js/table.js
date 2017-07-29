/**
 * Created by Administrator on 2017/5/11 0011.
 */
$(function () {
    $("#dataGrid").datagrid({
        data:null,
        columns:[[
            {field:'ck',checkbox:true},
            {field:'itemid',title:"ss"},
            {field:'productid',title:"ss"},
            {field:'listprice',align:'center',title:"ss"},
            {field:'attr1',align:'center',title:"ss"},
            {field:'attr1',align:'center',title:"ss"},
            {field:'attr1',align:'center',title:"ss"},
            {field:'attr1',align:'center',title:"ss"},
            {field:'attr1',align:'center',title:"ss"},
            {field:'button',align:'center',formatter:button,title:"操作"}
        ]],

        title:"Basic DataGrid",
        // singleSelect:true,
        cache:false,
        collapsible:true,

    });
    $('#pp').pagination({
        total:0,
        pageSize:10,
        pageNumber:1,
        onSelectPage:function (pageNumber,pageSize) {
            loadDataGrid(null,pageNumber,pageSize);
        }
    });
    $("#w").window('close');
    $('#choseLangule').combobox({
        valueField:'id',
        textField:'text',
        data:null,panelHeight:'auto',
    });
});

var id=(GetQueryString("id"));
var url="../json/datagrid_data4.json";
var commoboxUrl="../json/combobox.json";
function loadDataGrid(params,pageNumber,pageSize){
    ajax(url+"?pageNumber="+pageNumber+"&pageSize="+pageSize,params).done(function (res) {
        console.log(res);
        $("#pp").pagination("refresh",{total:res.total,pageNumber:res.pageNumber});
        $("#dataGrid").datagrid("loadData",res.rows);
    }).fail(function (res) {

    });
}
function loadForm() {
      var commoboxNode=new Array();
     ajax(commoboxUrl).done(function (res) {
        console.log(res);
        $.each(res.data, function(i, item) {
            commoboxNode.push({
                id: item.id,
                text: item.text,
                selected:item.checked
            });
        });
        $("#choseLangule").combobox('loadData',commoboxNode);

    })
}
loadDataGrid(null,1,10);
loadForm();
function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}
function button(value,row,index){
    return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px'>编辑</button> <button  class='easyui-linkbutton button-danger' style='width: 50px;height: 34px;border-radius: 3px'>删除</button>";
}$('#dg').datagrid({
    url:'../json/datagrid_data4.json',
    columns:[[
        {field:'ck',checkbox:true},
        {field:'itemid',title:"ss"},
        {field:'productid',title:"ss"},
        {field:'listprice',align:'center',title:"ss"},
        {field:'attr1',align:'center',title:"ss"},
        {field:'attr1',align:'center',title:"ss"},
        {field:'attr1',align:'center',title:"ss"},
        {field:'attr1',align:'center',title:"ss"},
        {field:'attr1',align:'center',title:"ss"},
        {field:'button',align:'center',formatter:button,title:"操作"}
    ]],fitColumns:false,fit:true
});
function  add() {
    $("#w").window('open');
}
$("#myForm").form('load',{"email":"993198101q.com"});
