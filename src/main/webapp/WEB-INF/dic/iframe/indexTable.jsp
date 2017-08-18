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
	<div class="dhcc-search-form">
		<label class="dhcc-label">索引编号:</label>
		<div class="dhcc-input-div">
			<input class="dhcc-input-width easyui-textbox theme-textbox "
				name="iId" id="iId" data-options="prompt:'输入索引编号...'" />
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">索引生成日期:</label>
		<div class="dhcc-input-div">
			<input class="easyui-datebox dhcc-input-width"
				data-options="editable:false " name="iDate" id="iDate">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">索引类别 :</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox dhcc-input-width" name="iType" id="iType"
				data-options="valueField:'id',textField:'text',url:'../sysParmDic/getOptionList?keyName=INDEX_TYPE',editable:false,panelHeight: 'auto'">
				<!--option 在url获取  -->
			</select>
		</div>
		<br /> <label class="dhcc-label">选择关联表:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox" style="width: 200px;" id="iOfTable" name="iOfTable"
				data-options="url:'../table/getTableList',
    						valueField:'tId',
    						textField:'tName',
    						panelHeight: 'auto',editable:false
    			">
			</select>
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">索引中文名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox dhcc-input-width"
				data-options="prompt:'输入中文名...'" name="iCnName" id="iCnName">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">差异状态:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox" style="width: 200px;" id="iSyncState" name="iSyncState"
				data-options="url:'../sysParmDic/getOptionList?keyName=SYNC_STATE',
    						valueField:'id',
    						textField:'text',
    						panelHeight: 'auto',editable:false
    			">
			</select>
		</div>
		<div class="dhcc-search-button-div">
			<button class="easyui-linkbutton button-line-blue" onclick="query()">
				查询 <i class="fa fa-search"></i>
			</button>
		</div>
	</div>
	<div id="addIndex" style="text-align: right;">
		<button class="easyui-linkbutton button-line-grey" onclick="addIndex()">新增</button>
	</div>
	<div class="dhcc-table-list">
		<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
			data-options="pagination:true,pageNumber:0,pageSize:10,cache:false,
        		collapsible:true,loadFilter:dataFilter,singleSelect:true,toolbar:'#addIndex',rowStyler:function(index,row){      
        if (row.iSyncState=='存在差异属性'){      
            return 'color:#db2828;font-weight:bold;';      
        } 
        if (row.iSyncState=='系统不存在,数据库存在'){      
            return 'color:#a333c8;font-weight:bold;';      
        } 
        if (row.iSyncState=='系统存在,数据库不存在'){      
            return 'color:#b5cc18;font-weight:bold;';      
        } 
           
    }">
			<!-- 模块与全部模块公用一个页面，故取数据从/dic/js/indexTable.js 取，传参数不同 -->
			<thead>
				<tr>
					<th data-options="field:'iId',align:'center'">编名</th>
					<th data-options="field:'iName',align:'center'">索引名</th>
					<th data-options="field:'iCnName',align:'center'">索引中文名</th>
					<th data-options="field:'iType',align:'center'">索引类别</th>
					<th data-options="field:'iOfTable',align:'center'">关联表</th>
					<th data-options="field:'iDate',align:'center'">索引生成日期</th>
					<th data-options="field:'iSyncState',align:'center'">同步状态</th>
					<th data-options="field:'button',align:'center',formatter:button">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="w" class="easyui-window dhcc-model"
		title="索引新增<span>表单</span>"
		data-options="modal:true,closed:true,cls:'theme-panel-red'">
		<form id="addIndexForm" class="theme-login-form" method="post"
			action="<%=path%>/index/saveIndex" target="formTargetIframe">
			<label class="dhcc-label">索引名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="iName"
					data-options="prompt:'输入索引名称...',required:true,validType:'length[1,30]'">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">索引描述:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox" name="iDesc" style="width:200px;"
					data-options="prompt:'输入索引描述...',validType:'length[0,50]'">
			</div>
			<br /> <label class="dhcc-label">索引中文名:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox dhcc-input-width"
					name="iCnName"
					data-options="prompt:'输入索引中文名...',validType:'length[0,30]'">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">索引类别 :</label>
			<div class="dhcc-input-div">
				<select class="easyui-combobox dhcc-input-width" name="iType"
					data-options="valueField:'id',textField:'text',url:'../sysParmDic/getOptionList?keyName=INDEX_TYPE',required:true,editable:false,panelHeight: 'auto'">
					<!--option 在url获取  -->
				</select>
			</div>
			<label class="dhcc-label">选择关联表:</label>
			<div class="dhcc-input-div">
				<select class="easyui-combobox" style="width: 200px;"
					name="iOfTable"
					data-options="url:'../table/getTableList',
    					valueField:'tId',
    					textField:'tName',
    					panelHeight: 'auto',editable:false,required:true,onSelect:choseRefTable
    				">
				</select>
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">索引关联列:</label>
			<div class="dhcc-input-div">
				<select id="refColumns" name="refColumns" data-options="editable:false"
					class="easyui-combogrid theme-textbox-radius" style="width: 200px;">
				</select>
			</div>
			<div class="dhcc-search-button-div">
				<button type="button" onclick="submitForm()" type="button"
					class="easyui-linkbutton button-line-yellow">提交</button>
				<button type="button" onclick="back()" type="button"
					class="easyui-linkbutton button-line-green">返回</button>
			</div>
		</form>
		<iframe name='formTargetIframe' style='display: none;'></iframe>
	</div>
</body>
<script src="<%=path%>/dic/js/indexTable.js"></script>
</html>
