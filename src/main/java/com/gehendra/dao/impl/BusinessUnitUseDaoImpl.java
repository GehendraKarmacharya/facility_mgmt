package com.gehendra.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gehendra.dao.BusinessUnitUseDao;
import com.gehendra.model.BusinessUnit;
import com.gehendra.model.BusinessUnitUse;

@Repository
public class BusinessUnitUseDaoImpl implements BusinessUnitUseDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(BusinessUnitUse BusinessUnitUse) {
		session.getCurrentSession().save(BusinessUnitUse);
	}

	@Override
	public void update(BusinessUnitUse BusinessUnitUse) {
		session.getCurrentSession().update(BusinessUnitUse);
	}

	@Override
	public BusinessUnitUse getBusinessUnitUse(int ID) {
		return (BusinessUnitUse)session.getCurrentSession().get(BusinessUnitUse.class, ID);
	}

	@Override
	public List BusinessUnitUseForSpecificDate(Date d1, Date d2) {
		return session.getCurrentSession().createQuery("from BusinessUnitUse b where b.LEASE_START_DATEE=:d1 and b.LEASE_END_DATE=:d2").list();
	}

	@Override
	public List BusinessUnitUseByPriceRange(float rate) {
		return session.getCurrentSession().createQuery("from BusinessUnitUse b where b.RENT=:rate").list();
	}

}
