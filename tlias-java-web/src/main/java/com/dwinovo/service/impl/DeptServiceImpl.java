package com.dwinovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwinovo.mapper.DeptMapper;
import com.dwinovo.pojo.Dept;
import com.dwinovo.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

}
