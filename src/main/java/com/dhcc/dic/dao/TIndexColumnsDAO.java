package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TIndexColumnsExample;
import com.dhcc.dic.entity.TIndexColumnsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIndexColumnsDAO {
    int countByExample(TIndexColumnsExample example);

    int deleteByExample(TIndexColumnsExample example);

    int deleteByPrimaryKey(TIndexColumnsKey key);

    int insert(TIndexColumnsKey record);

    int insertSelective(TIndexColumnsKey record);

    List<TIndexColumnsKey> selectByExample(TIndexColumnsExample example);

    int updateByExampleSelective(@Param("record") TIndexColumnsKey record, @Param("example") TIndexColumnsExample example);

    int updateByExample(@Param("record") TIndexColumnsKey record, @Param("example") TIndexColumnsExample example);
}