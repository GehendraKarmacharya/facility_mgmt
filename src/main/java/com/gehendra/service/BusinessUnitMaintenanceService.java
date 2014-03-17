package com.gehendra.service;

import java.util.List;

import com.gehendra.model.BusinessUnitMaintenance;

public interface BusinessUnitMaintenanceService {
	public void add(BusinessUnitMaintenance BusinessUnitMaintenance);
	public void update(BusinessUnitMaintenance BusinessUnitMaintenance);
	public void delete(int ID);
	public BusinessUnitMaintenance getRequestedBusinessUnitMaintenance(int ID);
	public List getAllRequestedBusinessUnitMaintenance();

}
