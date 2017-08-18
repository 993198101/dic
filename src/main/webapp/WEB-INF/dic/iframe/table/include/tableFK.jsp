<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="tableFKDiv" style="height: 500px; width: 100%;">
	<div id="message" class="alert" style="width:568px;">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的外键后在下方进行配置.
	</div>
	<div id="tableFKDatagridDiv" style="width:600px;">
	<table id="tableFKDatagrid" class="easyui-datagrid"
		style="width: 600px; height: auto"
		data-options="
                singleSelect: true,
                toolbar: '#FKToolBar',
                onDblClickRow: onDblClickRowFK,
                onClickRow:onClickRowFK,
                rownumbers:true
            ">
		<thead>
			<tr>
				<th
					data-options="field:'consName',width:80,editor:{type:'validatebox',options:{validType:'length[1,20]',required:true}}">
					外键名</th>
				<th
					data-options="field:'consFieldName',width:80,formatter: columnsFormatter">列</th>
			</tr>
		</thead>
	</table>
</div>
	<div id="FKToolBar" style="height: auto">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			data-options="iconCls:'icon-add',plain:true" onclick="addtableFK()">新增</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			data-options="iconCls:'icon-remove',plain:true" onclick="removeTableFK()">删除</a>
	</div>
	<div id="refTable" style="text-align: right;width:600px;">
		<label style="display: inline-block">选择关联表:</label> 
		<select class="easyui-combobox" id="refTableCombobox" style="width: 150px;"
			data-options="url:'../table/getTableList',
    						valueField:'tId',
    						textField:'tName',
    						onSelect: choseRefTable,panelHeight: 'auto',editable:false
    		">
		</select>
	</div>
	<table id="tableFKColumnsDatagrid" class="easyui-datagrid"
		style="width: 600px;"
		data-options="rownumbers:true,
					singleSelect:true,
					onLoadSuccess:onLoadSuccessFK,
					onCheck:onCheckFK,
					onUncheck:onUncheckFK">
		<thead>
			<tr>
				<th data-options="field:'columns'">列</th>
				<th id="checkboxFK" data-options="field:'checkbox',checkbox:true">选择</th>
				<th data-options="field:'select',editor:{type:'combobox',options:{
					valueField:'fId',
					textField:'fName',
					panelHeight:'auto',
					editable:false,
					onSelect:choseRefCol
					
				}}">关联列
				</th>
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
	<button type="button" onclick="FkTest()"
		class="easyui-linkbutton button-line-yellow">ces</button>
</div>


