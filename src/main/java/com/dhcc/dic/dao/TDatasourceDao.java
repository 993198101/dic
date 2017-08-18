package com.dhcc.dic.dao;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TDatasource;
import com.dhcc.dic.entity.TDatasourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDatasourceDao {
    int countByExample(TDatasourceExample example);

    int deleteByExample(TDatasourceExample example);

    int deleteByPrimaryKey(String dId);

    int insert(TDatasource record);

    int insertSelective(TDatasource record);

    List<TDatasource> selectByExample(TDatasourceExample example);

    TDatasource selectByPrimaryKey(String dId);

    int updateByExampleSelective(@Param("record") TDatasource record, @Param("example") TDatasourceExample example);

    int updateByExample(@Param("record") TDatasource record, @Param("example") TDatasourceExample example);

    int updateByPrimaryKeySelective(TDatasource record);

    int updateByPrimaryKey(TDatasource record);
    
    List<SysOption> getSysDatabaseTypeSelect();
}