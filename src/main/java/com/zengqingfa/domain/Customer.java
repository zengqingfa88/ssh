package com.zengqingfa.domain;

/*
 *  @ author  zengqingfa
 *  @ created in    2019/2/17  16:22
 *
 */

import java.io.Serializable;

/**
 * PO(Persistence Object)持久化类
 * 7个规范
 * 1. 公有类
 * 2. 公有无参构造
 * 3. 私有属性
 * 4. 公有的getter与setter
 * 5. 实现java.io.Serializable接口
 * 6. 不能用final修饰
 * 7. 如果是基础类型，要使用它的包装类
 */
public class Customer implements Serializable {

    private Long custId;    //id
    private String custName;    //名字
    private Long custUserId;    //用户id
    private Long custCreateId;
    private String custIndustry;
    private String custLevel;
    private String custLinkman;
    private String custPhone;
    private String custMobile;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    public Long getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custUserId=" + custUserId +
                ", custCreateId=" + custCreateId +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custLinkman='" + custLinkman + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custMobile='" + custMobile + '\'' +
                '}';
    }
}

