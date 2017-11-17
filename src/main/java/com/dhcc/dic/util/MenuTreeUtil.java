package com.dhcc.dic.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dhcc.dic.dao.TRelationDao;
import com.dhcc.dic.dao.TMenuTreeDao;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TProject;
import com.dhcc.dic.entity.TRelation;
import com.dhcc.dic.entity.TRelationExample;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TMenuTreeExample;
import com.dhcc.dic.entity.TMenuTreeExample.Criteria;
import com.dhcc.dic.entity.TModule;
import com.dhcc.dic.entity.TUser;

/**
 * 这个类操作所有的菜单树，每一个关联操作树的方法都在这里
 * 
 * @author Administrator
 *
 */
@Component
public class MenuTreeUtil {
	@Autowired
	private TRelationDao tRelationDao;
	@Autowired
	private TMenuTreeDao tMenuTreeDao;

	public void editMenuTree(TMenuTree tMenuTree) {
		TMenuTreeExample example = new TMenuTreeExample();
		Criteria criteria = example.createCriteria();
		criteria.andMIdEqualTo(tMenuTree.getmId());
		this.tMenuTreeDao.updateByExampleSelective(tMenuTree, example);

	}

	public void RecursiveDeleteTree(String startMId) {

		this.tMenuTreeDao.RecursiveDeleteTree(startMId);
	}

	// ---------------------项目的树开始-------------------------
	/**
	 * 新增项目的 树操作 返回 1成功， 异常失败
	 * 
	 * @param tProject
	 * @param mDate
	 * @return
	 */
	public void addProjectTree(TProject tProject, String mDate) {
		// 增加项目菜单树
		TMenuTree pMenu = new TMenuTree(null, tProject.getpName(), "0", tProject.getpDesc(), mDate, "1",
				"../menu/gotoProjectForm?projectId=" + tProject.getpId(), null, "closed");
		this.tMenuTreeDao.insert(pMenu);
		// 增加系统数据源菜单树
		TMenuTree sMenu = new TMenuTree(null, "系统数据源", pMenu.getmId(), "系统数据源", mDate, "1",
				"../menu/gotoSysDatasourceTable?projectId=" + tProject.getpId(), null, "closed");
		this.tMenuTreeDao.insert(sMenu);
		// 增加业务数据源菜单树
		TMenuTree bMenu = new TMenuTree(null, "业务数据源", pMenu.getmId(), "业务数据源", mDate, "1",
				"../menu/gotoBusDatasourceTable?projectId=" + tProject.getpId(), null, "closed");
		this.tMenuTreeDao.insert(bMenu);
		// *****************************增加关系******************
		// 建立菜单树与表记录的关系
		TRelation pRelation = new TRelation(null, pMenu.getmId(), "项目详情", "T_PROJECT", tProject.getpId(), "项目详情节点");
		this.tRelationDao.insert(pRelation);
	}

	public void deleteProjectTree(String pId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("项目详情");
		criteria.andRPkIdEqualTo(pId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		this.RecursiveDeleteTree(relation.getrMenuId());
	}

	public TMenuTree getProjectTree(String projectId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("项目详情");
		criteria.andRPkIdEqualTo(projectId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		return this.tMenuTreeDao.selectByPrimaryKey(relation.getrMenuId());
	}
	// ----------------------项目的树结束-------------------------

	// ---------------------系统数据源的树开始-------------------------
	/**
	 * 增加系统数据源的TreeMenu
	 * 
	 * @param tDatasource
	 * @param parentMenuId
	 * @param mDate
	 * @return
	 */
	public void addSysDatasourceTree(TDatasource tDatasource, String parentMenuId, String mDate) {
		// 增加具体数据源菜单树
		TMenuTree datasourceMenu = new TMenuTree(null, tDatasource.getdName(), parentMenuId, tDatasource.getdDesc(),
				mDate, "1", "../menu/gotoSysDatasourceForm?datasourceId=" + tDatasource.getdId(), null, "closed");
		this.tMenuTreeDao.insert(datasourceMenu);
		// 增加用户菜单树
		TMenuTree userMenu = new TMenuTree(null, "用户", datasourceMenu.getmId(), "用户", mDate, "1",
				"../menu/gotoUserTable?datasourceId=" + tDatasource.getdId() + "&projectId="
						+ tDatasource.getdOfProject(),
				null, "closed");
		this.tMenuTreeDao.insert(userMenu);
		// 增加tablespace
		TMenuTree tablespaceMenu = new TMenuTree(null, "表空间", datasourceMenu.getmId(), "用户", mDate, "1",
				"../menu/gotoTablespaceTable?datasourceId=" + tDatasource.getdId() + "&projectId="
						+ tDatasource.getdOfProject(),
				null, "closed");
		this.tMenuTreeDao.insert(tablespaceMenu);
		// ***************************增加关系********************
		// 建立菜单树与具体数据源的关系
		TRelation datasourceRelation = new TRelation(null, datasourceMenu.getmId(), "系统数据源详情", "T_DATASOURCE",
				tDatasource.getdId(), "系统数据源详情节点");
		this.tRelationDao.insert(datasourceRelation);

	}

	public void deleteSysdatasourceByIdTree(String dId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("系统数据源详情");
		criteria.andRPkIdEqualTo(dId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		this.RecursiveDeleteTree(relation.getrMenuId());

	}

	public TMenuTree getSysDatasourceTree(String datasourceId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("系统数据源详情");
		criteria.andRPkIdEqualTo(datasourceId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		TMenuTree tMenuTree = this.tMenuTreeDao.selectByPrimaryKey(relation.getrMenuId());
		return tMenuTree;
	}

	// ---------------------系统数据源的树结束-------------------------
	// ---------------------业务数据源的树开始-------------------------
	/**
	 * 增加业务数据源菜单树，1成功，异常失败
	 * 
	 * @param tDatasource
	 * @param parentMenuId
	 * @param mDate
	 * @return
	 */
	public void addBusDatasourceTree(TDatasource tDatasource, String parentMenuId, String mDate) {
		// 增加具体业务数据源菜单树
		TMenuTree datasourceMenu = new TMenuTree(null, tDatasource.getdName(), parentMenuId, tDatasource.getdDesc(),
				mDate, "1", "../menu/gotoBusDatasourceForm?datasourceId=" + tDatasource.getdId(), null, "closed");
		this.tMenuTreeDao.insert(datasourceMenu);
		// 增加按全量展示菜单树
		TMenuTree allMenu = new TMenuTree(null, "按全量展示", datasourceMenu.getmId(), "按全量展示", mDate, "1", null, null,
				"closed");
		this.tMenuTreeDao.insert(allMenu);
		// 全量--表
		TMenuTree allTableMenu = new TMenuTree(null, "表", allMenu.getmId(), "表", mDate, "1", "../menu/gotoAllTableTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0",
				null, "open");
		this.tMenuTreeDao.insert(allTableMenu);
		// 全量--视图
		TMenuTree allViewMenu = new TMenuTree(null, "视图", allMenu.getmId(), "视图", mDate, "1", "../menu/gotoViewTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0",
				null, "open");
		this.tMenuTreeDao.insert(allViewMenu);
		// 全量--序列
		TMenuTree allSeqMenu = new TMenuTree(null, "序列", allMenu.getmId(), "序列", mDate, "1", "../menu/gotoSeqTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0",
				null, "open");
		this.tMenuTreeDao.insert(allSeqMenu);
		// 全量--索引
		TMenuTree allIndexMenu = new TMenuTree(null, "索引", allMenu.getmId(), "索引", mDate, "1", "../menu/gotoIndexTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0",
				null, "open");
		this.tMenuTreeDao.insert(allIndexMenu);
		// 全量--数据元
		TMenuTree allDataElementMenu = new TMenuTree(null, "数据元", allMenu.getmId(), "数据元", mDate, "1",
				"../menu/gotoDataElementTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0", null, "closed");
		this.tMenuTreeDao.insert(allDataElementMenu);
		// 全量--数据元--数据元信息
		TMenuTree allDataElementInfoMenu = new TMenuTree(null, "数据元信息", allDataElementMenu.getmId(), "数据元信息", mDate,
				"1", "../menu/gotoDataElementInfoTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0", null, "open");
		this.tMenuTreeDao.insert(allDataElementInfoMenu);
		// 全量--数据元--引用标准
		TMenuTree allRefStandardMenu = new TMenuTree(null, "引用标准", allDataElementMenu.getmId(), "引用标准", mDate, "1",
				"../menu/gotoRefStandardTable?datasourceId="+tDatasource.getdId()+"&projectId="+tDatasource.getdOfProject()+"&moduleId=0", null, "open");
		this.tMenuTreeDao.insert(allRefStandardMenu);

		// 按模块
		TMenuTree moduleMenu = new TMenuTree(null, "按模块展示", datasourceMenu.getmId(), "按模块展示", mDate, "1",
				"../menu/gotoModuleTable?projectId="+tDatasource.getdOfProject()+"&datasourceId="+tDatasource.getdId(), null, "closed");
		this.tMenuTreeDao.insert(moduleMenu);
		// ****************************增加关系*********************
		// 建立菜单树与具体数据源的关系
		TRelation datasourceRelation = new TRelation(null, datasourceMenu.getmId(), "业务数据源详情", "T_DATASOURCE",
				tDatasource.getdId(), "业务数据源详情节点");
		this.tRelationDao.insert(datasourceRelation);

	}

	public TMenuTree getBusDatasourceTree(String datasourceId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("业务数据源详情");
		criteria.andRPkIdEqualTo(datasourceId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		TMenuTree tMenuTree = this.tMenuTreeDao.selectByPrimaryKey(relation.getrMenuId());
		return tMenuTree;
	}

	public void deleteBusdatasourceByIdTree(String dId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("业务数据源详情");
		criteria.andRPkIdEqualTo(dId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		this.RecursiveDeleteTree(relation.getrMenuId());

	}

	// ---------------------业务数据源的树结束-------------------------
	// ---------------------用户的树开始-----------------------------
	public void addUserTree(TUser tUser, String parentMenuId, String date) {
		TMenuTree menu = new TMenuTree(null, tUser.getuCnName(), parentMenuId, tUser.getuCnName(), date, "1",
				"../menu/gotoUserForm?userId=" + tUser.getuId(), null, "open");
		this.tMenuTreeDao.insert(menu);
		// ****************************增加关系*********************
		// 建立菜单树与具体用户的关系
		TRelation userRelation = new TRelation(null, menu.getmId(), "用户详情", "T_USER", tUser.getuId(), "用户详情节点");
		this.tRelationDao.insert(userRelation);
	}

	public void deleteUserTree(String userId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("用户详情");
		criteria.andRPkIdEqualTo(userId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		this.RecursiveDeleteTree(relation.getrMenuId());
	}

	public TMenuTree getUserTree(String userId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("用户详情");
		criteria.andRPkIdEqualTo(userId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		return this.tMenuTreeDao.selectByPrimaryKey(relation.getrMenuId());
	}

	// ---------------------用户树的结束-----------------------------
	// ---------------------模块树的开始-----------------------------
	public void addModuleTree(TModule tModule, String parentMenuId, String date) {
		TMenuTree menu = new TMenuTree(null, tModule.getmName(), parentMenuId, tModule.getmName(), date, "1",
				"../menu/gotoModuleForm?moduleId=" + tModule.getmId(), null, "closed");
		this.tMenuTreeDao.insert(menu);
		// 模块--表
		TMenuTree moduleTableMenu = new TMenuTree(null, "表", menu.getmId(), "表", date, "1", "../menu/gotoTableTable",
				null, "open");
		this.tMenuTreeDao.insert(moduleTableMenu);
		// 模块--视图
		TMenuTree moduleViewMenu = new TMenuTree(null, "视图", menu.getmId(), "视图", date, "1", "../menu/gotoViewTable",
				null, "open");
		this.tMenuTreeDao.insert(moduleViewMenu);
		// 模块--序列
		TMenuTree moduleSeqMenu = new TMenuTree(null, "序列", menu.getmId(), "序列", date, "1", "../menu/gotoSeqTable",
				null, "open");
		this.tMenuTreeDao.insert(moduleSeqMenu);
		// 模块--索引
		TMenuTree moduleIndexMenu = new TMenuTree(null, "索引", menu.getmId(), "索引", date, "1", "../menu/gotoIndexTable",
				null, "open");
		this.tMenuTreeDao.insert(moduleIndexMenu);
		// 模块--数据元
		TMenuTree moduleDataElementMenu = new TMenuTree(null, "数据元", menu.getmId(), "数据元", date, "1",
				"../menu/gotoDataElementTable", null, "closed");
		this.tMenuTreeDao.insert(moduleDataElementMenu);
		// 模块--数据元--数据元信息
		TMenuTree moduleDataElementInfoMenu = new TMenuTree(null, "数据元信息", moduleDataElementMenu.getmId(), "数据元信息",
				date, "1", "../menu/gotoDataElementInfoTable", null, "open");
		this.tMenuTreeDao.insert(moduleDataElementInfoMenu);
		// 模块--数据元--引用标准
		TMenuTree doduleRefStandardMenu = new TMenuTree(null, "引用标准", moduleDataElementMenu.getmId(), "引用标准", date, "1",
				"../menu/gotoRefStandardTable", null, "open");
		this.tMenuTreeDao.insert(doduleRefStandardMenu);
		// ****************************增加关系*********************
		// 建立菜单树与具体模块的关系
		TRelation moduleRelation = new TRelation(null, menu.getmId(), "模块详情", "T_MODULE", tModule.getmId(), "模块详情节点");
		this.tRelationDao.insert(moduleRelation);
	}

	public void deleteModuleTree(String moduleId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("模块详情");
		criteria.andRPkIdEqualTo(moduleId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		this.RecursiveDeleteTree(relation.getrMenuId());
	}

	public TMenuTree getModuleTree(String moduleId) {
		TRelationExample example = new TRelationExample();
		com.dhcc.dic.entity.TRelationExample.Criteria criteria = example.createCriteria();
		criteria.andRMenuTypeEqualTo("模块详情");
		criteria.andRPkIdEqualTo(moduleId);
		TRelation relation = this.tRelationDao.selectByExample(example).get(0);
		return this.tMenuTreeDao.selectByPrimaryKey(relation.getrMenuId());
	}
}
