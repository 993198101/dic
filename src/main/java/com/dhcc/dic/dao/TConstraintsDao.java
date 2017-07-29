package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TConstraints;
import com.dhcc.dic.entity.TConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConstraintsDao {
    int countByExample(TConstraintsExample example);

    int deleteByExample(TConstraintsExample example);

    int deleteByPrimaryKey(String consId);

    int insert(TConstraints record);

    int insertSelective(TConstraints record);

    List<TConstraints> selectByExample(TConstraintsExample example);

    TConstraints selectByPrimaryKey(String consId);

    int updateByExampleSelective(@Param("record") TConstraints record, @Param("example") TConstraintsExample example);

    int updateByExample(@Param("record") TConstraints record, @Param("example") TConstraintsExample example);

    int updateByPrimaryKeySelective(TConstraints record);

    int updateByPrimaryKey(TConstraints record);
}