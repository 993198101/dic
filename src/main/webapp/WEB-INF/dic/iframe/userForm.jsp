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
		<div class="easyui-panel dhcc-form-div" title="用户详情">
			<form id="userForm" class="theme-login-form" method="get"
				action="<%=path%>/user/addBusDatasource" target="formTargetIframe">
				<!-- 2列并行 -->
				<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
					<label class="dhcc-label">用户编号:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="uId"
							data-options="prompt:'输入用户编号...',readonly:true" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">用户生成日期:</label>
					<div class="dhcc-input-div">
						<input class="easyui-datebox" data-options="readonly:true" name="uDate" style="width: 200px;">
					</div>
				</div>
				<!-- 2列并行 -->
				<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
					<label class="dhcc-label">中文标识:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="uCnName"
							data-options="prompt:'中文标识...'" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">用户名:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="uUserName"
							data-options="prompt:'输入用户名...'" style="width: 200px;">
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">密码:</label>
					<div class="dhcc-input-div">
						<input type="text" class="easyui-textbox" name="uPassword"
							data-options="prompt:'输入密码...'" style="width: 200px;" />
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">默认表空间:</label>
					<div class="dhcc-input-div">
						<input type="text" class="easyui-textbox" name="uTablespace"
							data-options="prompt:'输入默认表空间...'" style="width: 200px;" />
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">默认临时表空间:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="uTempTablespace"
							data-options="prompt:'输入默认临时表空间...'" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span>
					<label class="dhcc-label">用户权限:</label>
					<div class="dhcc-input-div">
						<select id="uAccess"  name="uAccess"
							class="dhcc-input-width easyui-combobox" data-options="multiple:true,value:'',editable:false">
							<option value="CONNECT">CONNECT</option>
							<option value="DBA">DBA</option>
							<option value="RESOURCE">RESOURCE</option>
						</select>
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">用户描述:</label>
					<div
						style="display: inline-block !important; width: 500px !important; text-align: left !important;">
						<input class="easyui-textbox" name="uDesc"
							style="width: 100%; height: 80px;"
							data-options="prompt:'输入用户描述...',multiline:true">
					</div>
				</div>
				<input type="text" name="uOfDatasource"  hidden />
				<input type="text" name="uOfProject"  hidden />
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
	</div>
	<script src="<%=path%>/dic/js/userForm.js"></script>
</body>
</html>
