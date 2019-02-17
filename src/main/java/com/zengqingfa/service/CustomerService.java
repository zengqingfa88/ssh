package com.zengqingfa.service;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:22
 *
 */

import com.zengqingfa.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
