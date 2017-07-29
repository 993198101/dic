package com.dhcc.dic.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dic.dao.MenuTreeDao;
import com.dhcc.dic.entity.MenuTree;
import com.dhcc.dic.service.MenuTreeService;


@Service
public class MenuTreeServiceImpl implements MenuTreeService{
    @Autowired
    private MenuTreeDao menuTreeDao;

   
	 /**
     * 生成树
     * @param parentId
     * @return
     */
    public List<MenuTree> resultData(String parentId) throws Exception{
        //根据根节点id获取子节点数据
        List<MenuTree> topList = this.menuTreeDao.getChildren(parentId);
        List<MenuTree> resultTree=new ArrayList<MenuTree>();
        //遍历子节点
        for (MenuTree tbItemCat : topList) {
        	MenuTree tree=new MenuTree();
            tree.setId(tbItemCat.getId());
            tree.setText(tbItemCat.getText());
            tree.setDate(tbItemCat.getDate());
            tree.setDesc(tbItemCat.getDesc());
            tree.setEnable(tbItemCat.getEnable());
            tree.setIcon(tbItemCat.getIcon());
            tree.setState(tbItemCat.getState());
            tree.setUrl(tbItemCat.getUrl());
            tree.setParentId(tbItemCat.getParentId());
            //判断是否有子集
            if ("closed".equals(tbItemCat.getState())) {
                tree.setChildren(resultData(tbItemCat.getId()));
                resultTree.add(tree);
            }else {
                resultTree.add(tree);
            }
        }
        return resultTree;
    }
	@Override
	public List<MenuTree> getAllTMenuTrees() throws Exception {
		List<MenuTree> result=new ArrayList<MenuTree>();
		MenuTree root=this.menuTreeDao.getRoot();
		List<MenuTree> children=resultData("0");//递归获取children
		if(children!=null)
		root.setChildren(children);
		result.add(root);
		return result;
	}
    
}
