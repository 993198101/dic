<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="padding: 30px 60px;">
	<div style="height: auto; width: 500px; float: left; padding:15px 0;">
		<h5>数据字典项目：</h5>
	</div>
	<div style="height: auto; width: 530px; float: right; padding:15px 0;">
		<h5>实际数据库：</h5>
	</div>
	<div style="height: auto; width: 500px; float: left; border: 1px solid;padding:15px 15px;">
		<form id="tablePKForm">
			<label style="display: inline-block">主键名:</label> 
			<input class="easyui-textbox" name="PKName" id="PKName" style="width: 150px;" /> 
			<input name="consId" hidden /> <br /> <br />
			<table id="tablePKColumnsDatagrid" class="easyui-datagrid"
				style="width: 99%"
				data-options="rownumbers:true,singleSelect: false,singleSelect:true,checkOnSelect:true,selectOnCheck:false,onLoadSuccess:PKOnloadSuccess ">
				<thead>
					<tr>
						<th data-options="field:'columns',width:140">列</th>
						<th data-options="field:'checkbox',checkbox:true">选择</th>
					</tr>
				</thead>
			</table>
		</form>
	</div>
	<div style="height: auto; width: 500px; float: right; border: 1px solid;padding:15px 15px;">
		<form id="difTablePKForm">
			<label style="display: inline-block">主键名:</label> 
			<input class="easyui-textbox" name="difPKName" id="difPKName" style="width: 150px;" /> 
				 <br /> <br />
			<table id="difTablePKColumnsDatagrid" class="easyui-datagrid"
				style="width: 99%"
				data-options="rownumbers:true,singleSelect: false,singleSelect:true,checkOnSelect:true,selectOnCheck:false,onLoadSuccess:PKOnloadSuccess ">
				<thead>
					<tr>
						<th data-options="field:'columns',width:140">列</th>
						<th data-options="field:'checkbox',checkbox:true">选择</th>
					</tr>
				</thead>
			</table>
		</form>
	</div>
	<div style="clear:both"></div>
	<div style="height: auto; width: 530px; float: left; padding:15px 0;text-align:right; ">
		<button type="button" class="easyui-linkbutton button-line-teal l-btn l-btn-small">
			导出ddl
		</button>
		<button type="button" class="easyui-linkbutton button-line-olive l-btn l-btn-small">
			同步到数据库&rarr;
		</button>   
	</div>
	<div style="height: auto; width: 530px; float: right; padding:15px 0;text-align:left; ">
		<button type="button" class="easyui-linkbutton button-line-yellow l-btn l-btn-small">
			&larr;同步到数据字典
		</button>
		<button type="button" class="easyui-linkbutton button-line-teal l-btn l-btn-small">
			导出ddl
		</button>           
	</div>
	<div id="tipMessage" style="clear:both;text-align:center;">
	</div>
</div>
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span> <span
		style="display: inline-block; width: 20px;"></span>
</div>