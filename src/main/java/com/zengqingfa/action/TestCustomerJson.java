package com.zengqingfa.action;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  19:18
 *
 */

import com.opensymphony.xwork2.ActionSupport;
import com.zengqingfa.domain.Customer;
import com.zengqingfa.service.CustomerService;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCustomerJson extends ActionSupport {
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    private List<Customer> list = new ArrayList<>();

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }


    @Autowired
    private CustomerService customerService;

    //使用struts2返回json数据，需要在struts.xml配置要返回的数据
    public String execute() {
        list = customerService.findAll();
        return "success";
    }

    public String testJson() {
        try {
            List<Customer> list = customerService.findAll();
            //将数据存储在map里，再转换成json类型数据，也可以自己手动构造json类型数据
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("list", list);
            JSONObject json = JSONObject.fromObject(map);//将map对象转换成json类型数据
            result = json.toString();//给result赋值，传递给页面
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public void testJson02() {
        try {
            HttpServletResponse response = ServletActionContext.getResponse();
            /*
             * 在调用getWriter之前未设置编码(既调用setContentType或者setCharacterEncoding方法设置编码),
             * HttpServletResponse则会返回一个用默认的编码(既ISO-8859-1)编码的PrintWriter实例。这样就会
             * 造成中文乱码。而且设置编码时必须在调用getWriter之前设置,不然是无效的。
             * */
            response.setContentType("text/html;charset=utf-8");
            //response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            List<Customer> list = customerService.findAll();
            //将数据存储在map里，再转换成json类型数据，也可以自己手动构造json类型数据
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("list", list);
            JSONObject json = JSONObject.fromObject(map);//将map对象转换成json类型数据
            out.print(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
