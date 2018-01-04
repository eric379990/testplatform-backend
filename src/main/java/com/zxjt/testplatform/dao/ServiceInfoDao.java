package com.zxjt.testplatform.dao;

import java.util.List;
import com.zxjt.testplatform.model.ServiceInfo;
import com.zxjt.testplatform.model.ServiceInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ServiceInfoDao {
    long countByExample(ServiceInfoExample example);

    int deleteByExample(ServiceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    List<ServiceInfo> selectByExampleWithBLOBs(ServiceInfoExample example);

    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    ServiceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByExample(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKeyWithBLOBs(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);
}