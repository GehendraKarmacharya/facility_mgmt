package com.gehendra.dao;

import java.util.List;

import com.gehendra.model.BusinessUnitMaintenance;

public interface BusinessUnitMaintenanceDao {
	public void add(BusinessUnitMaintenance BusinessUnitMaintenance);
	public void update(BusinessUnitMaintenance BusinessUnitMaintenance);
	public void delete(int ID);
	public BusinessUnitMaintenance getRequestedBusinessUnit(int ID);
	public List getAllRequestedBusinessUnitMaintenance();
}
