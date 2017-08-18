package com.dhcc.dic.dao;

import com.dhcc.dic.entity.SysOption;
import com.dhcc.dic.entity.TSysParmDic;
import com.dhcc.dic.entity.TSysParmDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysParmDicDao {
    int countByExample(TSysParmDicExample example);

    int deleteByExample(TSysParmDicExample example);

    int insert(TSysParmDic record);

    int insertSelective(TSysParmDic record);

    List<TSysParmDic> selectByExample(TSysParmDicExample example);

    int updateByExampleSelective(@Param("record") TSysParmDic record, @Param("example") TSysParmDicExample example);

    int updateByExample(@Param("record") TSysParmDic record, @Param("example") TSysParmDicExample example);
    
    List<SysOption> getOptionList(@Param("keyName") String keyName);
}