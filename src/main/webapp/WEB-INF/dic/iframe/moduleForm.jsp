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
		<div class="easyui-panel dhcc-form-div" title="业务模块详情">
			<form id="moduleForm" class="theme-login-form" method="get"
				action="<%=path%>/module/addModule"
				target="formTargetIframe">
				<label class="dhcc-label">业务模块编号:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						id="mId" name="mId" data-options="prompt:'输入业务模块编号...',readonly:true">
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
						data-options="editable:false ,readonly:true" name="mDate" id="mDate">
				</div>
				<input type="text" name="mOfDatasource" hidden /> <input
					type="text" name="mOfProject" hidden />
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
	</div>
	<script src="<%=path%>/dic/js/moduleForm.js"></script>
</body>
</html>
