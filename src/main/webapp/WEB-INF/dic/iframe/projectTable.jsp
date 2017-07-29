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
<link href="<%=path%>/dic/css/util.css"	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">
	
</script>
<script src="<%=path%>/dic/js/util.js"></script>

</head>
<body	class="dhcc-body">
	<div class="dhcc-search-form">
		<label class="dhcc-label">项目编号:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox" name="pId" id="pId"
				data-options="prompt:'输入项目编号...'" style="width: 200px;">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">项目生成日期:</label>
		<div class="dhcc-input-div">
			<input class="easyui-datebox" data-options="editable:false "
				name="pDate" id="pDate" style="width: 200px;">
		</div>
		<label class="dhcc-label">项目名称:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox" name="pName" id="pName"
				data-options="prompt:'输入项目名称...'" style="width: 200px;">
		</div>
		<div class="dhcc-search-button-div">
			<button type="button" class="easyui-linkbutton button-line-blue"
				onclick="query()">查询 <i class="fa fa-search"></i></button>
		</div>
	</div>
	<!-- style="padding: 10px 5px 5px 15px;" -->
	<div id="add" style="text-align:right;">
		<button type="button" class="easyui-linkbutton button-line-grey "
			onclick="add()">新增</button>
	</div>
	<div class="dhcc-table-list">
		<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
			data-options="url:'../project/getAllProjects',pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#add'">
			<thead>
				<tr>
					<th data-options="field:'pId',align:'center'">项目编号</th>
					<th data-options="field:'pName',align:'center'">项目名称</th>
					<th data-options="field:'pDesc',align:'center'">项目描述</th>
					<th data-options="field:'pDate',align:'center'">项目生成日期</th>
					<th data-options="field:'button',align:'center',formatter:button">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="w" class="easyui-window dhcc-model" title="项目新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red',top:'100px'">
		<form id="addProjectForm" class="theme-login-form" method="post"
			action="<%=path%>/project/addProject" target="formTargetIframe">
			<label class="dhcc-label">项目名称:</label>
			<div class="dhcc-input-div">
				 <input
					class="easyui-textbox theme-textbox-radius" name="pName"
					data-options="prompt:'输入项目名称...',required:true,validType:'length[1,20]'" style="width: 100%;">
			</div>
			<label class="dhcc-label">项目描述:</label>
			<div class="dhcc-input-div">
				 <input class="easyui-textbox"
					name="pDesc" style="width: 200px; height: 60px;"
					data-options="prompt:'输入项目描述...',multiline:true,required:true,validType:'length[1,20]'">
			</div>
			<br/>
			<br/>
			<div class="dhcc-search-button-div">
				<button type="submit" onclick="submitForm()" type="button" class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button" class="easyui-linkbutton button-line-green">返回</button>
			</div>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>
	</div>
	<script src="<%=path%>/dic/js/projectTable.js"></script>
</body>
</html>
