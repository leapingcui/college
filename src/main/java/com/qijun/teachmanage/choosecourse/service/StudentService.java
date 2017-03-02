package com.qijun.teachmanage.choosecourse.service;

import com.qijun.teachmanage.choosecourse.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface StudentService {

    List<Student> selectAll();

    Student selectByPrimaryKey(int stuId);

    int insert(Student student);

    int update(Student student);

    int deleteByPrimaryKey(int stuId);

}
