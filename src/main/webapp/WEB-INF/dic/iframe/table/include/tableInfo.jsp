<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form id="tableInfoForm">
	<label class="dhcc-label">表名称:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox theme-textbox dhcc-input-width"
			name="tName"
			data-options="prompt:'输入表名称...',required:true,validType:'length[1,20]'">
	</div>
	<span style="display: inline-block; width: 20px;"></span> <label
		class="dhcc-label">表中文名:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox theme-textbox dhcc-input-width"
			name="tCnName"
			data-options="prompt:'输入表中文名...',required:true,validType:'length[1,20]'">
	</div>
	<br /> <br /> <label class="dhcc-label">所属业务模块:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width" name="tOfModule"
			data-options="valueField:'id',textField:'text',url:'../table/getSysDatabaseTypeSelect'">
			<!--option 在url获取  -->
		</select>
	</div>
	<span style="display: inline-block; width: 20px;"></span> <label
		class="dhcc-label">是否在用:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width" name="tIsOnUse" value="yes"
			data-options="valueField:'id',textField:'text',url:'../table/getSysDatabaseTypeSelect',required:true">
			<!--option 在url获取  -->
		</select>
	</div>
	<br /> <br /> <label class="dhcc-label">表空间:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width" name="tOfTablespace" value="USERS"
			data-options="valueField:'id',textField:'text',url:'../table/getSysDatabaseTypeSelect',required:true">
			<!--option 在url获取  -->
		</select>
	</div>
	<span style="display: inline-block; width: 20px;"></span> <label
		class="dhcc-label">表描述:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox" name="tDesc"
			style="height: 60px; width: 300px;"
			data-options="prompt:'输入表描述...',multiline:true,required:true,validType:'length[1,40]'" />
	</div>
</form>
<br />
<div class="dhcc-table-tab-confirm-div">
	<hr />
	<div style="height: 10px;"></div>
	<button type="button" onclick="submitForm()"
		class="easyui-linkbutton button-line-yellow">确定</button>
	<span style="display: inline-block; width: 20px;"></span> <span
		style="display: inline-block; width: 20px;"></span>
</div>