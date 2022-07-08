package com.employee.dao;

import com.employee.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class MyDao {
    @Autowired
    SessionFactory factory;

    MyDao() {

    }

//    @PostConstruct
//    void init() {
//        Session session = factory.openSession();
//        Query query = session.createQuery("from Employee");
//        List list = query.list();
//        System.out.println(list);
//    }

    public String addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(employee);
        tx.commit();
        session.close();
        return "employeeId "+employee.getId()+" save successfully..";
    }
}
