package com.dwinovo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dwinovo.pojo.Dept;
import com.dwinovo.pojo.Result;
import com.dwinovo.service.DeptService;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    // @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list()
    {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
}
