package com.gehendra.service;

import java.util.List;

import com.gehendra.model.BusinessUnit;

public interface BusinessUnitService {
	public void add(BusinessUnit BusinessUnit);
	public void edit(BusinessUnit BusinessUnit);
	public void delete(int ID);
	public BusinessUnit getBusinessUnit(int ID);
	public List getAllBusinessUnit();
	public List getAllAvailableBusinessUnit();
	public List getAllOccupiedBusinessUnit();
	public List getAllUnderConstructionBusinessUnit();
}
