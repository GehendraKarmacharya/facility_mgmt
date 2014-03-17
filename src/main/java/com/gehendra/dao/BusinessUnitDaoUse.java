package com.gehendra.dao;

import java.util.List;

import com.gehendra.model.BusinessUnitUse;;

public interface BusinessUnitDaoUse {
	public void add(BusinessUnitUse BusinessUnitUse);
	public void edit(BusinessUnitUse BusinessUnitUse);
	//public void delete(int ID);
	public BusinessUnitUse getBusinessUnitUse(int ID);
	public List getAllBusinessUnitUse();
}
