package com.zengqingfa.dao.impl;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:32
 *
 */

import com.zengqingfa.dao.CustomerDao;
import com.zengqingfa.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {


    @Override
    public List<Customer> findAll() {
        return (List<Customer>) this.getHibernateTemplate().find("from Customer");

    }

    @Override
    public Customer findCustomerById(long custId) {
        return this.getHibernateTemplate().get(Customer.class, custId);

    }

    @Override
    public void save(Customer customer) {
        this.getHibernateTemplate().save(customer);
    }
}
