/**
 * 
 */
package com.zxjt.testplatform.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author sanghui
 *
 */

@Controller
@ResponseBody
public class TestController {
	
    @RequestMapping("/")
    public ModelAndView getIndex(){
    	System.console().printf("test");
        ModelAndView mav = new ModelAndView("index");
        return mav;    
    }
    
    @RequestMapping(value="/test")
    public String testController(){
        System.out.println("This is a test msg!!!");
        return "Test Message!!!";
    }
    
    @RequestMapping(value="/login")
    public JSONObject loginController(){
        System.out.println("User login!");
        JSONObject response = new JSONObject();
        response.put("code", 200);
        response.put("msg", "SUCCESS");
        
        JSONObject user = new JSONObject();
        user.put("id", 1);
        user.put("username", "admin");
        user.put("password", "123456");
        user.put("name", "Admin");
        user.put("id", 1);
        
        response.put("user", user);
        
        return response;
    }
 
}
