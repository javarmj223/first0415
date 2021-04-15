package com.dahua.mapper;

import com.dahua.pojo.Emp;

import java.util.List;

public interface Empmapper {

    public List<Emp> listemps();

    public void addEmp(String name, String job,String salary);

}
