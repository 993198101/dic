#jQuery EasyUI 1.5.x of insdep theme

**下方附部分美化截图** 

Insdep theme是基于EasyUI 1.5.x 的一款免费的美化主题包，拥有百度编辑器、cropper、Highcharts、justgage、plupload等各类适应本主题的第三方插件美化补丁。并且各类常用Jquery插件正在美化中。后期会提供更多的主题、组件及第三方插件美化样式。

演示地址：https://www.insdep.com/example/
下载地址：https://www.insdep.com
问答地址：https://bbs.insdep.com

项目地址：http://git.oschina.net/weavors/JQuery-EasyUI-1.5.x-Of-Insdep-Theme

下次更新预告：https://www.insdep.com/index.php?m=content&c=index&a=lists&catid=163
本次更新日志：https://www.insdep.com/list-107-1.html

QQ交流群：184075694 （优先发布主题体验内测包）


**关于兼容性：** 
本主题兼容性同步官方，IE最低支持IE9，建议IE10+否则会影响整体性能。 

**更新与升级：**
本主题支持样式平滑升级及主题样式的平滑切换，每一次更新都可以直接覆盖升级，你可以放心使用。
未来所有版本的更新与升级都会遵从平滑升级不会对你当前应用的主题样式有任何影响（对样式进行过二次修改的除外）

**使用前必读：**
请将你的原默认样式换成本主题的easyui.css即可，另外需要额外加载jquery.insdep-extend.min.js主题包初始化扩展文件。 jquery.easyui.min.js及jquery.min.js都是官方原版，未进行任何修改，可以选择性使用。

**注意事项：文件与样式说明 请注意文件调用顺序，如下所示：** 
**1、easyui.css** 
(已美化的EasyUI组件样式文件)

**2、easyui_animation.css** 
(easyui的额外增加的动画效果样式，根据需求引入或不引入，此样式不会对easyui产生影响)

**3、easyui_plus.css** 
(easyui的额外增强样式,内涵所有 insdep_xxx.css 的所有组件样式,根据需求可单独引入insdep_xxx.css或不引入，此样式不会对easyui产生影响)

**4、insdep_theme_default.css** 
(Insdep默认主题样式文件,注：主题样式指含登录页面、控制台等主要页面的主题，如果你不需要可以不引入该样式)

**5、icon.css** 
(已美化的EasyUI图标样式文件)(注：我们已支持iconfont图标，如果你不需要官方图标可以不引入，详细操作见下面的“关于iconfont图标”)

**6、jquery.min.js** 
(原官方提供的jQuery v1.11.3，未进行任何修改)

**7、jquery.easyui.min.js** 
(原官方提供的jQuery EasyUI 1.5.1，未进行任何修改，注本主题支持全部EasyUI 1.5.x版本)

**8、jquery.insdep-extend.min.js** 
(EasyUI美化组件初始化文件)


**常见问题：** 
本主题包不支持EasyUI 1.5.0以下的jQuery EasyUI版本，假如你的项目中未对EasyUI进行过二次开发，可以考虑尝试覆盖升级。注：升级前请注意备份

**更新日志：**
**2017年3月23日**
1、[新增]主题左侧菜单栏

**2017年3月19日**
1、[新增]传统表格美化

**2017年3月18日**
1、[修复]部分用户使用过程中产生的bug
2、[新增]字体图标支持 IconFont （http://www.iconfont.cn/）
3、[新增]字体图标支持 Font Awesome（http://fontawesome.io/）

**2017年3月6日**
1、[优化]减少2%左右css冗余。
2、[修复]表格部分组件错位等问题
3、[修复]combo系列组件错位等问题

**2017年3月5日**
1、[调整]表单内阴影微调
2、[修复]表单内图标样式
3、[调整]ProgressBar高度
4、[调整]ProgressBar的纹理与色彩样式可分开调用。
5、[新增]colpick表单颜色选择控件
6、[修复]表单控件部分样式显示效果不佳等问题
7、[优化]优化了主题样式表文件
8、[调整]统一颜色体系
9、[新增]按钮loading动画效果
10、[新增]进度条progressbar动画效果
11、[新增]进度条progressbar随进度改变颜色动画效果
12、[新增]window窗口淡入淡出效果

**2017年3月4日**
1、[新增]DataList下拉加载功能
2、[新增]DataList美化样式
3、[新增]在webkit浏览器下美化滚动条样式

**2017年2月26日**
1、[修饰]ProgressBar样式
2、[修饰]SwitchButton样式

**2017年2月25日**
1、[新增]TagBox组件样式
2、[新增]Slider组件样式
3、[新增]第三方插件Jquery plupload多文件上传美化。
4、[新增]主题面板样式。
5、[修复]默认主题导航栏按钮Hover时的大小变化

**2017年2月24日**
1、[修复]浏览器大小改变后Tabs的标签错位问题
2、[新增]文字与排版样式，同步Bootstrap
3、[新增]LinkButton各种大小的按钮。
4、[支持]MenuButton继承LinkButton的所有样式
5、[新增]LinkButton、MenuButton的fonticon调用方法。

**2017年2月22日**
1、[修正]部分样式表BUG。
2、[修正]初次加载效率问题。

**2017年2月20日**
1、[修正]对主题导航theme-navigate下的easyui-linkbutton样式错误进行了修正。
2、[修正]对主题整体1.0.0-RC1版本进行了代码优化与修正。

**2017年2月19日**
1、[新增]登录页面
2、[新增]控制台页面
3、[修正]将控件高度34像素修正为32像素
4、[调整]将演示树结构进行了调整

#1.0.1 新增样式
![输入图片说明](https://www.insdep.com/example/demo/36.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/37.png "在这里输入图片标题")

#1.0.0 新增样式
![输入图片说明](https://www.insdep.com/example/demo/32.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/33.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/34.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/35.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/loading.gif "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/loading1.gif "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/loading2.gif "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/loading3.gif "在这里输入图片标题")

#新增样式
![输入图片说明](https://www.insdep.com/example/demo/28.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/29.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/30.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/31.png "在这里输入图片标题")

#主题样式
![输入图片说明](https://www.insdep.com/example/demo/00.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/01.png "在这里输入图片标题")
#组件样式
![输入图片说明](https://www.insdep.com/example/demo/1.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/2.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/3.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/4.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/5.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/6.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/7.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/8.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/9.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/10.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/11.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/12.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/13.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/14.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/15.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/16.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/17.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/18.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/19.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/20.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/21.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/22.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/23.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/24.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/25.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/26.png "在这里输入图片标题")
![输入图片说明](https://www.insdep.com/example/demo/27.png "在这里输入图片标题")