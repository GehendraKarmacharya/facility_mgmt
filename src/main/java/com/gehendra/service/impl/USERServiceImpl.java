package com.gehendra.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gehendra.dao.UserDao;
import com.gehendra.model.USER;
import com.gehendra.service.USERService;

@Service
public class USERServiceImpl implements USERService {
	
	@Autowired
	private UserDao UserDao;
	
	@Transactional
	public void add(USER USER) {
		UserDao.add(USER);
		
	}

	@Transactional
	public void update(USER USER) {
		UserDao.update(USER);
	}

	@Transactional
	public void delete(int ID) {
		UserDao.delete(ID);
	}

	@Transactional
	public USER getUSER(int ID) {
		return UserDao.getUSER(ID);
	}

	@Transactional
	public List getAllUsers() {
		return UserDao.getAllUsers();
	}

	@Transactional
	public List getAllTenant() {
		return UserDao.getAllTenant();
	}

	@Transactional
	public List getAllEmployee() {
		return UserDao.getAllEmployee();
	}

	@Transactional
	public List getEmployeeByFirstName(String fName) {
		return UserDao.getEmployeeByFirstName(fName);
	}

	@Transactional
	public List getTeenantByFirstName(String fName) {
		return UserDao.getTeenantByFirstName(fName);
	}

}
