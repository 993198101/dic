<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link	href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css" rel="stylesheet" type="text/css">

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
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">
	
</script>
<script src="<%=path%>/dic/js/util.js"></script>
</head>
<body>
	<div style="padding: 10px 5px 5px 15px;">
		<button class="easyui-linkbutton button-primary" onclick="add()">新增</button>
		<button class="easyui-linkbutton button-info">高级查询</button>
	</div>
	<div style="padding: 10px 0 5px 15px;">
		<!--表格-->
		<table style="width: 99%" id="dataGrid"></table>
		<!--pagination-->
		<div id="pp" style="background: #efefef; border: 1px solid #ccc;"></div>
	</div>
	<div id="w" class="easyui-window"
		title="项目新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red'"
		style="width: 800px; height: 500px; padding: 10px;">
		<form id="addProjectForm" class="theme-login-form" method="get" action="<%=path%>/project/addProject" target="formTargetIframe">
			<div style="margin-bottom: 20px">
				<label class="label-top">项目编号:</label> <input
					class="easyui-textbox theme-textbox-radius" name="pId"
					data-options="prompt:'项目编号自动生成...',readonly:true"
					style="width: 100%;">
			</div>
			<div style="margin-bottom: 20px">
				<label class="label-top">项目名称:</label> <input
					class="easyui-textbox theme-textbox-radius" name="pName"
					data-options="prompt:'输入项目名称...'" style="width: 100%;">
			</div>
			<div style="margin-bottom: 20px">
				<label class="label-top">项目描述:</label> <input class="easyui-textbox"
					name="pDesc" style="width: 100%; height: 80px;"
					data-options="prompt:'输入项目描述...',multiline:true">
			</div>
			<div style="margin-bottom: 20px">
				<label class="label-top" style="width: 100%; display: block;">项目生成日期:</label>
				<input type="text" class="easyui-datebox" name="pDate"
					data-options="prompt:'项目日期自动生成...',readonly:true,"></input>
			</div>
			<div style="margin-bottom: 20px">
				<button type="submit"  onclick="submitForm()" type="button" class="easyui-linkbutton button-danger">提交</button>
				<button type="submit" onclick="back()" type="button" class="easyui-linkbutton button-danger">返回</button>
			</div>
			</form>
			<iframe name='formTargetIframe' style='display: none;'></iframe>,
	</div>

	<script src="<%=path%>/dic/js/projectTable.js"></script>
</body>
</html>
