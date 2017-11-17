package com.dhcc.dic.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.dic.entity.MenuTree;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.service.MenuTreeService;
@RequestMapping("/menu")
@Controller
public class MenuTreeController {
    @Autowired
    private MenuTreeService menuTreeService;
    @RequestMapping("/getAllMenus")
    @ResponseBody
    public List<MenuTree> getAllMenu(HttpSession session) throws Exception{
    	List<MenuTree> menuTrees=null;
    	try{
    		menuTrees=this.menuTreeService.getAllTMenuTrees();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return menuTrees;
    }
    @RequestMapping("/gotoProjectTable")
    public String gotoProjectTable(){
    	return "dic/iframe/projectTable";
    }
    @RequestMapping("/gotoProjectForm")
    public ModelAndView gotoProjectForm(String projectId){
    	ModelAndView mv=new ModelAndView("dic/iframe/projectForm");
    	mv.addObject("id",projectId);
    	return mv;
    }
    @RequestMapping("/gotoSysDatasourceTable")
    public ModelAndView gotoSysDataSourceTable(String menuId,String projectId){
    	ModelAndView mv=new ModelAndView("dic/iframe/sysDatasourceTable");
    	mv.addObject("projectId",projectId);
    	mv.addObject("menuId",menuId);
    	return mv;
    }
    @RequestMapping("/gotoSysDatasourceForm")
    public String gotoSysDatasourceForm(String datasourceId){
    	return "dic/iframe/sysDatasourceForm";
    }
    @RequestMapping("/gotoBusDatasourceTable")
    public ModelAndView gotoBusDataSourceTable(String menuId,String projectId){
    	ModelAndView mv=new ModelAndView("dic/iframe/busDatasourceTable");
    	mv.addObject("projectId",projectId);
    	mv.addObject("menuId",menuId);
    	return mv;
    }
    @RequestMapping("/gotoBusDatasourceForm")
    public String gotoBusDatasourceForm(String datasourceId){
    	return "dic/iframe/busDatasourceForm";
    }
    @RequestMapping("/gotoUserTable")
    public ModelAndView gotoUserTable(String menuId,String projectId,String datasourceId){
    	ModelAndView mv=new ModelAndView("dic/iframe/userTable");
    	mv.addObject("projectId",projectId);
    	mv.addObject("datasourceId",datasourceId);
    	mv.addObject("menuId",menuId);
    	return mv;
    }
    @RequestMapping("/gotoUserForm")
    public String gotoUserForm(String userId){
    	return "dic/iframe/userForm";
    }
    @RequestMapping("/gotoModuleTable")
    public ModelAndView gotoModuleTable(String menuId,String projectId,String datasourceId){
    	ModelAndView mv=new ModelAndView("dic/iframe/moduleTable");
    	mv.addObject("projectId",projectId);
    	mv.addObject("datasourceId",datasourceId);
    	mv.addObject("menuId",menuId);
    	return mv;
    }
    @RequestMapping("/gotoModuleForm")
    public String gotoModuleForm(){
    	return "dic/iframe/moduleForm";
    }
    @RequestMapping("/gotoAllTableTable")
    public ModelAndView gotoAllTable(String projectId,String menuId,String datasourceId){
    	ModelAndView mv=new ModelAndView("dic/iframe/table/tableMainTable");
    	mv.addObject("datasourceId",datasourceId);
    	mv.addObject("menuId",menuId);
    	mv.addObject("projectId",projectId);
    	return mv;
    }
    @RequestMapping("/gotoTableMainForm")
    public String gotoTableMainForm(){
    	return "dic/iframe/table/tableMainForm";
    }
    @RequestMapping("/gotoIndexTable")
    public String gotoIndex(){
    	return "dic/iframe/indexTable";
    }
    @RequestMapping("/gotoIndexForm")
    public String gotoIndexForm(){
    	return "dic/iframe/indexForm";
    }
    @RequestMapping("/gotoDifTableMainForm")
    public String gotoDifTableMainForm(){
    	return "dic/iframe/table/difTableMainForm";
    }
    @RequestMapping("/gotoViewTable")
    public String gotoViewTable(){
    	return "dic/iframe/viewTable";
    }
    @RequestMapping("/gotoViewForm")
    public String gotoViewForm(){
    	return "dic/iframe/viewForm";
    }
    @RequestMapping("/gotoSeqTable")
    public String gotoSeqTable(){
    	return "dic/iframe/seqTable";
    }
    @RequestMapping("/gotoSeqForm")
    public String gotoSeqForm(){
    	return "dic/iframe/seqForm";
    }
    @RequestMapping("/gotoTablespaceTable")
    public String gotoTablespaceTable(){
    	return "dic/iframe/tablespaceTable";
    }
    @RequestMapping("/gotoTablespaceForm")
    public String gotoTablespaceForm(){
    	return "dic/iframe/tablespaceForm";
    }
    
    
}
