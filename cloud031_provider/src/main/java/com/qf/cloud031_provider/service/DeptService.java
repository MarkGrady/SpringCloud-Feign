package com.qf.cloud031_provider.service;


import com.qf.cloud031.pojo.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> findAll();
    public Dept findOne(int deptno);
    public Dept saveDept(Dept dept);
    public Dept updateDept(Dept dept);
    public Boolean deleteDept(int deptno);
}
