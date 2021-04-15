package com.dahua.service;

import com.dahua.mapper.Empmapper;
import com.dahua.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpImp implements EmpService{

    @Autowired
    private Empmapper empmapper;

    @Override
    public List<Emp> listemps() {
//        empmapper.listemps();
        return empmapper.listemps();
    }
}
