<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form id="tableInfoForm">
	<label class="dhcc-label">表名称:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox theme-textbox dhcc-input-width"
			name="tName"
			data-options="prompt:'输入表名称...',required:true,validType:'isTableName'">
	</div>
	<span style="display: inline-block; width: 20px;"></span> 
	<label	class="dhcc-label">表中文名:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox theme-textbox dhcc-input-width"
			name="tCnName"
			data-options="prompt:'输入表中文名...',validType:'length[1,30]'">
	</div>
	<br /> <br /> <label class="dhcc-label">所属业务模块:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width module_option_list" name="tOfModule" id="tOfModule"
			data-options="valueField:'mId',textField:'mName',panelHeight: 'auto',onLoadSuccess: function () {   
  				var data = $('#tOfModule').combobox('getData');  
             	if (data.length > 0) {  
                  $('#tOfModule').combobox('select', data[0].mId);  
              	}   
 		}">
			<!--option 在jq加载时获取  -->
		</select>
	</div>
	<span style="display: inline-block; width: 20px;"></span> <label
		class="dhcc-label">是否在用:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width yes_no_option_list" name="tIsOnUse" value="yes"
			data-options="valueField:'id',textField:'text',panelHeight: 'auto',required:true,value:'1'">
			<!--option 在url获取  -->
		</select>
	</div>
	<br /> <br /> <label class="dhcc-label">表空间:</label>
	<div class="dhcc-input-div">
		<select class="easyui-combobox dhcc-input-width tablespace-option-list" name="tOfTablespace" id="tOfTablespace"
			data-options="valueField:'tId',textField:'tName',panelHeight: 'auto',onLoadSuccess: function () {   
  				var data = $('#tOfTablespace').combobox('getData');  
             	if (data.length > 0) {  
                  $('#tOfTablespace').combobox('select', data[0].tId);  
              	}   
 			}">
			<!--option 在jq加载时获取  -->
		</select>
	</div>
	<span style="display: inline-block; width: 20px;"></span> <label
		class="dhcc-label">表描述:</label>
	<div class="dhcc-input-div">
		<input class="easyui-textbox" name="tDesc"
			style="height: 60px; width: 300px;"
			data-options="prompt:'输入表描述...',multiline:true,validType:'length[1,40]'" />
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