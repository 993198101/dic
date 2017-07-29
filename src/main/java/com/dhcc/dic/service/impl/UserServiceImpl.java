package com.dhcc.dic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dic.dao.TUserDao;
import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TUser;
import com.dhcc.dic.entity.TUserExample;
import com.dhcc.dic.entity.TUserExample.Criteria;
import com.dhcc.dic.service.UserService;
import com.dhcc.dic.util.MenuTreeUtil;
import com.github.pagehelper.PageHelper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TUserDao tUserDao;
	@Autowired
	private MenuTreeUtil menuTreeUtil;
	@Override
	public List<TUser> getPage(int pageNum, int pageSize, TUser tUser) throws Exception {
		List<TUser> users=null;
		TUserExample example=new TUserExample();
		Criteria criteria=example.createCriteria();
		if(tUser.getuId()!=null)
		criteria.andUIdEqualTo(tUser.getuId());
		if(tUser.getuCnName()!=null)
			criteria.andUCnNameLike("%"+tUser.getuCnName()+"%");
		if(tUser.getuUserName()!=null)
			criteria.andUUserNameLike("%"+tUser.getuUserName()+"%");
		if(tUser.getuPassword()!=null)
			criteria.andUPasswordEqualTo(tUser.getuPassword());
		if(tUser.getuTablespace()!=null)
			criteria.andUTablespaceLike("%"+tUser.getuTablespace()+"%");
		if(tUser.getuDesc()!=null)
			criteria.andUDescLike("%"+tUser.getuDesc()+"%");
		if(tUser.getuDate()!=null)
			criteria.andUDateEqualTo(tUser.getuDate());
		if(tUser.getuSyncState()!=null)
			criteria.andUSyncStateEqualTo(tUser.getuSyncState());
		if(tUser.getuAccess()!=null){
			String []uAccesses=tUser.getuAccess().split(",");
			for(String uAccess:uAccesses){
				criteria.andUAccessLike("%"+uAccess+"%");
			}
		}
		if(tUser.getuOfDatasource()!=null)
			criteria.andUOfDatasourceEqualTo(tUser.getuOfDatasource());
		if(tUser.getuOfProject()!=null)
			criteria.andUOfProjectEqualTo(tUser.getuOfProject());
		try{
			PageHelper.startPage(pageNum, pageSize);
			users=this.tUserDao.selectByExample(example);
		}catch(Exception e){
			e.printStackTrace();
		}
		return users;
	}

	@Override
	@Transactional
	public void addUser(String parentMenuId, TUser tUser) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String mDate = sdf.format(new Date());
		tUser.setuDate(mDate);
		this.tUserDao.insert(tUser);
		this.menuTreeUtil.addUserTree(tUser, parentMenuId, mDate);
	}

	@Override
	public void deleteUserById(String uId) throws Exception {
		// TODO Auto-generated method stub
		this.tUserDao.deleteByPrimaryKey(uId);
		this.menuTreeUtil.deleteUserTree(uId);
	}

	@Override
	public TUser getUserById(String userId) throws Exception {
		// TODO Auto-generated method stub
		return this.tUserDao.selectByPrimaryKey(userId);
	}

	@Override
	public void editUser(TUser user) throws Exception {
		// TODO Auto-generated method stub
		this.tUserDao.updateByPrimaryKeySelective(user);
		if(user.getuCnName()!=null){
			TMenuTree tMenuTree=this.menuTreeUtil.getUserTree(user.getuId());
			tMenuTree.setmText(user.getuCnName());
			this.menuTreeUtil.editMenuTree(tMenuTree);
		}
	}

}
