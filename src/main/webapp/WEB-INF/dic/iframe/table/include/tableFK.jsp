<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="height: 500px; width: 600px;">
	<div id="message" class="alert">
		<div class="alert-close">&times;</div>
		<div class="alert-icons"></div>
		<b>小提示!</b> 选择上方的外键后在下方进行配置.
	</div>
	<table id="tableFKDatagrid" class="easyui-datagrid"  style="width:700px;height:auto"
            data-options="
                iconCls: 'icon-edit',
                singleSelect: true,
                toolbar: '#tb',
                method: 'get',
                onClickCell: onClickCell,
                onEndEdit: onEndEdit
            ">
        <thead>
            <tr>
                <th data-options="field:'itemid',width:80">外键名</th>
               	<th data-options="field:'status',width:60,align:'center',editor:'text'">列</th>
            </tr>
        </thead>
    </table>
 
    <div id="tb" style="height:auto">
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">Append</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">Remove</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">Accept</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">Reject</a>
    </div>
    
    <script type="text/javascript">
        var editIndex = undefined;
        function endEditing(){
            if (editIndex == undefined){return true}
            if ($('#tableFKDatagrid').datagrid('validateRow', editIndex)){
                $('#tableFKDatagrid').datagrid('endEdit', editIndex);
                editIndex = undefined;
                return true;
            } else {
                return false;
            }
        }
        function onClickCell(index, field){
            if (editIndex != index){
                if (endEditing()){
                    $('#tableFKDatagrid').datagrid('selectRow', index)
                            .datagrid('beginEdit', index);
                    var ed = $('#tableFKDatagrid').datagrid('getEditor', {index:index,field:field});
                    if (ed){
                        ($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
                    }
                    editIndex = index;
                } else {
                    setTimeout(function(){
                        $('#tableFKDatagrid').datagrid('selectRow', editIndex);
                    },0);
                }
            }
        }
        function onEndEdit(index, row){
            var ed = $(this).datagrid('getEditor', {
                index: index,
                field: 'productid'
            });
            row.productname = $(ed.target).combobox('getText');
        }
        function append(){
            if (endEditing()){
                $('#tableFKDatagrid').datagrid('appendRow',{status:'P'});
                editIndex = $('#tableFKDatagrid').datagrid('getRows').length-1;
                $('#tableFKDatagrid').datagrid('selectRow', editIndex)
                        .datagrid('beginEdit', editIndex);
            }
        }
        function removeit(){
            if (editIndex == undefined){return}
            $('#tableFKDatagrid').datagrid('cancelEdit', editIndex)
                    .datagrid('deleteRow', editIndex);
            editIndex = undefined;
        }
        function accept(){
            if (endEditing()){
                $('#tableFKDatagrid').datagrid('acceptChanges');
            }
        }
        function reject(){
            $('#tableFKDatagrid').datagrid('rejectChanges');
            editIndex = undefined;
        }
    </script>
	<div id="refTable" style="text-align: right;">
		<label style="display: inline-block">选择关联表:</label> <select
			class="easyui-combobox" id="FKName" style="width: 200px;"
			data-options="">
		</select>
	</div>
	<table id="dataGrid" class="easyui-datagrid" style="width: 99%"
		data-options="title:'外键约束列',pagination:true,pageNumber:0,pageSize:10,cache:false,
        collapsible:true,singleSelect:true,toolbar:'#refTable'">
		<thead>
			<tr>
				<th data-options="field:'column'">列</th>
				<th data-options="field:'button'">选择</th>
				<th data-options="field:'refColumn'">关联列</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>id</td>
				<td><input type="radio" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="radio" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="radio" name="ref" /></td>
				<td><select class="easyui-combobox" style="width: 200px;"
					data-options=""></select></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="radio" name="ref" /></td>
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
<script>
function onClickCell(){
	alert("ss");
}

</script>
 
