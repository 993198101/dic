<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="dhcc-search-form">
	<label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">字段名:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox dhcc-input-width" name="fName" id="fName"
			data-options="prompt:'输入字段名...'" />
	</div>
	<label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">字段采用数据元:</label>
	<div class="dhcc-input-div">
		<select id="fDataElement" class="easyui-combobox" name="fDataElement"
			data-options="valueField:'id',textField:'text'" style="width: 200px;">
			<!--option 在url获取  -->
		</select>
	</div>
	<label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">字段中文名:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox dhcc-input-width" name="fCnName"
			id="fCnName" data-options="prompt:'输入字段中文名...'" />
	</div>

	<br /> <label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">是否索引查询字段:</label>
	<div class="dhcc-input-div">
		<select id="fIsSuitQuery" class="easyui-combobox yes_no_option_list"
			name="fIsSuitQuery"
			data-options="valueField:'id',textField:'text',panelHeight:'auto'"
			style="width: 200px;">
			<!--option 在url获取  -->
		</select>
	</div>
	<label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">控件类型
		:</label>
	<div class="dhcc-input-div">
		<select id="fCtrlType" class="easyui-combobox ctrl-type-list"
			name="fCtrlType"
			data-options="valueField:'cId',textField:'cName',url:'../table/listCtrlType',panelHeight:'auto'"
			style="width: 200px;">
			<!--option 在url获取  -->
		</select>
	</div>
	<label
		style="text-align: right; display: inline-block !important; width: 120px !important; line-height: 40px !important;">功能类型
		:</label>
	<div class="dhcc-input-div">
		<select id="fFuncType" class="easyui-combobox func-type-list"
			name="fFuncType"
			data-options="valueField:'fId',textField:'fName',url:'../table/listFuncType',panelHeight:'auto'"
			style="width: 200px;">
			<!--option 在url获取  -->
		</select>
	</div>
	<br />
	<div class="dhcc-search-button-div">
		<button class="easyui-linkbutton button-line-blue"
			onclick="queryTableField()">
			查询 <i class="fa fa-search"></i>
		</button>
	</div>
</div>
<div id="add" style="text-align: right;">
	<button class="easyui-linkbutton button-line-grey "
		onclick="addTableField()">新增</button>
</div>
<div style="background-color: #eee; height: 10px; line-height: 10px;"></div>
<div style="margin-top: 15px; text-align: right; padding-right: 20px;">
	<button type="button" onclick="openCtrlTypeModel()"
		class="easyui-linkbutton button-line-blue">控件类型管理</button>
	<button type="button" onclick="openFuncTypeModel()"
		class="easyui-linkbutton button-line-red">功能类型管理</button>
</div>
<div class="dhcc-table-list">
	<table id="tableFieldDatagrid" class="easyui-datagrid"
		style="width: 99%"
		data-options="pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true,toolbar:'#add'">
		<thead>
			<tr>
				<th data-options="field:'rowId',align:'left',width:25">序号</th>
				<th data-options="field:'fName',align:'left',width:45">字段名</th>
				<th data-options="field:'fCnName',align:'left',width:65">字段中文名</th>
				<th data-options="field:'fAlias',align:'left',width:50">字段别名</th>
				<th data-options="field:'fCtrlType',align:'left',width:50">控件类型</th>
				<th data-options="field:'fFuncType',align:'left',width:50">功能类型</th>
				<th data-options="field:'fCtrlConstraints',align:'left',width:50">控件约束</th>
				<th data-options="field:'fType',align:'left',width:50">字段类型</th>
				<th data-options="field:'fSize',align:'left',width:50">字段长度</th>
				<th data-options="field:'fScale',align:'left',width:50">字段精度</th>
				<th data-options="field:'fDefault',align:'left',width:65">字段默认值</th>
				<th data-options="field:'fComment',align:'left',width:50">字段注释</th>
				<th data-options="field:'fNullable',align:'left',width:65">是否可为空</th>
				<th data-options="field:'fDesc',align:'left',width:85">字段业务描述</th>
				<th data-options="field:'fShowNumber',align:'left',width:50">展示序号</th>
				<th data-options="field:'fIsSuitQuery',align:'left',width:100">是否索引查询字段</th>
				<th data-options="field:'fShowRow',align:'left',width:45">展示行</th>
				<th data-options="field:'fShowCol',align:'left',width:45">展示列</th>
				<th data-options="field:'fShowable',align:'left',width:50">是否展示</th>
				<th data-options="field:'fDataElement',align:'left',width:65">采用数据元</th>
				<th data-options="field:'button',align:'center',formatter:button">操作</th>
			</tr>
		</thead>

	</table>
</div>

<!-- 控件类型的模态框 -->
<jsp:include page="tableCtrlTypeModal.jsp" />
<!-- 功能类型的模态框 -->
<jsp:include page="tableFuncTypeModal.jsp" />
<!-- 字段新增模态框 -->
<div id="w" class="easyui-window dhcc-model" title="字段新增<span>表单</span>"
	data-options="modal:true,closed:true,cls:'theme-panel-red',top:10">
	<form id="addTableFiledForm" class="theme-login-form" method="get"
		action="/table/addTableFiled" target="formTargetIframe">
		<label class="dhcc-label">字段名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox dhcc-input-width" name="fName" 
				data-options="prompt:'输入字段名...',required:true,validType:'isTableName'" />
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">字段类型:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox col-type-option-list" id="fType"
				name="fType"
				data-options="valueField:'id',textField:'text',panelHeight:'auto',value:'20',editable:false,onSelect:choseColType"
				style="width: 200px;">
				<!--option 在url获取  -->
			</select>
		</div>
		<br /> <label class="dhcc-label">字段长度:</label>
		<div class="dhcc-input-div">
			<input
				class="easyui-numberspinner theme-textbox-radius dhcc-input-width"
				name="fSize" id="colSize"
				data-options="prompt:'输入字段长度...',spinAlign:'right',validType:'tableFileSize'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">字段精度:</label>
		<div class="dhcc-input-div">
			<input class="easyui-numberspinner theme-textbox dhcc-input-width"
				name="fScale" id="colScale"
				data-options="prompt:'输入字段精度...',spinAlign:'right',validType:'tableFileScale'">
		</div>
		<br /> <label class="dhcc-label">字段中文名称:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fCnName"
				data-options="prompt:'输入字段中文名称...',validType:'length:[0,30]'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">字段别名:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fAlias"
				data-options="prompt:'输入字段别名...',validType:'length:[0,30]'">
		</div>
		<br /> <label class="dhcc-label">展示序号:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fShowNumber" data-options="prompt:'输入展示行...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">字段功能类型:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox ctrl-type-list" name="fFuncType"
				data-options="valueField:'fId',textField:'fName',url:'../table/listFuncType',panelHeight:'auto',editable:false"
				style="width: 200px;">

			</select>
		</div>
		<br /> <label class="dhcc-label">字段控件类型:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox func-type-list" name="fCtrlType"
				data-options="valueField:'cId',textField:'cName',url:'../table/listCtrlType',panelHeight:'auto',editable:false"
				style="width: 200px;">
				<!--option 在url获取  -->
			</select>
		</div>
		<label
			style="text-align: right; display: inline-block !important; width: 122px !important; line-height: 40px !important;">是否索引查询字段:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox yes_no_option_list"
				name="fIsSuitQuery"
				data-options="valueField:'id',textField:'text',panelHeight:'auto',editable:false"
				style="width: 200px;">
				<!--option 在jq获取  -->
			</select>
		</div>
		<br /> <label class="dhcc-label">控件约束:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fCtrlConstraints" data-options="prompt:'输入控件约束...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">字段默认值:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fDefault" data-options="prompt:'输入字段默认值...'">
		</div>
		<br /> <label class="dhcc-label">字段注释:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fComment" data-options="prompt:'输入字段注释...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">是否可为空:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox yes_no_option_list" name="fNullable"
				data-options="valueField:'id',textField:'text',panelHeight:'auto',editable:false"
				style="width: 200px;">
				<!--option 在jq获取  -->
			</select>
		</div>
		<br /> <label class="dhcc-label">展示行:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fShowRow" data-options="prompt:'输入展示行...'">
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">展示列:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fShowCol" data-options="prompt:'输入展示列...'">
		</div>
		<br /> <label class="dhcc-label">是否展示:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox yes_no_option_list" name="fShowAble"
				data-options="valueField:'id',textField:'text',panelHeight:'auto',editable:false"
				style="width: 200px;">
				<!--option 在jq获取  -->
			</select>
		</div>
		<span style="display: inline-block; width: 20px;"></span> <label
			class="dhcc-label">描述:</label>
		<div class="dhcc-input-div">
			<input class="easyui-textbox theme-textbox dhcc-input-width"
				name="fDesc" data-options="prompt:'输入描述...'">
		</div>
		<br /> <label class="dhcc-label">字段采用数据元:</label>
		<div class="dhcc-input-div">
			<select class="easyui-combobox" name="fDataElement"
				data-options="valueField:'id',textField:'text'"
				style="width: 200px;">
				<!--option 在url获取  -->
			</select>
		</div>
		<input name="fOfTable" hidden />
		<input name=rowId hidden /> <br />
		<div class="dhcc-search-button-div">
			<button type="button" onclick="submitTableFieldForm()"
				class="easyui-linkbutton button-line-yellow">提交</button>
			<button type="button" onclick="back()"
				class="easyui-linkbutton button-line-green">返回</button>
		</div>
	</form>
	<iframe name='formTargetIframe' style='display: none;'></iframe>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span> <span
		style="display: inline-block; width: 20px;"></span>
	<button type="button" onclick="test()"
		class="easyui-linkbutton button-line-yellow">测试</button>
</div>



