<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="height: 500px; width: 600px;">
	<div id="message" class="alert">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的索引后在下方进行配置.
	</div>
	<table class="easyui-datagrid"
		data-options="singleSelect:true,title:'所有外键约束'">
		<thead>
			<tr>
				<th data-options="field:'FKName'">索引名</th>
				<th data-options="field:'FKName1'">索引类别</th>
				<th data-options="field:'column'">字段</th>
				<th data-options="field:'colum1n'">排序</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Table1_ix1</td>
				<td>普通索引</td>
				<td>D_OF_PROJECT</td>
				<td>ASC</td>
			</tr>
			<tr>
				<td>Table1_ix2</td>
				<td>唯一索引</td>
				<td>D_OF_DATASOURCE</td>
				<td>ASC</td>
			</tr>
		</tbody>
	</table>

	<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
		data-options="title:'索引列',pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true">
		<thead>
			<tr>
				<th data-options="field:'column'">列</th>
				<th data-options="field:'button'">选择</th>
				<th data-options="field:'refColumn'">排序</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>id</td>
				<td><input type="checkbox" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="checkbox" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>D_OF_DATASOURCE</td>
				<td><input type="checkbox" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>D_OF_PROJECT</td>
				<td><input type="checkbox" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
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