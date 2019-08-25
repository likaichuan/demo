package com.demo.entity;

public class Person {
    private Integer id;

    private String pName;

    private Integer pAge;

    private String pIdNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public String getpIdNum() {
        return pIdNum;
    }

    public void setpIdNum(String pIdNum) {
        this.pIdNum = pIdNum == null ? null : pIdNum.trim();
    }
}