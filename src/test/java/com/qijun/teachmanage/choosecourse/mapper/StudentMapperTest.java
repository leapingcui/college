package com.qijun.teachmanage.choosecourse.mapper;

import com.qijun.teachmanage.choosecourse.BaseTest;
import com.qijun.teachmanage.choosecourse.entity.Classes;
import com.qijun.teachmanage.choosecourse.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class StudentMapperTest extends BaseTest{

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelectAll() throws Exception {
        List<Student> students = studentMapper.selectAll();
        for (Student student:students) {
            System.out.println(student);
        }
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        int stuId = 101;
        Student student = studentMapper.selectByPrimaryKey(stuId);
        System.out.println(student);
    }

    @Test
    public void testInsert() throws Exception {
        Student student = new Student();
        student.setStuId(111);
        student.setStuName("崔十一");
        student.setStuSex("女");
        student.setStuBirth(new Date());

        Classes classes = new Classes();
        classes.setClaId("2");
        student.setClasses(classes);

        int count = studentMapper.insert(student);
        System.out.println(count);
    }

    @Test
    public void testUpdate() throws Exception {
        Student student = new Student();
        student.setStuId(104);
        student.setStuName("崔四四");
        student.setStuSex("女");
        student.setStuBirth(new Date());

        Classes classes = new Classes();
        classes.setClaId("2");
        student.setClasses(classes);

        student.setClasses(classes);

        int count = studentMapper.update(student);
        System.out.println(count);
    }

    @Test
    public void testDdeleteByPrimaryKey() throws Exception {
        int count = studentMapper.deleteByPrimaryKey(112);
        System.out.println(count);
    }

}
