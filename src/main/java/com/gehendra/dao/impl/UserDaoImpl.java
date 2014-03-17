package com.gehendra.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gehendra.dao.UserDao;
import com.gehendra.model.USER;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(USER USER) {
		session.getCurrentSession().save(USER);
	}
	
	@Override
	public void update(USER USER) {
		session.getCurrentSession().update(USER);
	}

	@Override
	public void delete(int ID) {
		session.getCurrentSession().delete(getUSER(ID));
	}

	@Override
	public USER getUSER(int ID) {
		return (USER)session.getCurrentSession().get(USER.class, ID);
	}
	
	@Override
	public List getAllUsers() {
		return session.getCurrentSession().createQuery("from USER").list();
	}

	@Override
	public List getAllTenant() {
		return session.getCurrentSession().createQuery("from USER where TYPE=1").list();
	}

	@Override
	public List getAllEmployee() {
		return session.getCurrentSession().createQuery("from USER where TYPE=0").list();
	}
	@Override
	public List getEmployeeByFirstName(String fName) {
		return session.getCurrentSession().createQuery("from USER where TYPE=0 and FIRST_NAME= :fName").list();
	}
	@Override
	public List getTeenantByFirstName(String fName) {
		return session.getCurrentSession().createQuery("from USER where TYPE=1 and FIRST_NAME= :fName").list();
	}

}
