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
		<div class="easyui-panel dhcc-form-div" title="索引详情">
			<form id="indexForm" class="theme-login-form" method="get"
				action="<%=path%>/index/addIndex" target="formTargetIframe">
				<label class="dhcc-label">索引编号:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="iId" data-options="prompt:'输入索引编号...',readonly:true">
				</div>
				<span style="display: inline-block; width: 20px;"></span> <label
					class="dhcc-label">索引生成日期:</label>
				<div class="dhcc-input-div">
					<input class="easyui-datebox dhcc-input-width"
						data-options="readonly:true " name="iDate" id="iDate">
				</div>
				<br />
				 <label
					class="dhcc-label">差异状态:</label>
				<div class="dhcc-input-div">
					<select class="easyui-combobox" style="width: 200px;"
						id="iSyncState" name="iSyncState"
						data-options="url:'../sysParmDic/getOptionList?keyName=SYNC_STATE',
    						valueField:'id',
    						textField:'text',
    						panelHeight: 'auto',editable:false,readonly:true
    			">
					</select>
				</div>
				<span style="display: inline-block; width: 20px;"></span>
				<label class="dhcc-label">索引名称:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="iName"
						data-options="prompt:'输入索引名称...',required:true,validType:'length[1,30]'">
				</div>
				<br />
				<label
					class="dhcc-label">索引描述:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox" name="iDesc" style="width: 200px;"
						data-options="prompt:'输入索引描述...',validType:'length[0,50]'">
				</div>
				<span style="display: inline-block; width: 20px;"></span>
				<label class="dhcc-label">索引中文名:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="iCnName"
						data-options="prompt:'输入索引中文名...',validType:'length[0,30]'">
				</div>
				<br />
				<label class="dhcc-label">索引类别 :</label>
				<div class="dhcc-input-div">
					<select class="easyui-combobox dhcc-input-width" name="iType"
						data-options="valueField:'id',textField:'text',url:'../sysParmDic/getOptionList?keyName=INDEX_TYPE',required:true,editable:false,panelHeight: 'auto'">
						<!--option 在url获取  -->
					</select>
				</div>
				<span style="display: inline-block; width: 20px;"></span>
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
				<br/>
				<label class="dhcc-label">索引关联列:</label>
				<div class="dhcc-input-div">
					<select id="refColumns" name="refColumns" data-options="editable:false"
						class="easyui-combogrid theme-textbox-radius"
						style="width: 200px;">
					</select>
				</div>
				<input type="text" name="iOfProject" hidden /> <input type="text"
					name="iOfDatasource" hidden /> <input type="text" name="iOfModule"
					hidden />
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
	</div>
	<script src="<%=path%>/dic/js/indexForm.js"></script>
</body>
</html>
