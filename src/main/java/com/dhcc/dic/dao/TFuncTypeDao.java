package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TFuncType;
import com.dhcc.dic.entity.TFuncTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFuncTypeDao {
    int countByExample(TFuncTypeExample example);

    int deleteByExample(TFuncTypeExample example);

    int deleteByPrimaryKey(String fId);

    int insert(TFuncType record);

    int insertSelective(TFuncType record);

    List<TFuncType> selectByExample(TFuncTypeExample example);

    TFuncType selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") TFuncType record, @Param("example") TFuncTypeExample example);

    int updateByExample(@Param("record") TFuncType record, @Param("example") TFuncTypeExample example);

    int updateByPrimaryKeySelective(TFuncType record);

    int updateByPrimaryKey(TFuncType record);
}