package com.soft1851.study.week1.Student;

import java.io.*;

/**
 * @ClassName Student4
 * @Description 反序列化
 * @Author 田震
 * @Date 2020/1/18
 **/
public class Student4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 先序列化
        Student student= new Student();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Student.java"));
        os.writeObject(student);
        // 再反序列化
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("Student.java"));
        Object o = is.readObject();
        System.out.println(o);
    }
}