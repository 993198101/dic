/**
 * Created by ChenShuai on 2017/5/5 0005.
 */
//ajax 封装
function ajax(url, param, type,contentType) {
// 利用了jquery延迟对象回调的方式对ajax封装，使用done()，fail()，always()等方法进行链式回调操作
// 如果需要的参数更多，比如有跨域dataType需要设置为'jsonp'等等，可以考虑参数设置为对象
    return $.ajax({
        url: url,
        data: param || {},
        type: type || 'GET',
        dataType:'json',
        contentType: contentType||'application/json;charset=utf-8'
    });
}
// 链式回调
// ajax('www.baidu.com/getInfo').done(function(resp) {
// // 成功回调
// }).fail(function(err) {
// // 失败回调
// });
function getQueryString(name) { 
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
	var r = window.location.search.substr(1).match(reg); 
	if (r != null) return unescape(r[2]); return null; 
} 
$.fn.serializeObject = function()    
{    
   var o = {};    
   var a = this.serializeArray();    
   $.each(a, function() {    
       if (o[this.name]) {    
           if (!o[this.name].push) {    
               o[this.name] = [o[this.name]];    
           }    
           o[this.name].push(this.value || '');    
       } else {    
           o[this.name] = this.value || '';    
       }    
   });    
   return o;    
};
$.extend($.fn.validatebox.defaults.rules, {  
	isValidIP: {  
        validator: function(value, param){  
            return isValidIP(value);  
        },  
        message: '请输入正确的ip地址'  
    },
    isValidPort:{
    	validator: function(value, param){  
            return isValidPort(value);  
        },  
        message: '请输入正确的端口'
    },
    isTableName:{
    	validator: function(value, param){  
            return isTableName(value);  
        },  
        message: '请输入正确的表名-字母开头30字符以内'
    },
    tableFileSize:{
    	validator: function(value, param){  
            return tableFileSize(value);  
        },  
        message: '请输入符合要求的字段长度'
    },
    tableFileScale:{
    	validator: function(value, param){  
            return tableFileScale(value);  
        },  
        message: '请输入符合要求的字段精度'
    }
}); 
/*端口号校验*/  
function isValidPort(str)  
{  
    var parten=/^(\d)+$/g;  
    if(parten.test(str)&&parseInt(str)<=65535&&parseInt(str)>=0){  
        return true;  
     }else{  
        return false;  
     }  
} 
//验证ip
function isValidIP(ip) {
    var reg = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/
    return reg.test(ip);
}
//表名校验
function isTableName(name){
	 var reg = /^[a-zA-Z]{1}[a-zA-Z0-9$#_]{0,29}$/
	 return reg.test(name);
}
//字段长度
function tableFileSize(size){
	var value=$('#fType').combobox('getValue');
	switch(value){
		case "20"://VARCHAR2
			
		case "12"://NVARCAHR2
			if(size<1||size>4000||size==undefined){
					return false;
				}
			break;
		case "24"://CHAR
		case "13"://ROW
		case "9": //NCHAR
			if(size<1||size>2000){
				return false;
			}
			break;
		case "11"://NUMBER
			if(size<1||size>38){
				return false;
			}
			break;
		case "17"://TIMESTAMP
			if(size<1||size>9){
				return false;
			}
			break;
		case "3"://FLOAT
			if(size<1||size>126){
				return false;
			}
			break;
	}
	return true;
}
//字段精度
function tableFileScale(Scale){
	var value=$('#fType').combobox('getValue');
	if(value=="11"){//NUMBER
		if(Scale>-84&&Scale<127){
			return true;
		}else{
			return false;
		}
	}else{
		return false;
	}
}

function formatterDate(date){
	var y = date.getFullYear();
	var m = date.getMonth()+1;
	if(m<10){
		m="0"+m;
	}
	var d = date.getDate();
	if(d<10){
		d="0"+d;
	}
	return y+'-'+m+'-'+d;
}
//把数据变成  ， 分隔的字符串
function arrToString(data){
	var uAccess="";
	if(data!=null){
		if((typeof data=='object')&&data.constructor==Array){
			for(var i=0;i<data.length;i++){
				uAccess+=data[i];
				if(i!=data.length-1){
					uAccess+=",";
				}
			}
			data=uAccess;
		}
	}
	return data;
}
function updateTabs(oldTitle,newTitle){
	var tab=parent.$('#mainTabs').tabs('getTab',oldTitle);
	if(tab!=null){
		parent.$('#mainTabs').tabs('update', {
			tab:tab,
			options: {
				title: newTitle,
			}
		});
	}		
}
function closeTab(title){
	var tab=parent.$('#mainTabs').tabs('getTab',oldTitle);
	if(tab!=null){
		parent.$('#mainTabs').tabs('close',title);
	}
}


