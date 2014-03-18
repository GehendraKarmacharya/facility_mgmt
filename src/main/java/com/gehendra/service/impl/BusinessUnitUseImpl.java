package com.gehendra.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gehendra.model.BusinessUnitUse;
import com.gehendra.service.BusinessUnitUseService;
import com.gehendra.dao.BusinessUnitUseDao;

@Service
public class BusinessUnitUseImpl implements BusinessUnitUseService {
	@Autowired
	private BusinessUnitUseDao BusinessUnitUseDao; 
	
	@Transactional
	public void add(BusinessUnitUse BusinessUnitUse) {
		BusinessUnitUseDao.add(BusinessUnitUse);
		
	}

	@Transactional
	public void update(BusinessUnitUse BusinessUnitUse) {
		BusinessUnitUseDao.update(BusinessUnitUse);
		
	}

	@Transactional
	public BusinessUnitUse getBusinessUnitUse(int ID) {
		return BusinessUnitUseDao.getBusinessUnitUse(ID);
	}
	
	@Transactional
	public List getAllBusinessUnitUse() {
		return BusinessUnitUseDao.getAllBusinessUnitUse();
	}

	@Transactional
	public List BusinessUnitUseForSpecificDate(Date d1, Date d2) {
		return BusinessUnitUseDao.BusinessUnitUseForSpecificDate(d1, d2);
	}

	@Transactional
	public List BusinessUnitUseByPriceRange(float rate) {
		return BusinessUnitUseDao.BusinessUnitUseByPriceRange(rate);
	}

}
