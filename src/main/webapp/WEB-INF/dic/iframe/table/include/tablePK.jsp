<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="height: 500px; width: 400px;">
	<form id="tablePKForm" >
		<label style="display: inline-block">输入主键名:</label> 
		<input class="easyui-textbox" name="PKName" id="PKName" style="width: 200px;" />
	<br/>
	<br/>
	<table id="tablePKColumnsDatagrid" class="easyui-datagrid"
		style="width: 99%"
		data-options="rownumbers:true,singleSelect: false,singleSelect:true,checkOnSelect:true,selectOnCheck:false,onLoadSuccess:PKOnloadSuccess ">
		<thead>
			<tr>
				<th data-options="field:'columns'">列</th>
				<th data-options="field:'checkbox',checkbox:true">选择</th>
				</tr>
				</thead>
		</table>
	</form>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()" class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span>
	<span style="display: inline-block; width: 20px;"></span>
</div>