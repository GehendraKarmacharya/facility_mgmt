package com.gehendra.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gehendra.dao.BusinessUnitDao;
import com.gehendra.model.BusinessUnit;

@Repository
public class BusinessUnitDaoImpl implements BusinessUnitDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(BusinessUnit BusinessUnit) {
		session.getCurrentSession().save(BusinessUnit);
	}

	@Override
	public void update(BusinessUnit BusinessUnit) {
		session.getCurrentSession().update(BusinessUnit);
	}

	@Override
	public void delete(int ID) {
		session.getCurrentSession().delete(getBusinessUnit(ID));
	}

	@Override
	public BusinessUnit getBusinessUnit(int ID) {
		return (BusinessUnit)session.getCurrentSession().get(BusinessUnit.class, ID);
	}

	@Override
	public List getAllBusinessUnit() {
		return session.getCurrentSession().createQuery("from BusinessUnit").list();
	}
	@Override
	public List getAllAvailableBusinessUnit() {
		return session.getCurrentSession().createQuery("from BusinessUnit b where b.IS_AVAILABLE=1 and b.STATUS=1").list();
	}
	@Override
	public List getAllOccupiedBusinessUnit() {
		return session.getCurrentSession().createQuery("from BusinessUnit b where b.IS_AVAILABLE=1 and b.STATUS=1").list();
	}
	
	@Override
	public List getAllUnderConstructionBusinessUnit() {
		return session.getCurrentSession().createQuery("from BusinessUnit b where b.STATUS=0").list();
	}
}
