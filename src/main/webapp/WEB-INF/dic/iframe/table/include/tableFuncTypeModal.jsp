<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 功能管理模态框 -->
<div id="funcTypeModel" class="easyui-window" title="功能管理"
	data-options="modal:true,closed:true,cls:'theme-panel-red',top:10,left:20">
	<div style="background-color: #eee; padding: 5px 10px 0 10px;">
		<div class="dhcc-search-form">
			<label class="dhcc-label">功能编号:</label>
			<div class="dhcc-input-div">
				<input class="dhcc-input-width easyui-textbox theme-textbox "
					name="fId" id="fId" data-options="prompt:'输入功能编号...'">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">功能名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox dhcc-input-width" name="fName"
					id="fName">
			</div>
			<div class="dhcc-search-button-div">
				<button class="easyui-linkbutton button-line-blue" onclick="queryFuncType()">
					查询 <i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div id="addFuncType" style="text-align: right;">
			<button class="easyui-linkbutton button-line-grey "
				onclick="addFuncType()">新增</button>
		</div>
		<div class="dhcc-table-list">
			<table id="funcTypeDataGrid" class="easyui-datagrid" style="width: 99%"
				data-options="url:'../table/getFuncTypesByPage ',cache:false,pagination:true,pageNumber:0,pageSize:10,
        			collapsible:true,loadFilter:dataFilterFuncType,singleSelect:true,toolbar:'#addFuncType'">
				<thead>
					<tr>
						<th data-options="field:'fId',align:'center',width:100">编号</th>
						<th data-options="field:'fName',align:'center',width:100">名字</th>
						<th
							data-options="field:'button',align:'center',formatter:buttonFuncType,width:200">操作</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>
<!-- 新增功能类型的模态框 -->
<div id="addOrEditFuncTypeModel" class="easyui-window" title="功能管理"
	data-options="modal:true,closed:true,inline:true,cls:'theme-panel-red',top:10,left:20" style="width:920px;">
	<form id="addOrEditFuncTypeForm" class="theme-login-form" method="post"
		target="formTargetIframe">
		<!-- 2列并行 -->
		<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
			<label class="dhcc-label">功能编号:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox" name="fId"
					data-options="prompt:'功能编号只读',readonly:true"
					style="width: 200px;">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">功能名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox" name="fName" style="width: 200px;">
			</div>
		</div>
		<div class="dhcc-save-button-div">
					<button type="button" onclick="saveFuncTypeEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
	</form>
</div>
<script>
	var funcTypeParams={};
	var isEditFuncType=false;
	var getFuncTypeUrl="../table/getFuncType";
	var updateFuncTypeUrl="../table/updateFuncType";
	var saveFuncTypeUrl="../table/saveFuncType";
	var removeFuncTypeUrl="../table/removeFuncType"
	function buttonFuncType(value, row, index) {
		return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editFuncType("
				+ row.fId
				+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' type='button' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteFuncType("
				+ row.fId + ");'>删除</button>";
	}
	function dataFilterFuncType(data) {
		var tabledata = {
			"total" : data.total,
			"rows" : data.list,
		};
		return tabledata;
	}
	function addFuncType() {
		$('#addOrEditFuncTypeModel').window('hcenter');
		$('#addOrEditFuncTypeModel').window('open');
	}
	function editFuncType(id) {
		ajax(getFuncTypeUrl+"?id="+id).done(function(data){
			$('#addOrEditFuncTypeForm').form('load',data);
			isEditFuncType=true;
			alert(isEditFuncType+"ss");
			$('#addOrEditFuncTypeModel').window('open');
		}).fail(function(error){
			$.messager.alert("获取编辑数据","获取编辑数据失败","danger");
		});
	}
	function saveFuncTypeEdit(){
		var res = $('#addOrEditFuncTypeForm').form('enableValidation').form('validate');
		if (res == true) {
			var formJson = $('#addOrEditFuncTypeForm').serializeObject();
			var url=saveFuncTypeUrl;
			if(isEditFuncType){
				url=updateFuncTypeUrl;
			}
			ajax(url,JSON.stringify(formJson),'post').done(function(data){
				if(data.result==1){
					if(isEditFuncType){
						$.messager.alert("修改功能类型名称","修改功能类型名称成功","success");
					}else{
						$.messager.alert("新增功能类型","新增功能类型成功","success");
					}
				}else{
					if(isEditFuncType){
						$.messager.alert("修改功能类型名称","修改功能类型名称失败","danger");
					}else{
						$.messager.alert("新增功能类型","新增功能类型失败","danger");
					}
				}
				$(".func-type-list").combobox("reload");
				$("#funcTypeDataGrid").datagrid('reload',funcTypeParams);
				isEditFuncType=false;
			}).fail(function(error){
				if(isEditFuncType){
					$.messager.alert("修改功能类型名称","错误代码"+error.status,"danger");
				}else{
					$.messager.alert("新增功能类型","错误代码"+error.status,"danger");
				}
			});
		}else{
			$.messager.alert("表单填写","表单没有正确填写","danger");
		}
		$('#addOrEditFuncTypeModel').window('close');
	}
	function deleteFuncType(id){
		ajax(removeFuncTypeUrl+"?id="+id).done(function(data){
			if(data.result==1){
				$.messager.alert("删除功能类型","删除功能类型成功","danger");
			}else{
				$.messager.alert("删除功能类型","删除功能类型失败,可能已被他人删除","danger");
			}
			$(".func-type-list").combobox("reload");
			$("#funcTypeDataGrid").datagrid('reload',funcTypeParams);
		}).fail(function(error){
			$.messager.alert("删除功能类型","错误代码"+error.status,"danger");
		});
	}
	function queryFuncType(){
		funcTypeParams={};
		if($('#fId').textbox('getValue')!="")
			funcTypeParams.fId=$('#fId').textbox('getValue');
		if($('#fName').textbox('getValue')!="")
			funcTypeParams.fName=$('#fName').textbox('getValue');
		$("#funcTypeDataGrid").datagrid('reload',funcTypeParams);
	}
</script>