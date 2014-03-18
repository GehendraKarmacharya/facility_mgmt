package com.gehendra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gehendra.model.BusinessUnit;
import com.gehendra.model.BusinessUnitUse;
import com.gehendra.service.BusinessUnitUseService;

@Controller
public class BusinessUnitUseController {
	@Autowired
	private BusinessUnitUseService BusinessUnitUseService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		BusinessUnitUse BusinessUnitUse = new BusinessUnitUse();
		map.put("BusinessUnitUse", BusinessUnitUse);
		map.put("BusinessUnitUseList", BusinessUnitUseService.getAllBusinessUnitUse());
		return "BusinessUnit";
	}
	@RequestMapping(value="/BusinessUnitUse.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute BusinessUnitUse BusinessUnitUse, BindingResult result, @RequestParam String action, Map<String, Object> map){
		BusinessUnitUse BusinessUnitUseResult = new BusinessUnitUse();
		switch(action.toLowerCase()){
		case "add":
			BusinessUnitUseService.add(BusinessUnitUse);
			BusinessUnitUseResult = BusinessUnitUse;
			break;
		case "update":
			BusinessUnitUseService.update(BusinessUnitUse);
			BusinessUnitUseResult = BusinessUnitUse;
			break;
		case "search":
			BusinessUnitUse searchedBusinessUnitUse = BusinessUnitUseService.getBusinessUnitUse(BusinessUnitUse.getBUSINESS_UNIT_ID());
			BusinessUnitUseResult = searchedBusinessUnitUse!=null ? searchedBusinessUnitUse : new BusinessUnitUse();
			break;
		}
		map.put("BusinessUnitUse", BusinessUnitUseResult);
		map.put("BusinessUnitUseList", BusinessUnitUseService.getAllBusinessUnitUse());
		return "BusinessUnitUse";
	}
}
