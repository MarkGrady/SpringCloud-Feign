package com.qf.cloud031_provider.controller;

import com.qf.cloud031.pojo.Dept;
import com.qf.cloud031_provider.service.DeptService;
import com.qf.cloud031_provider.service.impl.DeptServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    Logger lg= LogManager.getFormatterLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/deptAll",method = RequestMethod.GET)
    public List<Dept> findAll(){
        List<Dept> depts = deptService.findAll();
        return depts;
    }
    @RequestMapping(value = "/deptOne",method = RequestMethod.GET)
    public Dept findOne( int deptno){
        Dept one = deptService.findOne(deptno);
        lg.info("==================="+one);
        return one;
    }

    @RequestMapping(value = "/deptSave",method = RequestMethod.POST)
    public Dept saveDept(Dept dept){
        Dept dept1 = deptService.saveDept(dept);
        return dept1;
    }

    @RequestMapping(value = "/deptUp",method = RequestMethod.PUT)

    public Dept updateDept(Dept dept){
        Dept dept2 = deptService.updateDept(dept);
        return dept2;
    }
    @RequestMapping(value = "/deptDe",method = RequestMethod.DELETE)

    public Boolean deleteDept(int deptno){
        Boolean deleteDept = deptService.deleteDept(deptno);
        return deleteDept;
    }
}
