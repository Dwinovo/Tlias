package com.dwinovo.service;

import java.util.List;

import com.dwinovo.pojo.Dept;

public interface DeptService {

    List<Dept> findAll();

    /**
     * 根据id删除部门
     */
    void deleteById(Integer id);

    /**
     * 新增部门
     */
    void add(Dept dept);

    /**
     * 根据ID查询部门
     */
    Dept getById(Integer id);

    /**
     * 修改部门信息
     */
    void update(Dept dept);
}
