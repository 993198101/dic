package com.dhcc.dic.controller;

//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.dh.dic.pojo.DicUsr;
//import com.dh.dic.service.DicUsrService;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.core.JsonFactory;
//import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

//@Controller
public class DicusrController {
//   @Autowired private DicUsrService dicUsrService;
//   @RequestMapping("/test")
//   public ModelAndView findbyName(){
//	   ModelAndView mView=new ModelAndView("test");
//	   List<DicUsr> dicUsrs=this.dicUsrService.findByName(1);
//	   mView.addObject("test", dicUsrs);
//	   return mView;
//   }
//   @RequestMapping("/getJson")
//   @ResponseBody
//   public List<DicUsr> getDicUsrCustom(){
//	   return this.dicUsrService.findByName(1);
//   }
//   @RequestMapping("/getPageJson")
//   @ResponseBody
//   public PageInfo<DicUsr> getPageDicUsrCustom(){
//	   PageHelper.startPage(1, 10);
//	   
//	   List<DicUsr> dicUsrs=this.dicUsrService.findByName(1);
//	   PageInfo<DicUsr> page=new PageInfo<DicUsr>(dicUsrs);
//	   return page;
//   }
//   @RequestMapping(value="/uploadExcel")
//   @ResponseBody
//    public Object uploadExcel(MultipartFile excelFile,HttpServletRequest request) throws IllegalStateException, IOException{
//	// 文件要保存的路径
//			String path = request.getServletContext().getRealPath("/upload");
//			// 上传的文件名
//			String name = excelFile.getOriginalFilename();
//			// 获得一个保存的文件名（日期+时间+5位随机整数）
//			int index = name.lastIndexOf(".");
//			String suffix = name.substring(index);
//			Date now = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//			Random r = new Random();
//			int ran = r.nextInt(90000) + 10000;
//			String fileName = sdf.format(now) + ran + suffix;
//			// 文件保存详细路径
//			path = path + "/" + fileName;
//			// 传输文件
//			System.out.println(path);
//			excelFile.transferTo(new File(path));
//			return "{'ss':'cs'}";
//	}
//   @RequestMapping("/findJson")
//   @ResponseBody
//   public String getJson(){
//	   return "ss";  
//	   
//   } 
   
}
