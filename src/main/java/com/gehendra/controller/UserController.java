package com.gehendra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gehendra.service.USERService;
import com.gehendra.model.USER;
@Controller
public class UserController {
	@Autowired
	private USERService USERService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		USER USER = new USER();
		map.put("USER", USER);
		map.put("USERList", USERService.getAllUsers());
		return "USER";
	}
	@RequestMapping(value="/USER.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute USER USER, BindingResult result, @RequestParam String action, Map<String, Object> map){
		USER USERResult = new USER();
		switch(action.toLowerCase()){
		case "add":
			USERService.add(USER);
			USERResult = USER;
			break;
		case "update":
			USERService.update(USER);
			USERResult = USER;
			break;
		case "delete":
			USERService.delete(USER.getID());
			USERResult = new USER();
			break;
		case "search":
			USER searchedUSER = USERService.getUSER(USER.getID());
			USERResult = searchedUSER!=null ? searchedUSER : new USER();
			break;
		}
		map.put("USER", USERResult);
		map.put("USERList", USERService.getAllUsers());
		return "USER";
	}
}
