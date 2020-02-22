package com.soft1851.study.week3.Proxy;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/20
 **/
public class UserDaoTest {
    public static void main(String[] args) {
        UserDao target=new UserDaoImpl();
        target.save();
        System.out.println("*****************");
        UserDao proxy =new UserDaoProxy(target);
        proxy.save();
    }
}