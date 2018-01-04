package com.zxjt.testplatform.dao;

import java.util.List;
import com.zxjt.testplatform.model.RowPtywInfo;
import com.zxjt.testplatform.model.RowPtywInfoExample;
import com.zxjt.testplatform.model.RowPtywInfoKey;
import org.apache.ibatis.annotations.Param;

public interface RowPtywInfoDao {
    long countByExample(RowPtywInfoExample example);

    int deleteByExample(RowPtywInfoExample example);

    int deleteByPrimaryKey(RowPtywInfoKey key);

    int insert(RowPtywInfo record);

    int insertSelective(RowPtywInfo record);

    List<RowPtywInfo> selectByExample(RowPtywInfoExample example);

    RowPtywInfo selectByPrimaryKey(RowPtywInfoKey key);

    int updateByExampleSelective(@Param("record") RowPtywInfo record, @Param("example") RowPtywInfoExample example);

    int updateByExample(@Param("record") RowPtywInfo record, @Param("example") RowPtywInfoExample example);

    int updateByPrimaryKeySelective(RowPtywInfo record);

    int updateByPrimaryKey(RowPtywInfo record);
    
    List<Long> selectDistinctId();
}