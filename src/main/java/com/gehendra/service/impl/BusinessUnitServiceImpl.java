package com.gehendra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gehendra.model.BusinessUnit;
import com.gehendra.service.BusinessUnitService;
import com.gehendra.dao.BusinessUnitDao;

@Service
public class BusinessUnitServiceImpl implements BusinessUnitService {
	
	@Autowired
	private BusinessUnitDao BusinessUnitDao;
	
	@Transactional
	public void add(BusinessUnit BusinessUnit) {
		BusinessUnitDao.add(BusinessUnit);
	}

	@Transactional
	public void edit(BusinessUnit BusinessUnit) {
		BusinessUnitDao.edit(BusinessUnit);

	}

	@Transactional
	public void delete(int ID) {
		BusinessUnitDao.delete(ID);

	}

	@Transactional
	public BusinessUnit getBusinessUnit(int ID) {
		return BusinessUnitDao.getBusinessUnit(ID);
	}

	@Transactional
	public List getAllBusinessUnit() {
		return BusinessUnitDao.getAllBusinessUnit();
	}
	@Transactional
	public List getAllAvailableBusinessUnit() {
		return BusinessUnitDao.getAllAvailableBusinessUnit();
	}
	@Transactional
	public List getAllOccupiedBusinessUnit() {
		return BusinessUnitDao.getAllOccupiedBusinessUnit();
	}
	@Transactional
	public List getAllUnderConstructionBusinessUnit() {
		return BusinessUnitDao.getAllUnderConstructionBusinessUnit();
	}
}
