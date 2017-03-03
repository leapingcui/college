package com.qijun.teachmanage.choosecourse.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/3/2.
 */
public class Classes {
    private String claId;
    private String claName;
    private int claNum;

    public Classes(){}

    public Classes(String claId, String claName, int claNum) {
        this.claId = claId;
        this.claName = claName;
        this.claNum = claNum;
    }

    public String getClaId() {
        return claId;
    }

    public void setClaId(String claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public int getClaNum() {
        return claNum;
    }

    public void setClaNum(int claNum) {
        this.claNum = claNum;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "claId='" + claId + '\'' +
                ", claName='" + claName + '\'' +
                ", claNum=" + claNum +
                '}';
    }
}
