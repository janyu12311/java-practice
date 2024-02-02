package com.itheima.ui;

import java.io.Serializable;

public class Date implements Serializable {
    String Number;
    String title;
    String bodyNumber;

    public Date() {
    }

    public Date(String Number, String title, String bodyNumber) {
        this.Number = Number;
        this.title = title;
        this.bodyNumber = bodyNumber;
    }

    /**
     * 获取
     * @return Number
     */
    public String getNumber() {
        return Number;
    }

    /**
     * 设置
     * @param Number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return bodyNumber
     */
    public String getBodyNumber() {
        return bodyNumber;
    }

    /**
     * 设置
     * @param bodyNumber
     */
    public void setBodyNumber(String bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    public String toString() {
        return "Date{Number = " + Number + ", title = " + title + ", bodyNumber = " + bodyNumber + "}";
    }
}
