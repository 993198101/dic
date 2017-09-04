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
</head>
<body class="dhcc-body">
	<div style="margin: 80px 100px">
		<div class="easyui-panel dhcc-form-div" title="视图详情">
			<form id="viewForm" class="theme-login-form" method="get"
				action="<%=path%>/view/addView" target="formTargetIframe">
				<label class="dhcc-label">视图编号:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="vId" data-options="prompt:'输入视图编号...',readonly:true">
				</div>
				<span style="display: inline-block; width: 20px;"></span> <label
					class="dhcc-label">视图生成日期:</label>
				<div class="dhcc-input-div">
					<input class="easyui-datebox dhcc-input-width"
						data-options="readonly:true " name="vDate" id="vDate">
				</div>
				<br />
				 <label class="dhcc-label">视图名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="vName"
					data-options="prompt:'输入视图名称...',required:true,validType:'length[1,30]'">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">视图描述 :</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="vDesc"
					data-options="prompt:'输入视图描述...',validType:'length[0,50]'">
			</div>
			<br /> <label
				class="dhcc-label">视图中文名:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="vCnName"
					data-options="prompt:'输入视图中文名...',validType:'length[0,30]'">
			</div>
			<span style="display: inline-block; width: 20px;"></span>  <label class="dhcc-label">视图SQL:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox" name="vSql" style="width: 200px;height: 60px;"
					data-options="prompt:'sql末尾不加分号...',multiline:true,validType:'length[1,200]'">
			</div>
				<input type="text" name="vOfProject" hidden /> <input type="text"
					name="vOfDatasource" hidden /> <input type="text" name="vOfModule"
					hidden />
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
		<div class="easyui-panel dhcc-form-div" title="视图展示">
			<table id="viewTable"  class="table table-striped dhcc-table">
				<thead>
					<tr id="viewHeadTr"></tr>
				</thead>
				<tbody id="viewBody"></tbody>
			</table>
		</div>
	</div>
	<script src="<%=path%>/dic/js/viewForm.js"></script>
</body>
</html>
