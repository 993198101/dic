<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css"
	rel="stylesheet" type="text/css">

<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_animation.css"
	rel="stylesheet" type="text/css">

<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_plus.css"
	rel="stylesheet" type="text/css">

<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/insdep_theme_default.css"
	rel="stylesheet" type="text/css">

<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/icon.css"
	rel="stylesheet" type="text/css">

<link
	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=path%>/dic/css/util.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">
	
</script>
<script src="<%=path%>/dic/js/util.js"></script>
<script>
	var menuId = ${menuId};
</script>
</head>
<body class="dhcc-body">
	<div class="dhcc-search-form">
		<label class="dhcc-label">业务模块编号:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" id="mId"
				name="mId" data-options="prompt:'输入业务模块编号...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">业务模块名称:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				id="mName" name="mName" data-options="prompt:'输入业务模块名称...'">
		</div>
		<br /> <label class="dhcc-label">业务模块描述:</label>
		<div class="dhcc-input-div">
			<input type="text" class="easyui-textbox dhcc-input-width"
				id="mDesc" name="mDesc" data-options="prompt:'输入业务模块描述...'"></input>
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">业务模块生成日期:</label>
		<div class="dhcc-input-div">
			<input class="easyui-datebox dhcc-input-width"
				data-options="editable:false " name="mDate" id="mDate">
		</div>
		<div class="dhcc-search-button-div">
			<button class="easyui-linkbutton button-line-blue" onclick="query()">
				查询 <i class="fa fa-search"></i>
			</button>
		</div>

	</div>
	<div id="add" style="text-align: right;">
		<button class="easyui-linkbutton button-line-grey" onclick="add()">新增</button>

	</div>
	</div>
	<div class="dhcc-table-list">
		<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
			data-options="url:'../module/getModulesByPage?mOfProject=${projectId}&mOfDatasource=${datasourceId } ',pagination:true,pageNumber:0,pageSize:10,cache:false,collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#add'">
			<thead>
				<tr>
					<th data-options="field:'mId',align:'center'">业务模块编号</th>
					<th data-options="field:'mName',align:'center'">业务模块名称</th>
					<th data-options="field:'mDate',align:'center'">模块生成日期</th>
					<th data-options="field:'mDesc',align:'center'">模块描述</th>
					<th data-options="field:'button',align:'center',formatter:button">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="w" class="easyui-window dhcc-model"
		title="数据库用户新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red'">
		<form id="addModuleForm" class="theme-login-form" method="get"
			action="<%=path%>/module/addModule" target="formTargetIframe">
			<label class="dhcc-label">业务模块名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					id="mName" name="mName" data-options="prompt:'输入业务模块名称...'" />
			</div>
			<span style="display: inline-block; width: 20px;"></span>
			<label class="dhcc-label">业务模块描述:</label>
			<div class="dhcc-input-div">
				<input type="text" class="easyui-textbox dhcc-input-width"
					id="uPassword" name="mDesc" data-options="prompt:'输入业务模块描述...'" />
			</div>
			<br /> 
			<input type="text" name="mOfProject" value="${projectId}" hidden />
			<input type="text" name="mOfDatasource" value="${datasourceId}" hidden /> 
			<br /> 
			<br />
			<div class="dhcc-search-button-div">
				<button type="button" onclick="submitForm()" type="button"
					class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button"
					class="easyui-linkbutton button-line-green">返回</button>
			</div>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>

	</div>
	<script src="<%=path%>/dic/js/moduleTable.js"></script>
</body>
</html>
