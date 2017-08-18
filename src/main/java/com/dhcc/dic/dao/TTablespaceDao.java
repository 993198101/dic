package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.entity.TTablespaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTablespaceDao {
    int countByExample(TTablespaceExample example);

    int deleteByExample(TTablespaceExample example);

    int deleteByPrimaryKey(String tId);

    int insert(TTablespace record);

    int insertSelective(TTablespace record);

    List<TTablespace> selectByExample(TTablespaceExample example);

    TTablespace selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") TTablespace record, @Param("example") TTablespaceExample example);

    int updateByExample(@Param("record") TTablespace record, @Param("example") TTablespaceExample example);

    int updateByPrimaryKeySelective(TTablespace record);

    int updateByPrimaryKey(TTablespace record);
    
}