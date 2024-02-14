package com.dev.javafxjdbc.model.services;

import com.dev.javafxjdbc.model.dao.DaoFactory;
import com.dev.javafxjdbc.model.dao.DepartmentDao;
import com.dev.javafxjdbc.model.entities.Department;

import java.util.List;

public class DepartmentService {
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }
}