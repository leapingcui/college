package com.qijun.teachmanage.choosecourse.entity;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Student {
    private int stuId;
    private String stuName;
    private String stuSex;

    private Classes classes;

    public Student(){}

    public Student(int stuId, String stuName, String stuSex, Classes classes) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
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
                ", classes=" + classes +
                '}';
    }
}
