package com.dahua.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dept {
    private int did;
    private String ename;

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
}
