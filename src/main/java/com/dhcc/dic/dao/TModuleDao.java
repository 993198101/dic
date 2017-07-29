package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TModule;
import com.dhcc.dic.entity.TModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModuleDao {
    int countByExample(TModuleExample example);

    int deleteByExample(TModuleExample example);

    int deleteByPrimaryKey(String mId);

    int insert(TModule record);

    int insertSelective(TModule record);

    List<TModule> selectByExample(TModuleExample example);

    TModule selectByPrimaryKey(String mId);

    int updateByExampleSelective(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByExample(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByPrimaryKeySelective(TModule record);

    int updateByPrimaryKey(TModule record);
}