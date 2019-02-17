package com.zengqingfa.service.impl;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:23
 *
 */

import com.zengqingfa.dao.CustomerDao;
import com.zengqingfa.domain.Customer;
import com.zengqingfa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    //注入dao
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
