package com.qf.cloud031_consumer_feign.controller;

import com.qf.cloud031.pojo.Dept;
import com.qf.cloud031_consumer_feign.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept1",method = RequestMethod.GET)
    public String findAll(Model model) {
        List<Dept> depts = deptService.findAll();
        model.addAttribute("depts",depts);
        return "dept";
    }
    @RequestMapping(value = "/dept2",method = RequestMethod.GET)
    public String findOne( int deptno,Model model){
        Dept one = deptService.findOne(deptno);
        model.addAttribute("one",one);
        return "dept1";
    }

    @RequestMapping(value = "/dept3",method = RequestMethod.POST)
    public String saveDept(Dept dept,Model model){
        Dept dept1 = deptService.saveDept(dept);
        model.addAttribute("dept1",dept1);
        return "save";
    }
    @RequestMapping(value = "/dept4",method = RequestMethod.PUT)
    public String updateDept(Dept dept,Model model){
        Dept dept2 = deptService.updateDept(dept);
        model.addAttribute("dept2",dept2);
        return "update";
    }
    @RequestMapping(value = "/dept5",method = RequestMethod.DELETE)
    public String deleteDept(int deptno,Model model){
        deptService.deleteDept(deptno);
        return "del";
    }
}
