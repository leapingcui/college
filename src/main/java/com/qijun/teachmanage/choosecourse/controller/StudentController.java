package com.qijun.teachmanage.choosecourse.controller;

import com.qijun.teachmanage.choosecourse.entity.Student;
import com.qijun.teachmanage.choosecourse.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
@Controller
@RequestMapping("/studentController")
public class StudentController {

//    导包别导错喽org.apache.log4j.Logger
    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/showAllStudents.do")
    public String showAllStudents(Model model) {
        List<Student> students = this.studentService.selectAll();
        model.addAttribute("students", students);
        return "mainFrame";
    }

    @RequestMapping("/insertStudentUI.do")
    public String insertStudentUI(){
        return "teachmanage/choosecourse/insertStudent";
    }

    @RequestMapping("/insertStudent.do")
    public String insertStudent(Student student) throws ParseException {

        int num = studentService.insert(student);
        logger.info("新增影响的行数#############啊啊啊啊啊:"+num);
        return "forward:showAllStudents.do";
    }

    @RequestMapping("/detailedStudent.do")
    public String detailedStudent(Model model, int stuId){
        Student student = studentService.selectByPrimaryKey(stuId);
        model.addAttribute("student", student);
        return "teachmanage/choosecourse/detailedStudent";
    }

    @RequestMapping("/updateStudentUI.do")
    public String updateStudentUI(Model model, int stuId){
        logger.info("接收到的学号参数:" + stuId);
        Student student = studentService.selectByPrimaryKey(stuId);
        model.addAttribute("student", student);
        return "teachmanage/choosecourse/updateStudent";
    }

    @RequestMapping("/updateStudent.do")
    public String updateStudent(Student student){
        logger.info("接收到的学生" + student);
        studentService.update(student);
        return "forward:showAllStudents.do";
    }

    @RequestMapping("/deleteStudent.do")
    public String deleteStudent(int stuId){
        studentService.deleteByPrimaryKey(stuId);
        return "forward:showAllStudents.do";
    }

}
