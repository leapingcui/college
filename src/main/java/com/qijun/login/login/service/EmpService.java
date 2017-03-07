package com.qijun.login.login.service;

import com.qijun.login.login.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
public interface EmpService {
    List<Emp> selectAll();

    Emp selectByPrimaryKey(String empId);

    int insert(Emp emp);

    int update(Emp emp);

    int deleteByPrimaryKey(String empId);



}
