package com.gehendra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gehendra.service.BusinessUnitService;
import com.gehendra.model.BusinessUnit;

@Controller
public class BusinessUnitController {
	@Autowired
	private BusinessUnitService BusinessUnitService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		BusinessUnit BusinessUnit = new BusinessUnit();
		map.put("BusinessUnit", BusinessUnit);
		map.put("BusinessUnitList", BusinessUnitService.getAllBusinessUnit());
		return "BusinessUnit";
	}
	@RequestMapping(value="/BusinessUnit.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute BusinessUnit BusinessUnit, BindingResult result, @RequestParam String action, Map<String, Object> map){
		BusinessUnit BusinessUnitResult = new BusinessUnit();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			BusinessUnitService.add(BusinessUnit);
			BusinessUnitResult = BusinessUnit;
			break;
		case "update":
			BusinessUnitService.edit(BusinessUnit);
			BusinessUnitResult = BusinessUnit;
			break;
		case "delete":
			BusinessUnitService.delete(BusinessUnit.getID());
			BusinessUnitResult = new BusinessUnit();
			break;
		case "search":
			BusinessUnit searchedBusinessUnit = BusinessUnitService.getBusinessUnit(BusinessUnit.getID());
			BusinessUnitResult = searchedBusinessUnit!=null ? searchedBusinessUnit : new BusinessUnit();
			break;
		}
		map.put("BusinessUnit", BusinessUnitResult);
		map.put("BusinessUnitList", BusinessUnitService.getAllBusinessUnit());
		return "BusinessUnit";
	}
	
}
