package com.dhcc.dic.dao;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TTable;
import com.dhcc.dic.entity.TTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTableDao {
    int countByExample(TTableExample example);

    int deleteByExample(TTableExample example);

    int deleteByPrimaryKey(String tId);

    int insert(TTable record);

    int insertSelective(TTable record);

    List<TTable> selectByExample(TTableExample example);

    TTable selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") TTable record, @Param("example") TTableExample example);

    int updateByExample(@Param("record") TTable record, @Param("example") TTableExample example);

    int updateByPrimaryKeySelective(TTable record);

    int updateByPrimaryKey(TTable record);
    
    List<SysOption> getSysOptionList();
}