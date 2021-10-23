package com.surendiran.crudmvc.DAO;

import com.surendiran.crudmvc.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibImpl implements EmployeeDAO {

    // define field for Entitymanager
    private EntityManager entityManager;

    // setup constructor injection
    @Autowired
    public EmployeeDAOHibImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        // get the session
        Session currSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Employee> theQuery = currSession.createQuery("from Employee", Employee.class);

        // exeucte a query and get a result
        List<Employee> employees = theQuery.getResultList();

        // return the result
        return employees;
    }
}
