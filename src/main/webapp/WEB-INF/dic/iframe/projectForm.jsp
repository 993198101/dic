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
<link href="<%=path%>/dic/css/util.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">
	
</script>
<script>var id = ${id};</script>
<script src="<%=path%>/dic/js/util.js"></script>
</head>
<body class="dhcc-body">
	<div style="margin: 80px 100px">
		<div class="easyui-panel dhcc-form-div" title="项目详情"
			>
			<form id="projectForm">
				<label class="dhcc-label">项目编号:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox-radius" name="pId"
						data-options="prompt:'项目编号自动生成...',readonly:true"
						style="width: 200px;">
				</div>
				<label class="dhcc-label">项目名称:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox-radius" name="pName"
						data-options="prompt:'输入项目名称...',required:true,validType:'length[1,20]'"
						style="width: 100%;">
				</div>
				<br/>
				<br/>
				<label class="dhcc-label">项目描述:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox" name="pDesc"
						style="width: 200px; height: 60px;"
						data-options="prompt:'输入项目描述...',multiline:true,required:true,validType:'length[1,20]'">
				</div>
				<label class="dhcc-label">项目生成日期:</label>
				<div class="dhcc-input-div">
					<input type="text" class="easyui-datebox" name="pDate"
						data-options="prompt:'项目日期自动生成...',readonly:true,"></input>
				</div>
			</form>
			<div class="dhcc-save-button-div">
				<button type="button" class="easyui-linkbutton button-line-yellow"
					onclick="saveEdit()">保存</button>
			</div>
		</div>
	</div>
	<script src="<%=path%>/dic/js/projectForm.js"></script>
</body>
</html>
