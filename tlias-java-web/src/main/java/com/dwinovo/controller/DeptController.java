package com.dwinovo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dwinovo.pojo.Dept;
import com.dwinovo.pojo.Result;
import com.dwinovo.service.DeptService;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    // @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping
    public Result list()
    {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
    /**
     * 删除部门的方法
     */
    @DeleteMapping
    public Result delete(Integer id){
        System.out.println("根据ID删除部门: " + id);
        deptService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增部门
     */
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        System.out.println("新增部门： " + dept);
        deptService.add(dept);
        return Result.success();
    }
    /**
     * 根据ID查询部门
     */
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        System.out.println("根据ID查询部门： " + id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }
    /**
     * 根据ID修改部门
     */
    @PutMapping
    public Result updateInfo(@RequestBody Dept dept){
        System.out.println("修改部门： " + dept);
        deptService.update(dept);
        return Result.success();
    }
}
