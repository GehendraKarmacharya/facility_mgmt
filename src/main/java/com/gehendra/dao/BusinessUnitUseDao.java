package com.gehendra.dao;

import java.util.Date;
import java.util.List;

import com.gehendra.model.BusinessUnitUse;;

public interface BusinessUnitUseDao {
	public void add(BusinessUnitUse BusinessUnitUse);
	public void update(BusinessUnitUse BusinessUnitUse);
	public BusinessUnitUse getBusinessUnitUse(int ID);
	public List getAllBusinessUnitUse();
	public List BusinessUnitUseForSpecificDate(Date d1,Date d2);
	public List BusinessUnitUseByPriceRange(float rate);
}
