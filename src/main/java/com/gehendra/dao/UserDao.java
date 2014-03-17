package com.gehendra.dao;

import java.util.List;

import com.gehendra.model.USER;

public interface UserDao {
	public void add(USER USER);
	public void update(USER USER);
	public void delete(int ID);
	public USER getUSER(int ID);
	public List getAllUsers();
	public List getAllTenant();
	public List getAllEmployee();
	public List getEmployeeByFirstName(String fName);
	public List getTeenantByFirstName(String fName);
}
