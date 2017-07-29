package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TMenuTree;
import com.dhcc.dic.entity.TMenuTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuTreeDao {
	
	void RecursiveDeleteTree(@Param("startMId")String startMId);
	
	int countByExample(TMenuTreeExample example);

    int deleteByExample(TMenuTreeExample example);

    int deleteByPrimaryKey(String mId);

    int insert(TMenuTree record);

    int insertSelective(TMenuTree record);

    List<TMenuTree> selectByExample(TMenuTreeExample example);

    TMenuTree selectByPrimaryKey(String mId);

    int updateByExampleSelective(@Param("record") TMenuTree record, @Param("example") TMenuTreeExample example);

    int updateByExample(@Param("record") TMenuTree record, @Param("example") TMenuTreeExample example);

    int updateByPrimaryKeySelective(TMenuTree record);

    int updateByPrimaryKey(TMenuTree record);
}