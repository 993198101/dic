package com.dhcc.dic.dao;

import com.dhcc.dic.entity.TSeq;
import com.dhcc.dic.entity.TSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSeqDAO {
    int countByExample(TSeqExample example);

    int deleteByExample(TSeqExample example);

    int deleteByPrimaryKey(String sId);

    int insert(TSeq record);

    int insertSelective(TSeq record);

    List<TSeq> selectByExample(TSeqExample example);

    TSeq selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") TSeq record, @Param("example") TSeqExample example);

    int updateByExample(@Param("record") TSeq record, @Param("example") TSeqExample example);

    int updateByPrimaryKeySelective(TSeq record);

    int updateByPrimaryKey(TSeq record);
}