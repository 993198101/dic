<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="height: 500px; width: 600px;">
	<div id="message" class="alert">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的约束后在下方进行配置.
	</div>
	<table class="easyui-datagrid"
		data-options="singleSelect:true,title:'所有唯一约束'">
		<thead>
			<tr>
				<th data-options="field:'FKName',width:'46%'">唯一约束名</th>
				<tH data-options="field:'column',width:'46%'">列</tH>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Table1_ix1</td>
				<td>D_OF_PROJECT，id</td>
			</tr>
			<tr>
				<td>Table1_ix2</td>
				<td>D_username</td>
			</tr>
		</tbody>
	</table>
	<table id="dataGrid" class="easyui-datagrid"
		data-options="title:'外键约束列',pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true">
		<thead>
			<tr>
				<th data-options="field:'column',width:'46%'">列</th>
				<th data-options="field:'button',width:'46%'">选择</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="ref" /></td>

			</tr>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="ref" /></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="ref" /></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="ref" /></td>
			</tr>
		</tbody>
	</table>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span><span
		style="display: inline-block; width: 20px;"></span>
</div>
<script>
	$(".alert-close").click(function() {
		$("#message").hide();
	});
</script>