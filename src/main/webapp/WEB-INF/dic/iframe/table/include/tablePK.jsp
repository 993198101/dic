<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="height: 500px; width: 400px;">
	<form id="tablePKForm" >
		<label style="display: inline-block">输入主键名:</label> 
		<input class="easyui-textbox" id="PKName" style="width: 200px;" />
	<table class="table table-celled table-structured">
		<thead>
			<tr>
				<th>列</th>
				<th>选择</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="chose" value="id" /></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="checkbox" name="chose" value="id" /></td>
			</tr>
		</tbody>
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