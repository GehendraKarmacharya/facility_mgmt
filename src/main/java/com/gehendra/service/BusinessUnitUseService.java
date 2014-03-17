package com.gehendra.service;

import java.util.Date;
import java.util.List;

import com.gehendra.model.BusinessUnitUse;

public interface BusinessUnitUseService {
	public void add(BusinessUnitUse BusinessUnitUse);
	public void update(BusinessUnitUse BusinessUnitUse);
	public BusinessUnitUse getBusinessUnitUse(int ID);
	public List BusinessUnitUseForSpecificDate(Date d1,Date d2);
	public List BusinessUnitUseByPriceRange(float rate);
}
