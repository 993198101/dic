package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TConsColumns;
import com.dhcc.dic.entity.TConsColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConsColumnsDao {
    int countByExample(TConsColumnsExample example);

    int deleteByExample(TConsColumnsExample example);

    int deleteByPrimaryKey(String ccId);

    int insert(TConsColumns record);

    int insertSelective(TConsColumns record);

    List<TConsColumns> selectByExample(TConsColumnsExample example);

    TConsColumns selectByPrimaryKey(String ccId);

    int updateByExampleSelective(@Param("record") TConsColumns record, @Param("example") TConsColumnsExample example);

    int updateByExample(@Param("record") TConsColumns record, @Param("example") TConsColumnsExample example);

    int updateByPrimaryKeySelective(TConsColumns record);

    int updateByPrimaryKey(TConsColumns record);
}