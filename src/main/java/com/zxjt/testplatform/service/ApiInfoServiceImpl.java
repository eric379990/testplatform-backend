package com.zxjt.testplatform.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zxjt.testplatform.dao.CustomDataDao;
import com.zxjt.testplatform.model.ColumnPtywInfoExample;


@Service
public class ApiInfoServiceImpl implements ApiInfoService{

	@Autowired
	private CustomDataDao customDataDao;
	
	@Override
	public List<JSONObject> getAllApiList() {
		List<JSONObject> result = customDataDao.selectAllApiAndId();
		return result;
	}

	@Override
	public List<JSONObject> getApiParameterNamebyId(Long id) {
		List<JSONObject> result = customDataDao.selectApiParameterNameById(id);
		return result;
	}

	@Override
	public List<JSONObject> getApiParameterDatabyId(Long id) {
		List<JSONObject> result = new ArrayList<JSONObject>();
		List<JSONObject> apiData = customDataDao.selectApiParameterDataById(id);
		Iterator<JSONObject> it = apiData.iterator();
		int rowIndex = 1;
		JSONObject row = new JSONObject();
		while(it.hasNext()){
			JSONObject item = it.next();
			if(rowIndex == item.getIntValue("rowindex")){
				row.put(item.getString("cname"), item.getString("cvalue"));
			}else{
				result.add(row);
				row = new JSONObject();
				rowIndex = item.getIntValue("rowindex");
			}
		}
		result.add(row);
		return result;
	}

	@Override
	public JSONObject saveApiParameterDatabyId(JSONObject params) {
		if(params!=null && !params.isEmpty()){
			ColumnPtywInfoExample example = new ColumnPtywInfoExample();
			ColumnPtywInfoExample.Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(params.getLong("id"));
			for (Map.Entry<String, Object> entry : params.entrySet()) {
	            System.out.println(entry.getKey() + ":" + entry.getValue());

	        }
		}
		return null;
	}
	

}
