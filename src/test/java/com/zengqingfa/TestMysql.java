package com.zengqingfa;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:44
 *
 */

import com.zengqingfa.dao.CustomerDao;
import com.zengqingfa.domain.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMysql {

    @Test
    public void TestFindAll() {
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        List<Customer> customers = customerDao.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Test
    public void TestFindCustomerById() {
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(11l);
        System.out.println(customer);
    }


}
