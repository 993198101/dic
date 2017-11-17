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
		<div class="easyui-panel dhcc-form-div" title="序列详情">
			<form id="seqForm" class="theme-login-form" method="get"
				action="<%=path%>/seq/addSeq" target="formTargetIframe">
				<label class="dhcc-label">索引编号:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="sId" data-options="prompt:'输入索引编号...',readonly:true">
				</div>
				<label
					class="dhcc-label">索引生成日期:</label>
				<div class="dhcc-input-div">
					<input class="easyui-datebox dhcc-input-width"
						data-options="readonly:true " name="sDate" id="sDate">
				</div>
				
				<label class="dhcc-label">序列名称:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="sName"
						data-options="prompt:'输入序列名称...',required:true,validType:'length[1,30]'">
				</div>
				<br />
				<label class="dhcc-label">序列描述 :</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="sDesc"
						data-options="prompt:'输入序列描述...',validType:'length[0,50]'">
				</div>
				<label class="dhcc-label">序列中文名:</label>
				<div class="dhcc-input-div">
					<input class="easyui-textbox theme-textbox dhcc-input-width"
						name="sCnName"
						data-options="prompt:'输入序列中文名...',validType:'length[0,30]'">
				</div>
				<label class="dhcc-label">起始值:</label>
				<div class="dhcc-input-div">
					<input class="easyui-numberspinner" name="sStart"
						style="width: 200px;"
						data-options="prompt:'输入起始值...',validType:'length[1,200]',required:true">
				</div>
				<br />
				<label	class="dhcc-label">增加值:</label>
				<div class="dhcc-input-div">
					<input class="easyui-numberspinner theme-textbox dhcc-input-width"
						name="sIncreaseSize"
						data-options="prompt:'输入序列中文名...',validType:'length[0,30]',required:true">
				</div>
				<label class="dhcc-label">是否有最大值:</label>
				<div class="dhcc-input-div">
					<select class="easyui-combobox yes_no_option_list" name="sHasMax" id="max"
						data-options="valueField:'id',textField:'text',panelHeight:'auto',editable:false,required:true"
						style="width: 200px;">
						<!--option 在jq获取  -->
					</select>
				</div>
				<label class="dhcc-label">最大值:</label>
				<div class="dhcc-input-div">
					<input class="easyui-numberspinner theme-textbox dhcc-input-width"
						name="sMaxValue" id="maxValue"
						data-options="prompt:'输入最大值...',validType:'maxValue'">
				</div>
				<br />
				<label class="dhcc-label">缓存数量:</label>
				<div class="dhcc-input-div">
					<input class="easyui-numberspinner theme-textbox dhcc-input-width"
						name="sCacheNumber"
						data-options="prompt:'输入缓存数量...',validType:'length[0,30]'">
				</div>
				<label class="dhcc-label">关联表:</label>
				<div class="dhcc-input-div">
					<select class="easyui-combobox table-list" name="sRefTable"
						data-options="valueField:'tId',textField:'tName',panelHeight:'auto',editable:false,onSelect:choseRefTable"
						style="width: 200px;">
						<!--option 在jq获取  -->
					</select>
				</div>
				<label class="dhcc-label">关联列:</label>
				<div class="dhcc-input-div">
					<select id="sRefField" class="easyui-combobox table-list"
						name="sRefField"
						data-options="valueField:'fId',textField:'fName',panelHeight:'auto',editable:false"
						style="width: 200px;">
						<!--option 在jq获取  -->
					</select>
				</div>
				<br/>
				<label	class="dhcc-label">模块:</label>
				<div class="dhcc-input-div">
					<select class="easyui-combobox module-list" name="sOfModule"
						data-options="valueField:'mId',textField:'mName',panelHeight:'auto',editable:false"
						style="width: 200px;">
						<!--option 在jq获取  -->
					</select>
				</div>
				<div class="dhcc-save-button-div">
					<button type="button" onclick="saveEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
			</form>
		</div>
	</div>
	<script src="<%=path%>/dic/js/seqForm.js"></script>
</body>
</html>
