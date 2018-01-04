package com.zxjt.testplatform.dao;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface CustomDataDao {
    
	/*
	 * Get the available api list
	 */
    List<JSONObject> selectAllApiAndId();
    
    List<JSONObject> selectApiParameterNameById(Long id);
    
    List<JSONObject> selectApiParameterDataById(Long id);
}