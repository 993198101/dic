<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<script>
	var menuId=${menuId};
	var projectId=${projectId};
</script>
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
	<div class="dhcc-search-form">
		<label class="dhcc-label">数据源编号:</label>
		<div class="dhcc-input-div">
			<input class="dhcc-input-width easyui-textbox theme-textbox " name="dId" id="dId"
				data-options="prompt:'输入数据源编号...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> 
		<label class="dhcc-label">数据源生成日期:</label>
		<div class="dhcc-input-div">
			<input class="easyui-datebox dhcc-input-width" 
				name="dDate" id="dDate">
		</div>
		<span style="display: inline-block; width: 20px;"></span> 
		<label class="dhcc-label">数据源中文名称:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" name="dName" id="dName"
				data-options="prompt:'输入数据源中文名称...'">
		</div>
		<label class="dhcc-label">IP地址:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" name="dIp" id="dIp"
				data-options="prompt:'输入IP地址...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> 
		<label class="dhcc-label">端口号:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" name="dPort" id="dPort"
				data-options="prompt:'输入端口号...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> 
		<label class="dhcc-label">服务名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" name="dService" id="dService"
				data-options="prompt:'输入服务名...'">
		</div>
		<br/>
		<label class="dhcc-label">数据源账号:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width" name="dUsername" id="dUsername"
				data-options="prompt:'数据源账号...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span>
		<label class="dhcc-label">选择数据库类型:</label>
		<div class="dhcc-input-div">
				<select id="choseDatabaseType" class="easyui-combobox"
						name="dDatabaseType"
						data-options="valueField:'id',textField:'text',url:'../busDatasource/getBusDatabaseTypeSelect'"
						style="width: 200px;">
					<!--option 在url获取  -->
				</select>
		</div>
		<div class="dhcc-search-button-div">
			<button class="easyui-linkbutton button-line-blue" onclick="query()">查询 <i class="fa fa-search"></i></button>
		</div>
	</div>
	<div id="add" style="text-align:right;">
		<button class="easyui-linkbutton button-line-grey " onclick="add()">新增 </button>
	</div>
	<div class="dhcc-table-list" >
		<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
    		data-options="url:'../busDatasource/getBusDatasourcesByPage?dOfProject=${projectId} ',pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#add'">
    <thead>
		<tr>
			<th data-options="field:'dId',align:'center'">编号</th>
			<th data-options="field:'dName',align:'center'">名字</th>
			<th data-options="field:'dDesc',align:'center'">描述</th>
			<th data-options="field:'dUsername',align:'center'">用户名</th>
			<th data-options="field:'dPassword',align:'center'">密码</th>
			<th data-options="field:'dIp',align:'center'">ip</th>
			<th data-options="field:'dPort',align:'center'">端口</th>
			<th data-options="field:'dService',align:'center'">服务名</th>
			<th data-options="field:'dDate',align:'center'">建立时间</th>
			<th data-options="field:'dDatabaseType',align:'center'">数据库类型</th>
			<th data-options="field:'button',align:'center',formatter:button">操作</th>
		</tr>
    	</thead>
	</table>
	</div>
	<div id="w" class="easyui-window dhcc-model" title="业务数据源新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red'">
		<form id="addBusDatasourceForm" class="theme-login-form" method="get" action="<%=path%>/busDatasource/addBusDatasource" target="formTargetIframe">
			<label class="dhcc-label">数据源名称:</label>
			<div  class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width" name="dName"
					data-options="prompt:'输入数据源名称...',required:true,validType:'length[1,30]'">
			</div>
			<br/>
			<label class="dhcc-label">选择数据库类型:</label>
			<div class="dhcc-input-div">
				<select id="choseDatabaseType" class="easyui-combobox dhcc-input-width" name="dDatabaseType"  data-options="valueField:'id',textField:'text',url:'../busDatasource/getBusDatabaseTypeSelect',required:true,editable:false">
						<!--option 在url获取  -->
				</select>
			</div>
			<span  style="display:inline-block;width:20px;"></span>
			<label class="dhcc-label">数据源用户名:</label>
			<div  class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width" name="dUsername"
							data-options="prompt:'输入数据源用户名...',required:true,validType:'length[1,20]'">
			</div>
			<br/>
			<label class="dhcc-label">数据源密码:</label>
			<div class="dhcc-input-div">
					<input type="text" class="easyui-textbox dhcc-input-width" name="dPassword"
						data-options="prompt:'输入数据源密码...',required:true,validType:'length[1,20]'"></input>
			</div>
			<span  style="display:inline-block;width:20px;"></span>
			<label class="dhcc-label">数据源ip:</label>
			<div  class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width" name="dIp"
							data-options="prompt:'输入数据源ip...',required:true,validType:'isValidIP'">
			</div>
			<br/>
			<label class="dhcc-label">数据源端口:</label>
			<div class="dhcc-input-div">
				<input type="text" class="easyui-textbox dhcc-input-width" name="dPort"
						data-options="prompt:'输入数据源端口...',required:true,validType:'isValidPort'"></input>
			</div>
			<span  style="display:inline-block;width:20px;"></span>
			<label class="dhcc-label">服务名:</label>
			<div  class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width" name="dService"
							data-options="prompt:'输入服务名...',required:true,validType:'length[1,20]'">
			</div>
			<br/>
			<br/>
			<label class="dhcc-label">描述:</label>
			<div  class="dhcc-input-div">
				<input class="easyui-textbox"
					name="dDesc" style="height:60px;width:300px;"
					data-options="prompt:'输入项目描述...',multiline:true,required:true,validType:'length[1,40]'">
			</div>
			<input type="text" name="dOfProject" value="${projectId}" hidden/>
			<div class="dhcc-search-button-div">
				<button type="button"  onclick="submitForm()" type="button" class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button" class="easyui-linkbutton button-line-green">返回</button>
			</div>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>
	</div>
	<script src="<%=path%>/dic/js/busDatasourceTable.js"></script>
</body>
</html>
