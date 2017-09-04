package com.dhcc.dic.dao;

import com.dhcc.dic.entity.IndexDTO;
import com.dhcc.dic.entity.TIndex;
import com.dhcc.dic.entity.TIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIndexDao {
    int countByExample(TIndexExample example);

    int deleteByExample(TIndexExample example);

    int deleteByPrimaryKey(String iId);

    int insert(TIndex record);

    int insertSelective(TIndex record);

    List<TIndex> selectByExample(TIndexExample example);

    TIndex selectByPrimaryKey(String iId);

    int updateByExampleSelective(@Param("record") TIndex record, @Param("example") TIndexExample example);

    int updateByExample(@Param("record") TIndex record, @Param("example") TIndexExample example);

    int updateByPrimaryKeySelective(TIndex record);

    int updateByPrimaryKey(TIndex record);
    
    IndexDTO getIndexDTO(@Param("indexId")String indexId);
    
    List<IndexDTO> listTableIndexs(@Param("tableId") String tableId);
}