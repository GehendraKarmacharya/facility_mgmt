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
import com.gehendra.model.BusinessUnitMaintenance;
import com.gehendra.service.BusinessUnitMaintenanceService;

@Controller
public class BusinessUnitMaintenanceController {
	@Autowired
	private BusinessUnitMaintenanceService BusinessUnitMaintenanceService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		BusinessUnitMaintenance BusinessUnitMaintenance = new BusinessUnitMaintenance();
		map.put("BusinessUnitMaintenance", BusinessUnitMaintenance);
		map.put("BusinessUnitMaintenanceList", BusinessUnitMaintenanceService.getAllRequestedBusinessUnitMaintenance());
		return "BusinessUnit";
	}
	
	@RequestMapping(value="/BusinessUnitMaintenance.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute BusinessUnitMaintenance BusinessUnitMaintenance, BindingResult result, @RequestParam String action, Map<String, Object> map){
		BusinessUnitMaintenance BusinessUnitMaintenanceResult = new BusinessUnitMaintenance();
		switch(action.toLowerCase()){
		case "add":
			BusinessUnitMaintenanceService.add(BusinessUnitMaintenance);
			BusinessUnitMaintenanceResult = BusinessUnitMaintenance;
			break;
		case "update":
			BusinessUnitMaintenanceService.update(BusinessUnitMaintenance);
			BusinessUnitMaintenanceResult = BusinessUnitMaintenance;
			break;
		case "delete":
			BusinessUnitMaintenanceService.delete(BusinessUnitMaintenance.getBUSINESS_UNIT_ID());
			BusinessUnitMaintenanceResult = new BusinessUnitMaintenance();
			break;
		case "search":
			BusinessUnitMaintenance searchedBusinessUnitMaintenance = BusinessUnitMaintenanceService.getRequestedBusinessUnitMaintenance(BusinessUnitMaintenance.getBUSINESS_UNIT_ID());
			BusinessUnitMaintenanceResult = searchedBusinessUnitMaintenance!=null ? searchedBusinessUnitMaintenance : new BusinessUnitMaintenance();
			break;
		}
		map.put("BusinessUnitMaintenance", BusinessUnitMaintenanceResult);
		map.put("BusinessUnitMaintenanceList", BusinessUnitMaintenanceService.getAllRequestedBusinessUnitMaintenance());
		return "BusinessUnitMaintenance";
	}

}
