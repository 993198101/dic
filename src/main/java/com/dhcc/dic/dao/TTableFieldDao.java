package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TTableField;
import com.dhcc.dic.entity.TTableFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTableFieldDao {
    int countByExample(TTableFieldExample example);

    int deleteByExample(TTableFieldExample example);

    int deleteByPrimaryKey(String fId);

    int insert(TTableField record);

    int insertSelective(TTableField record);

    List<TTableField> selectByExample(TTableFieldExample example);

    TTableField selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") TTableField record, @Param("example") TTableFieldExample example);

    int updateByExample(@Param("record") TTableField record, @Param("example") TTableFieldExample example);

    int updateByPrimaryKeySelective(TTableField record);

    int updateByPrimaryKey(TTableField record);
}