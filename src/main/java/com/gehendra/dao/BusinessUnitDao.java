package com.gehendra.dao;

import java.util.List;

import com.gehendra.model.BusinessUnit;

public interface BusinessUnitDao {
	public void add(BusinessUnit BusinessUnit);
	public void update(BusinessUnit BusinessUnit);
	public void delete(int ID);
	public BusinessUnit getBusinessUnit(int ID);
	public List getAllBusinessUnit();
	public List getAllAvailableBusinessUnit();
	public List getAllOccupiedBusinessUnit();
	public List getAllUnderConstructionBusinessUnit();
}
