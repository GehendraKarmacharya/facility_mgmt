package com.gehendra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gehendra.model.BusinessUnitMaintenance;
import com.gehendra.service.BusinessUnitMaintenanceService;
import com.gehendra.dao.BusinessUnitMaintenanceDao;

@Service
public class BusinessUnitMaintenanceImpl implements
		BusinessUnitMaintenanceService {
	@Autowired
	private BusinessUnitMaintenanceDao BusinessUnitMaintenanceDao;
	
	@Transactional
	public void add(BusinessUnitMaintenance BusinessUnitMaintenance) {
		BusinessUnitMaintenanceDao.add(BusinessUnitMaintenance);
		
	}

	@Transactional
	public void update(BusinessUnitMaintenance BusinessUnitMaintenance) {
		BusinessUnitMaintenanceDao.update(BusinessUnitMaintenance);
	}

	@Transactional
	public void delete(int ID) {
		BusinessUnitMaintenanceDao.delete(ID);
	}

	@Transactional
	public BusinessUnitMaintenance getRequestedBusinessUnitMaintenance(int ID) {
		return BusinessUnitMaintenanceDao.getRequestedBusinessUnitMaintenance(ID);
	}

	@Transactional
	public List getAllRequestedBusinessUnitMaintenance() {
		return BusinessUnitMaintenanceDao.getAllRequestedBusinessUnitMaintenance();
	}

}
