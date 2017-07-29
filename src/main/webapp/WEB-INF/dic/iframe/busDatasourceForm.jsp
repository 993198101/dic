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
<link href="<%=path%>/dic/css/util.css" rel="stylesheet" type="text/css"/>
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
		<div class="easyui-panel dhcc-form-div" title="业务数据源详情">
			<form id="datasourceForm" class="theme-login-form" method="get"
				action="<%=path%>/busDatasource/addBusDatasource"
				target="formTargetIframe">
				<!-- 2列并行 -->
				<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
					<label class="dhcc-label">数据源编号:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="dId"
							data-options="prompt:'输入数据源编号...',readonly:true" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">数据源生成日期:</label>
					<div class="dhcc-input-div">
						<input class="easyui-datebox" name="dDate"
							 style="width: 200px;" dataoptions="readonly:true">
					</div>
				</div>
				<!-- 2列并行 -->
				<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
					<label class="dhcc-label">数据源名称:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="dName"
							data-options="prompt:'输入数据源名称...'" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">选择数据库类型:</label>
					<div class="dhcc-input-div">
						<select id="choseDatabaseType" class="easyui-combobox"
							name="dDatabaseType"
							data-options="valueField:'id',textField:'text',url:'../busDatasource/getBusDatabaseTypeSelect',editable:false"
							style="width: 200px;">
							<!--option 在url获取  -->
						</select>
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">数据源用户名:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="dUsername"
							data-options="prompt:'输入数据源用户名...'" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">数据源密码:</label>
					<div class="dhcc-input-div">
						<input type="text" class="easyui-textbox" name="dPassword"
							data-options="prompt:'输入数据源密码...'" style="width: 200px;"></input>
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">数据源ip:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="dIp"
							data-options="prompt:'输入数据源ip...'" style="width: 200px;">
					</div>
					<span style="display: inline-block; width: 20px;"></span> <label
						class="dhcc-label">数据源端口:</label>
					<div class="dhcc-input-div">
						<input type="text" class="easyui-textbox" name="dPort"
							data-options="prompt:'输入数据源端口...'" style="width: 200px;"></input>
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">服务名:</label>
					<div class="dhcc-input-div">
						<input class="easyui-textbox theme-textbox" name="dService"
							data-options="prompt:'输入服务名...'" style="width: 100%;">
					</div>
				</div>
				<div style="margin-bottom: 20px; padding: 0 20px;">
					<label class="dhcc-label">服务名:</label>
					<div
						style="display: inline-block !important; width: 500px !important; text-align: left !important;">
						<input class="easyui-textbox" name="dDesc"
							style="width: 100%; height: 80px;"
							data-options="prompt:'输入项目描述...',multiline:true">
					</div>
				</div>
				<input type="text"  name="dOfProject" hidden />
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
	</div>
	<script src="<%=path%>/dic/js/busDatasourceForm.js"></script>
</body>
</html>
