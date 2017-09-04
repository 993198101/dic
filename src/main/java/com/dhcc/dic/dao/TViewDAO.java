package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TView;
import com.dhcc.dic.entity.TViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TViewDAO {
    int countByExample(TViewExample example);

    int deleteByExample(TViewExample example);

    int deleteByPrimaryKey(String vId);

    int insert(TView record);

    int insertSelective(TView record);

    List<TView> selectByExample(TViewExample example);

    TView selectByPrimaryKey(String vId);

    int updateByExampleSelective(@Param("record") TView record, @Param("example") TViewExample example);

    int updateByExample(@Param("record") TView record, @Param("example") TViewExample example);

    int updateByPrimaryKeySelective(TView record);

    int updateByPrimaryKey(TView record);
}