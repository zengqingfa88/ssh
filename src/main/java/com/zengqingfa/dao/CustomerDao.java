package com.zengqingfa.dao;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:21
 *
 */

import com.zengqingfa.domain.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAll();

    Customer findCustomerById(long custId);

    void save(Customer customer);
}
