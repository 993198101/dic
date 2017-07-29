package com.dhcc.dic.dao;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dhcc.dic.entity.TProject;
import com.dhcc.dic.entity.TProjectExample;

public interface TProjectDao {
    int countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(String pId);

    int insert(TProject record);

    int insertSelective(TProject record);

    List<TProject> selectByExample(TProjectExample example);

    TProject selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);
}