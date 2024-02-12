package com.dev.javafxjdbc.model.dao;

import com.dev.javafxjdbc.db.DB;
import com.dev.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.dev.javafxjdbc.model.dao.impl.SellerDaoJDBC;;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
