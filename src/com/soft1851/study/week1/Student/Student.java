package com.soft1851.study.week1.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Student
 * @Description 1.使用new关键值创建对象
 * @Author 田震
 * @Date 2020/1/18
 **/
public class Student {
    private String name;
    private String pass;


    public static void main(String[] args) {
        /**
         *使用new关键值创建对象
         */
        Student student = new Student();
        student.setName("tianzhen");
        student.setPass("123456");
        System.out.println(student.getName()+student.getPass());

        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public Student newInstance() {
        return null;
    }
}