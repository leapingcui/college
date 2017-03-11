package com.qijun.login.login.service.impl;

import com.qijun.login.login.entity.Emp;
import com.qijun.login.login.exception.LoginException;
import com.qijun.login.login.mapper.EmpMapper;
import com.qijun.login.login.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public Emp login(Emp empFromForm) throws LoginException {
        Emp emp = empMapper.selectByPrimaryKey(empFromForm.getEmpId());
        if (emp == null) {
            throw new LoginException("员工id不存在");
        }
        if (!empFromForm.getEmpPwd().equals(emp.getEmpPwd())) {
            throw new LoginException("密码错误");
        }
        return emp;
    }

    public List<Emp> selectAll() {
        return empMapper.selectAll();
    }

    public Emp selectByPrimaryKey(String empId) {
        return empMapper.selectByPrimaryKey(empId);
    }

    public int insert(Emp emp) {
        return empMapper.insert(emp);
    }

    public int update(Emp emp) {
        return empMapper.update(emp);
    }

    public int deleteByPrimaryKey(String empId) {
        return empMapper.deleteByPrimaryKey(empId);
    }
}
