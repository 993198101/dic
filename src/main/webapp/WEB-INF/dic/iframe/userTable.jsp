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
var datasourceId = ${datasourceId};
var menuId = ${menuId};
</script>
</head>
<body class="dhcc-body">
	<div class="dhcc-search-form">
		<label class="dhcc-label">中文标识:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
			 id="uCnName" name="uCnName" data-options="prompt:'中文标识...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">用户名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
			id="uUserName"	name="uUserName" data-options="prompt:'输入用户名...'">
		</div>
		<br /> 
		<label class="dhcc-label">密码:</label>
		<div class="dhcc-input-div">
			<input type="text" class="easyui-textbox dhcc-input-width"
			id="uPassword"	name="uPassword" data-options="prompt:'输入密码...'"></input>
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">默认表空间:</label>
		<div class="dhcc-input-div">
			<input type="text" class="easyui-textbox dhcc-input-width"
			id="uTablespace"	name="uTablespace" data-options="prompt:'输入默认表空间...'"></input>
		</div>
		<br /> 
		<label class="dhcc-label">用户权限:</label>
		<div class="dhcc-input-div">
			<select id="uAccess" id="uAccess" name="uAccess"
				class="dhcc-input-width easyui-combobox" data-options="multiple:true,value:'',editable:false">
				<option value="CONNECT">CONNECT</option>
				<option value="DBA">DBA</option>
				<option value="RESOURCE">RESOURCE</option>
			</select>
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
			data-options="url:'../user/getUsersByPage?uOfProject=${projectId}&uOfDatasource=${datasourceId } ',pagination:true,pageNumber:0,pageSize:10,cache:false,collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#add'">
			<thead>
				<tr>
					<th data-options="field:'uId',align:'center'">编号</th>
					<th data-options="field:'uCnName',align:'center'">中文标识</th>
					<th data-options="field:'uUserName',align:'center'">用户名</th>
					<th data-options="field:'uPassword',align:'center'">密码</th>
					<th data-options="field:'uTablespace',align:'center'">默认表空间</th>
					<th data-options="field:'uTempTablespace',align:'center'">临时表空间</th>
					<th data-options="field:'uAccess',align:'center'">权限</th>
					<th data-options="field:'uDesc',align:'center'">用户描述</th>
					<th data-options="field:'uDate',align:'center'">建立时间</th>
					<th data-options="field:'button',align:'center',formatter:button">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="w" class="easyui-window dhcc-model"
		title="数据库用户新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red'">
		<form id="addUserForm" class="theme-login-form" method="get"
			action="<%=path%>/user/addUser" target="formTargetIframe">
			<!-- 2列并行 -->
			<label class="dhcc-label">中文标识:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="uCnName" data-options="prompt:'中文标识...',required:true,validType:'length[1,30]'">
				</div>
				<span style="display: inline-block; width: 20px;"></span> <label
					class="dhcc-label">用户名:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="uUserName" data-options="prompt:'输入用户名...',required:true,validType:'length[1,30]'">
				</div>
			<br/>
			<br/>
			<label class="dhcc-label">密码:</label>
			<div class="dhcc-input-div">
				<input type="text" class="dhcc-input-width easyui-textbox"
					name="uPassword" data-options="prompt:'输入密码...',required:true,validType:'length[1,30]'" />
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">默认表空间:</label>
			<div class="dhcc-input-div">
				<input type="text" class="dhcc-input-width easyui-textbox"
					name="uTablespace" data-options="prompt:'输入默认表空间...',required:true,validType:'length[1,30]'" />
			</div>
			<br/>
			<br/>
			<label class="dhcc-label">默认临时表空间:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="uTempTablespace" data-options="prompt:'输入默认临时表空间...',required:true,validType:'length[1,30]'">
				</div>
				<span style="display: inline-block; width: 20px;"></span>

			<label class="dhcc-label">用户描述:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox" name="uDesc"
						style="width:200px; height: 80px;"
						data-options="prompt:'输入用户描述...',multiline:true,required:true,validType:'length[1,50]'">
				</div>
			<br/>
			<br /> 
		<label class="dhcc-label">用户权限:</label>
		<div class="dhcc-input-div">
			<select id="uAccess" name="uAccess"
				class="dhcc-input-width easyui-combobox" data-options="multiple:true,value:''">
				<option value="connect">connect</option>
				<option value="DBA" >DBA</option>
				<option value="resource">resource</option>
			</select>
		</div>
		<br/>
			<input type="text" name="uOfProject" value="${projectId}" hidden />
			<input type="text" name="uOfDatasource" value="${datasourceId}"
				hidden />
			<br/>
			<br/>
			<div class="dhcc-search-button-div">
				<button type="button" onclick="submitForm()" type="button" class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button" class="easyui-linkbutton button-line-green">返回</button>
			</div>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>

	</div>
	<script src="<%=path%>/dic/js/userTable.js"></script>
</body>
</html>
