<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="tableIndexDiv" style="height: 500px; width: 100%;">
	<div id="message" class="alert" style="width: 568px;">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的索引后在下方进行配置.
	</div>
	<div id="tableIndexDatagridDiv" style="width: 600px;">
		<table id="tableIndexDatagrid" class="easyui-datagrid"
			style="width: 600px; height: auto"
			data-options="
                singleSelect: true,
                toolbar: '#IndexToolBar',
                onDblClickRow: onDblClickRowIndex,
                onClickRow:onClickRowIndex,
                rownumbers:true,fitColumns:true
            ">
			<thead>
				<tr>
					<th
						data-options="field:'iName',editor:{type:'validatebox',options:{validType:'length[1,20]',required:true}}">索引名</th>
					<th
						data-options="field:'iType',formatter:iTypeFormatter,editor:{type:'combobox',options:{
					valueField:'id',
					textField:'text',
					panelHeight:'auto',
					editable:false,
					url:'../sysParmDic/getOptionList?keyName=INDEX_TYPE',
					required:true
				}}">索引类别</th>
					<th data-options="field:'refColumns'">字段</th>
					<th data-options="field:'iSort',formatter:iSortFormatter,editor:{type:'combobox',options:{
					valueField:'id',
					textField:'text',
					panelHeight:'auto',
					editable:false,
					url:'../sysParmDic/getOptionList?keyName=INDEX_SORT',
					required:true
				}}">排序</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="IndexToolBar" style="height: auto">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			data-options="iconCls:'icon-add',plain:true"
			onclick="addtableIndex()">新增</a> <a href="javascript:void(0)"
			class="easyui-linkbutton"
			data-options="iconCls:'icon-remove',plain:true"
			onclick="removeTableIndex()">删除</a>
	</div>
	<!-- 
	<div id="refTable" style="text-align: right; width: 600px;">
		<label style="display: inline-block">选择关联表:</label> <select
			class="easyui-combobox" id="refTableCombobox" style="width: 150px;"
			data-options="url:'../table/getTableList',
    						valueField:'tId',
    						textField:'tName',
    						onSelect: choseRefTable,panelHeight: 'auto',editable:false
    		">
		</select>
	</div>
	refColumns
	 -->
	<div id="tabIndexDiv">
		<table id="tableIndexColumnsDatagrid" class="easyui-datagrid"
			style="width: 600px;"
			data-options="rownumbers:true,singleSelect: false,
					onCheck:onCheckIndex,
					onUncheck:onUncheckIndex,
					onCheckAll:onCheckAllIndex,
					onUncheckAll:onUncheckAllIndex,
					fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'columns'">列</th>
					<th id="checkboxIndex"
						data-options="field:'checkbox',checkbox:true">选择</th>
				</tr>
			</thead>
		</table>
	</div>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span><span
		style="display: inline-block; width: 20px;"></span>
	<button type="button" onclick="indexTest()"
		class="easyui-linkbutton button-line-yellow">ces</button>
</div>