/**
 * Created by Administrator on 2017/5/10 0010.
 */
$(function () {
    /*布局部分*/
    $('#master-layout').layout({
        fit: true/*布局框架全屏*/
    });
    $("#menuTree").tree({
        data:null,
        lines:true,
        // checkbox:true
        onSelect:onSelect
    });
});
var first=0;
var second=0;
var third=0;
var fourth=0;

function onSelect(node) {
    console.log(node)
    addMainTab(node.text,node.url);
}
function loadSec(num) {
    var url;
    var treeNodes=new Array();
    if(num==1) {
        url = "json/menu.json";
    }
    if(num==2){
        url="json/menu1.json";
    }
    if(num==3){
        url="json/menu2.json";
    }
        ajax(url).done(function (res) {
            if(res.status=="success"){
                $.each(res.data, function(i, item) {
                    treeNodes.push({
                        id: item.id,
                        text: item.text,
                        parent_id: item.parent_id,
                        children:item.children,
                        iconCls: item.icon,
                        url:item.url
                    });
                });
                // if(res.check==true){
                //     $('.tree-checkbox').addClass("hidden");
                // }
            }else {
                alert("load tree failed")
            }
            $("#menuTree").tree('loadData',treeNodes);

        }).fail(function (res) {

        });
}
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
window.tabsMenu = $('#tabsMenu').menu({
    onClick : function(item) {
        var curTabTitle = $(this).data('tabTitle');
        var type = $(item.target).attr('type');

        if (type === 'refresh') {
            var iframe = mainTabs.tabs('getSelected').panel('panel').find('iframe');
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

        for ( var i = 0; i < closeTabsTitle.length; i++) {
            mainTabs.tabs('close', closeTabsTitle[i]);
        }
    }
});
function addMainTab(text, url) {
     if(!mainTabs.tabs("exists", text)) {
        mainTabs.tabs('add',{
            title: text,
            content:'<iframe src="' + url+"?id=1" + '" class="easyui-panel" data-options="fit:true,border:false" frameborder="0"></iframe>',
            closable:true
        });
    }else {
        mainTabs.tabs("select", text);
        mainTabs.tabs('getSelected').panel('panel').find('iframe').attr("src", url)
    }
}