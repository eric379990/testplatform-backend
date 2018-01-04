package com.zxjt.testplatform.dao;

import java.util.List;
import com.zxjt.testplatform.model.ColumnPtywInfo;
import com.zxjt.testplatform.model.ColumnPtywInfoExample;
import com.zxjt.testplatform.model.ColumnPtywInfoKey;
import org.apache.ibatis.annotations.Param;

public interface ColumnPtywInfoDao {
    long countByExample(ColumnPtywInfoExample example);

    int deleteByExample(ColumnPtywInfoExample example);

    int deleteByPrimaryKey(ColumnPtywInfoKey key);

    int insert(ColumnPtywInfo record);

    int insertSelective(ColumnPtywInfo record);

    List<ColumnPtywInfo> selectByExample(ColumnPtywInfoExample example);

    ColumnPtywInfo selectByPrimaryKey(ColumnPtywInfoKey key);

    int updateByExampleSelective(@Param("record") ColumnPtywInfo record, @Param("example") ColumnPtywInfoExample example);

    int updateByExample(@Param("record") ColumnPtywInfo record, @Param("example") ColumnPtywInfoExample example);

    int updateByPrimaryKeySelective(ColumnPtywInfo record);

    int updateByPrimaryKey(ColumnPtywInfo record);
}