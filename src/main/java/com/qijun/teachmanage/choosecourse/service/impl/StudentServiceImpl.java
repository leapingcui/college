package com.qijun.teachmanage.choosecourse.service.impl;

import com.qijun.teachmanage.choosecourse.entity.Student;
import com.qijun.teachmanage.choosecourse.mapper.StudentMapper;
import com.qijun.teachmanage.choosecourse.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Test
    public Student selectByPrimaryKey(int stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }

    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public int deleteByPrimaryKey(int stuId) {
        return studentMapper.deleteByPrimaryKey(stuId);
    }
}
