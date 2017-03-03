package com.qijun.teachmanage.choosecourse.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Student {
    private int stuId;
    private String stuName;
    private String stuSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirth;

    private Classes classes;

    public Student(){}

    public Student(int stuId, String stuName, String stuSex, Date stuBirth, Classes classes) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuBirth = stuBirth;
        this.classes = classes;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(Date stuBirth) {
        this.stuBirth = stuBirth;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirth=" + stuBirth +
                ", classes=" + classes +
                '}';
    }
}
