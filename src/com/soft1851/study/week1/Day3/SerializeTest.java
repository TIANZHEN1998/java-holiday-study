package com.soft1851.study.week1.Day3;

import java.io.*;

/**
 * @ClassName SerializeTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/1/15
 **/
public class SerializeTest {
    public static void main(String[] args) throws IOException {
        serialize();
        Student s = (Student) deserialize();
        System.out.println("姓名：" + s.getName() + "\n年龄：" + s.getAge() + "\n性别：" + s.getSex() + "\n地址：" + s.getAddress() + "\n手机：" + s.getPhone());
    }

    public static Object deserialize() throws IOException {
        Student s = new Student();
        File f = new File("D://java-holiday-study/student.out");
        InputStream is = new FileInputStream(f);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            s = (Student) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        is.close();
        ois.close();
        return s;
    }

    public static void serialize() {
        Student s = new Student();
        s.setName("田震");
        s.setAge(20);
        s.setSex("男");
        s.setAddress("山西吕梁");
        s.setPhone("19850099292");
        OutputStream os = null;
        ObjectOutputStream oos = null;
        File f = new File("D://java-holiday-study/student.out");
        try {
            os = new FileOutputStream(f);
            oos = new ObjectOutputStream(os);
            oos.writeObject(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null)
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}