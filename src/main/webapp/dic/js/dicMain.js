/**
 * Created by chenshuai on 2017/6/22 0010.
 */
$(function() {
	/* 布局部分 */
	$('#master-layout').layout({
		fit : true
	/* 布局框架全屏 */
	});
	// 初始化一个空的tree
	$("#menuTree").tree({
		data : null,
		lines : true,
		// checkbox:true
		onClick : onClick,
	});
	loadSec("../menu/getAllMenus");
});
var first = 0;
var second = 0;
var third = 0;
var fourth = 0;
// ----------加iframe-----开始------
function addMainTab(text, url) {
	alert(url);
	if (!mainTabs.tabs("exists", text)) {
		mainTabs.tabs('add',
						{
							title : text,
							content : '<iframe src="'+ url+ '" class="easyui-panel" data-options="fit:true,border:false" frameborder="0"></iframe>',
							closable : true
						});
	} else {
		mainTabs.tabs("select", text);
		mainTabs.tabs('getSelected').panel('panel').find('iframe').attr("src",
				url)
	}
}
// 树被点击
function onClick(node) {
	console.log(node);
	$('#menuTree').tree('select', node.target);
	var url=node.url;
	if(url.indexOf("?")>0){
		url+="&menuId="+node.id;
	}else{
		url+="?menuId="+node.id;
	}
	addMainTab(node.text, url);
}
function loadSec(url) {
	var treeNodes = new Array();
	ajax(url).done(function(res) {
		console.log(res)
		$.each(res, function(i, item) {
			treeNodes.push(item);
		});
		$("#menuTree").tree('loadData', treeNodes);
	}).fail(function(res) {

	});
}
//数结点的修改
//$('#menuTree').tree('update', {
//   
//    text:'friend',
//    iconCls: 'icon-edit'
//});
window.mainTabs = $('#mainTabs').tabs({
	fit : true,
	border : false,
	tools : "#tabTools",
	onContextMenu : function(e, title) {
		e.preventDefault();
		tabsMenu.menu('show', {
			left : e.pageX,
			top : e.pageY
		}).data('tabTitle', title);
	}
});
// -------关闭，刷新等等---开始--
window.tabsMenu = $('#tabsMenu').menu(
		{
			onClick : function(item) {
				var curTabTitle = $(this).data('tabTitle');
				var type = $(item.target).attr('type');

				if (type === 'refresh') {
					var iframe = mainTabs.tabs('getSelected').panel('panel')
							.find('iframe');
					iframe.attr("src", iframe.attr("src"));
					return;
				}

				if (type === 'close') {
					var t = mainTabs.tabs('getTab', curTabTitle);
					if (t.panel('options').closable) {
						mainTabs.tabs('close', curTabTitle);
					}
					return;
				}

				var allTabs = mainTabs.tabs('tabs');
				var closeTabsTitle = [];
				$.each(allTabs, function() {
					var opt = $(this).panel('options');
					if (opt.closable && opt.title != curTabTitle
							&& type === 'closeOther') {
						closeTabsTitle.push(opt.title);
					} else if (opt.closable && type === 'closeAll') {
						closeTabsTitle.push(opt.title);
					}
				});

				for (var i = 0; i < closeTabsTitle.length; i++) {
					mainTabs.tabs('close', closeTabsTitle[i]);
				}
			}
		});
// 关闭除首页的tabs
function closeAllTabs() {
	var allTabs = mainTabs.tabs('tabs');
	var closeTabsTitle = [];
	$.each(allTabs, function() {
		var opt = $(this).panel('options');
		closeTabsTitle.push(opt.title);
	});
	for (var i = 1; i < closeTabsTitle.length; i++) {
		mainTabs.tabs('close', closeTabsTitle[i]);
	}
}