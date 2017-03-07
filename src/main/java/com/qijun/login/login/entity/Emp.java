package com.qijun.login.login.entity;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Emp {
    private String empId;
    private String empPwd;
    private String empName;
    private String empSex;

    public Emp(){}

    public Emp(String empId, String empPwd, String empName, String empSex) {
        this.empId = empId;
        this.empPwd = empPwd;
        this.empName = empName;
        this.empSex = empSex;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId='" + empId + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                '}';
    }
}
