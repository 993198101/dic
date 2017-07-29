<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="edge"/>
    <link rel="shortcut icon" href="favicon.ico"/>
    <title>数据字典项目管理</title>
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_animation.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/easyui_plus.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/insdep_theme_default.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/icon.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/jquery.insdep-extend.min.js"></script>
</head>
<body>
<div id="master-layout">
    <div data-options="region:'north',border:false,bodyCls:'theme-header-layout'">
        <div class="theme-navigate">
            <div class="left" style="padding-left: 50px">
                <div class="theme-navigate-user-panel">
                    <dl>
                        <dd>
                            <img src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/themes/insdep/images/portrait86x86.png"
                                 width="86" height="86">
                            <b class="badge-prompt">匿名<i class="badge color-important">10</i></b>
                            <span>examples@insdep.com</span>
                            <p>安全等级：<i class="text-success">高</i></p>
                        </dd>
                        <dt>
                            <a class="theme-navigate-user-modify">修改资料</a>
                            <a class="theme-navigate-user-logout">注销</a>
                        </dt>
                    </dl>
                </div>
            </div>
            <div class="right">
                <a href="#" class="easyui-menubutton theme-navigate-user-button"
                   data-options="menu:'.theme-navigate-user-panel'">匿名</a>
            </div>
        </div>

    </div>
    <div data-options="region:'center',border:false">
        <div class="easyui-layout" data-options="fit:true">
            <div data-options="region:'west',split:true,border:false" title="信息"
                 style="width:250px; padding:10px 20px;">
                    <ul id="menuTree"></ul>
            </div>
            <div data-options="region:'center',split:true,border:false"  style="color: white">
                <div id="mainTabs" style="height:250px;border: 1px solid">
                    <div title="首页">
                        <button onclick="test()">test</button>
                        <!--<iframe src="/zcurd/index/index.html" class="easyui-panel" data-options="fit:true,border:false" frameborder="0"></iframe>-->
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--tab右键菜单-->
    <div id="tabsMenu">
        <div data-options="iconCls:'glyphicon-refresh'" type="refresh" style="font-size: 12px;">刷新</div>
        <div class="menu-sep"></div>
        <div data-options="iconCls:'glyphicon-remove'" type="close" style="font-size: 12px;">关闭</div>
        <div data-options="iconCls:''" type="closeOther">关闭其他</div>
        <div data-options="iconCls:''" type="closeAll">关闭所有</div>
    </div>
</div>
<script src="<%=path %>/dic/js/dicMain.js"></script>
<script src="<%=path %>/dic/js/util.js"></script>
<!--本页面js结束-->
<!--第三方插件加载-->
<script src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/justgage-1.2.2/raphael-2.1.4.min.js"></script>
<script src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/justgage-1.2.2/justgage.js"></script>
<script src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/Highcharts-5.0.0/js/highcharts.js"></script>
<script type="text/javascript" src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/ueditor-1.4.3.3/ueditor.config.js"></script>
<script type="text/javascript" src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/ueditor-1.4.3.3/ueditor.all.min.js"></script>
<link href="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/cropper-2.3.4/dist/cropper.min.css" rel="stylesheet" type="text/css">
<script src="<%=path%>/JQuery-EasyUI-1.5.x-Of-Insdep-Theme/plugin/cropper-2.3.4/dist/cropper.min.js"></script>
<!--第三方插件加载结束-->
</body>
</html>
