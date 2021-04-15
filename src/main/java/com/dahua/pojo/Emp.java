package com.dahua.pojo;

import org.springframework.stereotype.Component;

@Component
public class Emp {

    private int id;
    private int did;
    private String ename;
    private String job;
    private int salary;
    private String isdel;
    private Dept dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(int id, int did, String ename, String job, int salary, String isdel, Dept dept) {
        this.id = id;
        this.did = did;
        this.ename = ename;
        this.job = job;
        this.salary = salary;
        this.isdel = isdel;
        this.dept = dept;
    }

    public Emp() {
    }
}
