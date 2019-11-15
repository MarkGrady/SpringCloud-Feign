package com.qf.cloud031_provider.mapper;

import com.qf.cloud031.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> findAll();
    public Dept findOne(int deptno);
    public Dept saveDept(Dept dept);
    public Dept updateDept(Dept dept);
    public Boolean deleteDept(int deptno);
}