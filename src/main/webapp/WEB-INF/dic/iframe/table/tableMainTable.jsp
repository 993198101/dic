<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css" rel="stylesheet" type="text/css">

    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_animation.css" rel="stylesheet"
          type="text/css">

    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_plus.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/insdep_theme_default.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/icon.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/font-awesome-4.7.0/css/font-awesome.min.css"
          rel="stylesheet" type="text/css">
    <link href="<%=path %>/dic/css/util.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript"
            src="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
    <script type="text/javascript"
            src="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="<%=path %>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">

    </script>
    <script src="<%=path %>/dic/js/util.js"></script>
</head>
<body class="dhcc-body">
<div class="dhcc-search-form">
    <label class="dhcc-label">表编号:</label>
    <div class="dhcc-input-div">
        <input class="dhcc-input-width easyui-textbox theme-textbox " name="dId" id="dId"
               data-options="prompt:'输入表编号...'"/>
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">表名:</label>
    <div class="dhcc-input-div">
        <input class="easyui-textbox dhcc-input-width"  name="dDate" id="dDate"/>
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">表中文名称:</label>
    <div class="dhcc-input-div">
        <input class="easyui-textbox theme-textbox dhcc-input-width" name="dName" id="dName"
               data-options="prompt:'输入表中文名称...'">
    </div>
    <br/>
    <label class="dhcc-label">是否在用:</label>
    <div class="dhcc-input-div">
        <select id="isOnUse" class="easyui-combobox"
                data-options="url:'../sysParmDic/getOptionList?keyName=YES_OR_NO',valueField:'id',textField:'text',panelHeight: 'auto'"
                style="width: 200px;">
            <!--option 在url  -->
        </select>
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">表空间:</label>
    <div class="dhcc-input-div">
        <input class="easyui-textbox theme-textbox dhcc-input-width" name="dPort" id="dPort"
               data-options="prompt:'输入表空间名...'">
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">所属业务模块:</label>
    <div class="dhcc-input-div">
        <select id="choseDatabaseType" class="easyui-combobox moduleList"
                name="dDatabaseType"
                data-options="valueField:'mId',textField:'mName',panelHeight: 'auto',url:'../table/getModuleOptionList?projectId=${projectId }'"
                style="width: 200px;">
            <!--option 页面加载时一同获取  -->
        </select>
    </div>
    <input name="tSync" value="1" hidden />
    <br/>
    <div class="dhcc-search-button-div">
        <button class="easyui-linkbutton button-line-blue" onclick="query()">查询 <i class="fa fa-search"></i></button>
    </div>
</div>
<div id="add" style="text-align:right;">
    <button class="easyui-linkbutton button-line-grey " onclick="add()">新增</button>
</div>
<div class="dhcc-table-list">
	<!-- 模块和全量共用的是一个url只是参数不同，故需要进行判断见/dic/js/tableMainTable.js -->
    <table id="dataGrid" class="easyui-datagrid" style="width: 99%"
           data-options="pagination:true,loadFilter:dataFilter,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true,toolbar:'#add'">
        <thead>
        <tr>
            <th data-options="field:'tId',align:'center'">表编号</th>
            <th data-options="field:'tName',align:'center'">表名</th>
            <th data-options="field:'tCnName',align:'center'">表中文名</th>
            <th data-options="field:'tOfModule',align:'center'">所属业务模块</th>
            <th data-options="field:'tIsOnUse',align:'center',formatter:function(value){
            																if(value=='1')
            																	return '是'
            																 if(value=='0')
            																	return '否'}">是否在用</th>
            <th data-options="field:'tOfTablespace',align:'center'">表空间</th>
            <th data-options="field:'tSync',align:'center',formatter:function(value){
            															if(value=='2')
            																return '存在差异属性';
            															if(value=='3')
            																return '已同步';
            															if(value=='0')
            																return '系统存在,数据库不存在';
            															if(value=='1')
            																return '系统不存在,数据库存在';
            														}">同步状态</th>
            <th data-options="field:'tDesc',align:'center'">表描述</th>
            <th data-options="field:'button',align:'center',formatter:button">操作</th>
        </tr>
        </thead>
    </table>
</div>
<div id="w" class="easyui-window" style="width:100%;height:550px;" title="表新增<span>表单</span>"
     data-options="modal:true,closed:true,cls:'theme-panel-red'">
    <!-- src="gotoTableMainForm"+queryString 位于tableMainTable.js-->
    <iframe  id="tableMainFormIframe" src="" width="100%" height="1070px"  frameborder="0"  scrolling="no"></iframe>
</div>
<script src="<%=path %>/dic/js/tableMainTable.js"></script>

</body>
</html>