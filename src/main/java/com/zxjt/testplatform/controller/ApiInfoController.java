/**
 * 
 */
package com.zxjt.testplatform.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.alibaba.fastjson.JSONObject;
import com.zxjt.testplatform.service.ApiInfoService;

/**
 * @author sanghui
 *
 */

@Controller
@ResponseBody
public class ApiInfoController {
	
	@Resource
	private ApiInfoService apiInfoService;
	
    @RequestMapping(value="/getApiList")
    public List<JSONObject> apiListController(){
    	List<JSONObject> apiList = apiInfoService.getAllApiList();
        return apiList;
    }
    
    @RequestMapping(value="/getApiParameterDataInfo")
    public JSONObject apiParameterDataController(@RequestParam Long apiId){
    	JSONObject result = new JSONObject();
    	List<JSONObject> apiList = apiInfoService.getApiParameterNamebyId(apiId);
    	List<JSONObject> apiDataList = apiInfoService.getApiParameterDatabyId(apiId);
    	result.put("parameterName", apiList);
    	result.put("parameterData", apiDataList);
        return result;
    }
    
    @RequestMapping(value="/saveApiParameterDataInfo")
    public JSONObject apiParameterDataController(@RequestParam JSONObject params){
    	JSONObject result = new JSONObject();
    	result = apiInfoService.saveApiParameterDatabyId(params);
        return result;
    }
 
}
