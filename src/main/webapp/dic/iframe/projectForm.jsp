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
	<style>
.label-top {
	margin: 0 0 10px;
	display: block;
}
</style>
<div style="margin:80px 100px">
	<div class="easyui-panel" title="Register"
		style=" max-width: 600px; padding: 30px 60px;">
		<form id="projectForm">
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
		</form>
		<button type="button" class="easyui-linkbutton button-primary" onclick="saveEdit()">保存</button>
        <button type="button" class="easyui-linkbutton button-success" onclick="back()">返回</button>
	</div>
</div>
	<script src="<%=path%>/dic/js/projectForm.js"></script>
</body>
</html>
