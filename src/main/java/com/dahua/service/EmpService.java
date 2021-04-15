package com.dahua.service;

import com.dahua.pojo.Emp;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface EmpService {

    public List<Emp> listemps();

}
