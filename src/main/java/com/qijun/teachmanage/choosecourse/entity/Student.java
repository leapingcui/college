package com.qijun.teachmanage.choosecourse.entity;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Student {
    private int stuId;
    private String stuName;
    private String stuSex;

    public Student(){}

    public Student(int stuId, String stuName, String stuSex) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
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

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
