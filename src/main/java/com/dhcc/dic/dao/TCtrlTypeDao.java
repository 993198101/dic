package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TCtrlType;
import com.dhcc.dic.entity.TCtrlTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCtrlTypeDao {
    int countByExample(TCtrlTypeExample example);

    int deleteByExample(TCtrlTypeExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TCtrlType record);

    int insertSelective(TCtrlType record);

    List<TCtrlType> selectByExample(TCtrlTypeExample example);

    TCtrlType selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TCtrlType record, @Param("example") TCtrlTypeExample example);

    int updateByExample(@Param("record") TCtrlType record, @Param("example") TCtrlTypeExample example);

    int updateByPrimaryKeySelective(TCtrlType record);

    int updateByPrimaryKey(TCtrlType record);
}