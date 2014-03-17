package com.gehendra.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gehendra.dao.BusinessUnitMaintenanceDao;
import com.gehendra.model.BusinessUnit;
import com.gehendra.model.BusinessUnitMaintenance;

@Repository
public class BusinessUnitMaintenanceDaoImpl implements
		BusinessUnitMaintenanceDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void add(BusinessUnitMaintenance BusinessUnitMaintenance) {
		session.getCurrentSession().save(BusinessUnitMaintenance);
		
	}

	@Override
	public void update(BusinessUnitMaintenance BusinessUnitMaintenance) {
		session.getCurrentSession().update(BusinessUnitMaintenance);
		
	}

	@Override
	public void delete(int ID) {
		session.getCurrentSession().delete(getRequestedBusinessUnit(ID));
	}

	@Override
	public BusinessUnitMaintenance getRequestedBusinessUnit(int ID) {
		return (BusinessUnitMaintenance)session.getCurrentSession().get(BusinessUnitMaintenance.class, ID);
	}

	@Override
	public List getAllRequestedBusinessUnitMaintenance() {
		return session.getCurrentSession().createQuery("from BusinessUnitMaintenance").list();
	}

}
