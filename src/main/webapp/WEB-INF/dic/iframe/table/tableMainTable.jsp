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
                name="dDatabaseType"
                data-options="valueField:'id',textField:'text',url:'../table/getSysDatabaseTypeSelect'"
                style="width: 200px;">
            <!--option 在url获取  -->
        </select>
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">表空间:</label>
    <div class="dhcc-input-div">
        <input class="easyui-textbox theme-textbox dhcc-input-width" name="dPort" id="dPort"
               data-options="prompt:'输入端口号...'">
    </div>
    <span style="display: inline-block; width: 20px;"></span>
    <label class="dhcc-label">所属业务模块:</label>
    <div class="dhcc-input-div">
        <select id="choseDatabaseType" class="easyui-combobox"
                name="dDatabaseType"
                data-options="valueField:'id',textField:'text',url:'../table/getSysDatabaseTypeSelect'"
                style="width: 200px;">
            <!--option 在url获取  -->
        </select>
    </div>
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
           data-options="pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#add'">
        <thead>
        <tr>
            <th data-options="field:'dId',align:'center'">表编号</th>
            <th data-options="field:'dName',align:'center'">表名</th>
            <th data-options="field:'dDesc',align:'center'">表中文名</th>
            <th data-options="field:'dUsername',align:'center'">所属业务模块</th>
            <th data-options="field:'dPassword',align:'center'">是否在用</th>
            <th data-options="field:'dIp',align:'center'">表空间</th>
            <th data-options="field:'dPort',align:'center'">同步状态</th>
            <th data-options="field:'dPort',align:'center'">表描述</th>
            <th data-options="field:'button',align:'center',formatter:button">操作</th>
        </tr>
        </thead>
    </table>
</div>
<div id="w" class="easyui-window" style="width:100%;height:550px;" title="表新增<span>表单</span>"
     data-options="modal:true,closed:true,cls:'theme-panel-red'">
    <iframe src="gotoTableMainForm" id="tableFormIframe" width="100%" height="1070px"  frameborder="0"  scrolling="no"></iframe>
</div>
<script src="<%=path %>/dic/js/tableMainTable.js"></script>

</body>
</html>