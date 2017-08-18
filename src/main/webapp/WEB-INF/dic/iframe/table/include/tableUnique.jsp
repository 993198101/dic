<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 
<div id="tableUniqueDiv" style="height: 500px; width: 100%;">
	<div id="message" class="alert" style="width:568px;">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的约束后在下方进行配置.
	</div>
	<div id="tableUniqueDatagridDiv" style="width:600px;">
	<table id="tableUniqueDatagrid" class="easyui-datagrid"
		style="width: 600px; height: auto"
		data-options="
                singleSelect: true,
                toolbar: '#UniqueToolBar',
                onDblClickRow: onDblClickRowUnique,
                onClickRow:onClickRowUnique,
                rownumbers:true
            ">
		<thead>
			<tr>
				<th
					data-options="field:'consName',width:196,editor:{type:'validatebox',options:{validType:'length[1,20]',required:true}}">
					唯一约束名</th>
				<th
					data-options="field:'consFieldName',width:80,formatter: columnsFormatter">列</th>
			</tr>
		</thead>
	</table>
</div>
	<div id="UniqueToolBar" style="height: auto">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			data-options="iconCls:'icon-add',plain:true" onclick="addtableUnique()">新增</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			data-options="iconCls:'icon-remove',plain:true" onclick="removeUnique()">删除</a>
	</div>
	<table id="tableUniqueColumnsDatagrid" class="easyui-datagrid"
		style="width: 600px;"
		data-options="rownumbers:true,singleSelect: false,onCheck:onCheckUnique,
					onUncheck:onUncheckUnique,
					onCheckAll:onCheckAllUnique,
					onUncheckAll:onUncheckAllUnique,fitColumns:true	">
		<thead>
			<tr>
				<th data-options="field:'columns'">列</th>
				<th id="indexCheck" data-options="field:'checkbox',checkbox:true">选择</th>
			</tr>
		</thead>
	</table>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span><span
		style="display: inline-block; width: 20px;"></span>
	<button type="button" onclick="UniqueTest()"
		class="easyui-linkbutton button-line-yellow">ces</button>
</div>


