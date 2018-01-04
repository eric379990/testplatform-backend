package com.zxjt.testplatform.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface ApiInfoService {
	
	public List<JSONObject> getAllApiList();
	
	public List<JSONObject> getApiParameterNamebyId(Long id);
	
	public List<JSONObject> getApiParameterDatabyId(Long id);
	
	public JSONObject saveApiParameterDatabyId(JSONObject params);
}
