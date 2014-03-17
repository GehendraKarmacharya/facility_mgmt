package com.gehendra.dao;

import java.util.List;

import com.gehendra.model.USER;

public interface UserDao {
	public void add(USER USER);
	public void edit(USER USER);
	public void delete(int ID);
	public USER getUSER(int ID);
	public List getAllTenant();
	public List getAllEmployee();
}
