<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css"
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
<script src="<%=path%>/dic/js/util.js"></script>
</head>
<body class="dhcc-body">
	<div class="dhcc-search-form">
		<label class="dhcc-label">视图编号:</label>
		<div class="dhcc-input-div">
			<input class="dhcc-input-width easyui-textbox theme-textbox "
				name="vId" id="vId" data-options="prompt:'输入视图编号...'" />
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">视图名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox dhcc-input-width" name="vName"
				id="vName" />
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">视图中文名称:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="vCnName" id="vCnName" data-options="prompt:'输入视图中文名称...'">
		</div>
		<br /> <label class="dhcc-label">描述:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="vDesc" id="vDesc" data-options="prompt:'输入视图描述...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">差异状态:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox" style="width: 200px;" id="vSyncState"
				name="vSyncState"
				data-options="url:'../sysParmDic/getOptionList?keyName=SYNC_STATE',
    						valueField:'id',
    						textField:'text',
    						panelHeight: 'auto',editable:false
    			">
			</select>
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">所属业务模块:</label>
		<div class="dhcc-input-div">
			<select id="vOfModule" class="moduleList"
				name="vOfModule"
				data-options="valueField:'mId',textField:'mName',panelHeight: 'auto'"
				style="width: 200px;">
				<!--option 页面加载时一同获取  -->
			</select>
		</div>
		<input name="tSync" value="1" hidden /> <br />
		<div class="dhcc-search-button-div">
			<button class="easyui-linkbutton button-line-blue" onclick="query()">
				查询 <i class="fa fa-search"></i>
			</button>
		</div>
	</div>
	<div id="add" style="text-align: right;">
		<button class="easyui-linkbutton button-line-grey "
			onclick="addView()">新增</button>
	</div>
	<div class="dhcc-table-list">
		<!-- 模块和全量共用的是一个url只是参数不同，故需要进行判断见/dic/js/viewTable.js -->
		<table id="dataGrid"  style="width: 99%"
			data-options="pagination:true,loadFilter:dataFilter,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true,toolbar:'#add',rowStyler: function(index,row){
																		var value=row.tSync;
																		if(value=='2')
            																return 'color:#db2828;font-weight:bold;';
            															if(value=='0')
            																return 'color:#b5cc18;font-weight:bold;'; 
            															if(value=='1')
            																return 'color:#a333c8;font-weight:bold;';
	}">
			<thead>
				<tr>
					<th data-options="field:'vId',align:'center'">视图编号</th>
					<th data-options="field:'vName',align:'center'">视图名</th>
					<th data-options="field:'vCnName',align:'center'">视图中文名</th>
					<th data-options="field:'vOfModule',align:'center'">所属业务模块</th>
					<th data-options="field:'vSyncState',align:'center',formatter:function(value){
            															if(value=='2')
            																return '存在差异属性';
            															if(value=='3')
            																return '已同步';
            															if(value=='0')
            																return '系统存在,数据库不存在';
            															if(value=='1')
            																return '系统不存在,数据库存在';
            														}">同步状态</th>
					<th data-options="field:'vDesc',align:'center'">视图描述</th>
					<th data-options="field:'button',align:'center',formatter:button">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="w" class="easyui-window" style="width: 1100px; height: auto;"
		title="视图新增<span>视图单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red',height:20">
		<form id="addViewForm" class="theme-login-form" method="post"
			action="<%=path%>/index/saveView" target="formTargetIframe">
			<br/>
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
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">视图中文名:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="vCnName"
					data-options="prompt:'输入视图中文名...',validType:'length[0,30]'">
			</div>
			<br /> <label class="dhcc-label">视图SQL:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox" name="vSql" style="width: 200px;height: 60px;"
					data-options="prompt:'sql末尾不加分号...',multiline:true,validType:'length[1,200]'">
			</div>
			<br /><br/>
			<div class="dhcc-search-button-div">
				<button type="button" onclick="submitForm()" type="button"
					class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button"
					class="easyui-linkbutton button-line-green">返回</button>
			</div>
			<br/>
			<br/>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>
	</div>
	<script src="<%=path%>/dic/js/viewTable.js"></script>
</body>
</html>