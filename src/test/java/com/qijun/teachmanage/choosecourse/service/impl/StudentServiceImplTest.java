package com.qijun.teachmanage.choosecourse.service.impl;

import com.qijun.teachmanage.choosecourse.BaseTest;
import com.qijun.teachmanage.choosecourse.entity.Student;
import com.qijun.teachmanage.choosecourse.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class StudentServiceImplTest extends BaseTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testSelectAll() {
        List<Student> students = studentService.selectAll();
        for (Student student:students) {
            System.out.println(student);
        }
    }

    @Test
    public void testSelectByPrimaryKey() {
        Student student = studentService.selectByPrimaryKey(101);
        System.out.println(student);
    }

    @Test
    public void testInsert(){
        Student student = new Student();
        student.setStuId(109);
        student.setStuName("崔九");
        student.setStuSex("女");

        int count = studentService.insert(student);
        System.out.println(count);
    }

    @Test
    public void testUpdate(){
        Student student = new Student();
        student.setStuId(105);
        student.setStuName("崔五五");
        student.setStuSex("女");

        int count = studentService.update(student);
        System.out.println(count);
    }

    @Test
    public void testDeleteByPrimaryKey(){
        int count = studentService.deleteByPrimaryKey(105);
        System.out.println(count);
    }


}
