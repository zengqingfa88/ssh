package com.zengqingfa.action;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:23
 *
 */

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Result;
import com.zengqingfa.domain.Customer;
import com.zengqingfa.service.CustomerService;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerAction {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Autowired
    private CustomerService customerService;

    public String findAll() {
        List<Customer> list = customerService.findAll();
        ServletActionContext.getContext().put("list", list);
        return "list";
    }


}
