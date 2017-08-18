<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 控件管理模态框 -->
<div id="ctrlTypeModel" class="easyui-window" title="控件管理"
	data-options="modal:true,closed:true,cls:'theme-panel-red',top:10,left:20">
	<div style="background-color: #eee; padding: 5px 10px 0 10px;">
		<div class="dhcc-search-form">
			<label class="dhcc-label">控件编号:</label>
			<div class="dhcc-input-div">
				<input class="dhcc-input-width easyui-textbox theme-textbox "
					name="cId" id="cId" data-options="prompt:'输入控件编号...'">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">控件名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox dhcc-input-width" name="cName"
					id="cName">
			</div>
			<div class="dhcc-search-button-div">
				<button class="easyui-linkbutton button-line-blue" onclick="queryCtrlType()">
					查询 <i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div id="addCtrlType" style="text-align: right;">
			<button class="easyui-linkbutton button-line-grey "
				onclick="addCtrlType()">新增</button>
		</div>
		<div class="dhcc-table-list">
			<table id="ctrlTypeDataGrid" class="easyui-datagrid" style="width: 99%"
				data-options="url:'../table/getCtrlTypesByPage ',cache:false,pagination:true,pageNumber:0,pageSize:10,
        			collapsible:true,loadFilter:dataFilterCtrlType,singleSelect:true,toolbar:'#addCtrlType'">
				<thead>
					<tr>
						<th data-options="field:'cId',align:'center',width:100">编号</th>
						<th data-options="field:'cName',align:'center',width:100">名字</th>
						<th
							data-options="field:'button',align:'center',formatter:buttonCtrlType,width:200">操作</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>
<!-- 新增控件类型的模态框 -->
<div id="addOrEditCtrlTypeModel" class="easyui-window" title="控件管理"
	data-options="modal:true,closed:true,inline:true,cls:'theme-panel-red',top:10,left:20" style="width:920px;">
	<form id="addOrEditCtrlTypeForm" class="theme-login-form" method="post"
		target="formTargetIframe">
		<!-- 2列并行 -->
		<div style="margin-bottom: 20px; padding: 0 20px; margin-top: 20px;">
			<label class="dhcc-label">控件编号:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox theme-textbox" name="cId"
					data-options="prompt:'控件编号只读',readonly:true"
					style="width: 200px;">
			</div>
			<span style="display: inline-block; width: 20px;"></span> <label
				class="dhcc-label">控件名称:</label>
			<div class="dhcc-input-div">
				<input class="easyui-textbox" name="cName" style="width: 200px;">
			</div>
		</div>
		<div class="dhcc-save-button-div">
					<button type="button" onclick="saveCtrlTypeEdit()" type="button"
						class="easyui-linkbutton button-line-yellow">提交</button>
				</div>
	</form>
</div>
<script>
	var ctrlTypeParams={};
	var isEditCtrlType=false;
	var getCtrlTypeUrl="../table/getCtrlType";
	var updateCtrlTypeUrl="../table/updateCtrlType";
	var saveCtrlTypeUrl="../table/saveCtrlType";
	var removeCtrlTypeUrl="../table/removeCtrlType"
	function buttonCtrlType(value, row, index) {
		return "<button  class='easyui-linkbutton button-default' style='width: 50px;height: 34px;border-radius: 3px' onclick='editCtrlType("
				+ row.cId
				+ ")'>编辑</button> <button  class='easyui-linkbutton button-danger' type='button' style='width: 50px;height: 34px;border-radius: 3px' onclick='deleteCtrlType("
				+ row.cId + ");'>删除</button>";
	}
	function dataFilterCtrlType(data) {
		var tabledata = {
			"total" : data.total,
			"rows" : data.list,
		};
		return tabledata;
	}
	function addCtrlType() {
		$('#addOrEditCtrlTypeModel').window('hcenter');
		$('#addOrEditCtrlTypeModel').window('open');
	}
	function editCtrlType(id) {
		ajax(getCtrlTypeUrl+"?id="+id).done(function(data){
			$('#addOrEditCtrlTypeForm').form('load',data);
			isEditCtrlType=true;
			$('#addOrEditCtrlTypeModel').window('open');
		}).fail(function(error){
			$.messager.alert("获取编辑数据","获取编辑数据失败","danger");
		});
	}
	function saveCtrlTypeEdit(){
		var res = $('#addOrEditCtrlTypeForm').form('enableValidation').form('validate');
		if (res == true) {
			var formJson = $('#addOrEditCtrlTypeForm').serializeObject();
			var url=saveCtrlTypeUrl;
			if(isEditCtrlType){
				url=updateCtrlTypeUrl;
			}
			ajax(url,JSON.stringify(formJson),'post').done(function(data){
				if(data.result==1){
					if(isEditCtrlType){
						$.messager.alert("修改控件类型名称","修改控件类型名称成功","success");
					}else{
						$.messager.alert("新增控件类型","新增控件类型成功","success");
					}
				}else{
					if(isEditCtrlType){
						$.messager.alert("修改控件类型名称","修改控件类型名称失败","danger");
					}else{
						$.messager.alert("新增控件类型","新增控件类型失败","danger");
					}
				}
				isEditCtrlType=false;
				$(".ctrl-type-list").combobox("reload");
				$("#ctrlTypeDataGrid").datagrid('reload',ctrlTypeParams);
			}).fail(function(error){
				if(isEditCtrlType){
					$.messager.alert("修改控件类型名称","错误代码"+error.status,"danger");
				}else{
					$.messager.alert("新增控件类型","错误代码"+error.status,"danger");
				}
			});
		}else{
			$.messager.alert("表单填写","表单没有正确填写","danger");
		}
		$('#addOrEditCtrlTypeModel').window('close');
	}
	function deleteCtrlType(id){
		ajax(removeCtrlTypeUrl+"?id="+id).done(function(data){
			if(data.result==1){
				$.messager.alert("删除控件类型","删除控件类型成功","danger");
			}else{
				$.messager.alert("删除控件类型","删除控件类型失败,可能已被他人删除","danger");
			}
			$("#ctrlTypeDataGrid").datagrid('reload',ctrlTypeParams);
			$(".ctrl-type-list").combobox("reload");
		}).fail(function(error){
			$.messager.alert("删除控件类型","错误代码"+error.status,"danger");
		});
	}
	function queryCtrlType(){
		ctrlTypeParams={};
		if($('#cId').textbox('getValue')!="")
			ctrlTypeParams.cId=$('#cId').textbox('getValue');
		if($('#cName').textbox('getValue')!="")
			ctrlTypeParams.cName=$('#cName').textbox('getValue');
		$("#ctrlTypeDataGrid").datagrid('reload',ctrlTypeParams);
	}
</script>