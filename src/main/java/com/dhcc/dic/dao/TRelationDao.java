package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TRelation;
import com.dhcc.dic.entity.TRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationDao {
    int countByExample(TRelationExample example);

    int deleteByExample(TRelationExample example);

    int deleteByPrimaryKey(String rId);

    int insert(TRelation record);

    int insertSelective(TRelation record);

    List<TRelation> selectByExample(TRelationExample example);

    TRelation selectByPrimaryKey(String rId);

    int updateByExampleSelective(@Param("record") TRelation record, @Param("example") TRelationExample example);

    int updateByExample(@Param("record") TRelation record, @Param("example") TRelationExample example);

    int updateByPrimaryKeySelective(TRelation record);

    int updateByPrimaryKey(TRelation record);
}