package com.qf.cloud031_provider.service.impl;

import com.qf.cloud031.pojo.Dept;
import com.qf.cloud031_provider.mapper.DeptMapper;
import com.qf.cloud031_provider.service.DeptService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    Logger lg= LogManager.getFormatterLogger(DeptServiceImpl.class);
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public Dept findOne(int deptno) {
        Dept dept = deptMapper.findOne(deptno);
        lg.info("----------"+dept);
        return dept;
    }

    @Override
    public Dept saveDept(Dept dept) {
        return deptMapper.saveDept(dept);
    }

    @Override
    public Dept updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }

    @Override
    public Boolean deleteDept(int deptno) {
        Boolean dept = deptMapper.deleteDept(deptno);
        return dept;
    }
}
