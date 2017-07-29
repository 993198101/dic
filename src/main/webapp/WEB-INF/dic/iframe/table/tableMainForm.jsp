<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css" rel="stylesheet" type="text/css">

    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_animation.css" rel="stylesheet"
          type="text/css">

    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_plus.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/insdep_theme_default.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/icon.css"
          rel="stylesheet" type="text/css">

    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/font-awesome-4.7.0/css/font-awesome.min.css"
          rel="stylesheet" type="text/css">
    <link href="<%=path%>/dic/css/util.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript"
            src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
    <script type="text/javascript"
            src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js">

    </script>
    <script src="<%=path%>/dic/js/util.js"></script>
</head>
<body class="dhcc-body" >
<div >
    <div class="easyui-tabs" style="width:100%;height:500px;position:relative">
        <div title="表基本信息" style="padding:10px">
       		<jsp:include page="include/tableInfo.jsp" flush="true" />
        </div>
        <div title="字段管理" style="padding:10px">
			<jsp:include page="include/tableField.jsp" flush="true" />
        </div>
        <div title="主键管理" style="padding:10px">
            <jsp:include page="include/tablePK.jsp" flush="true" />
        </div>
        <div title="外键管理" style="padding:10px">
           	<jsp:include page="include/tableFK.jsp" flush="true" />
        </div>
        <div title="唯一约束管理" style="padding:10px">
            <jsp:include page="include/tableUnique.jsp" flush="true" />
        </div>
        <div title="索引管理" style="padding:10px">
            <jsp:include page="include/tableIndex.jsp" flush="true" />
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=path%>/dic/js/tableMainForm.js"></script>
</body>
</html>