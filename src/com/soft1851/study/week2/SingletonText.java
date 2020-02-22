package com.soft1851.study.week2;

/**
 * @ClassName SingletonText
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/16
 **/
public class SingletonText {
    public static void main(String[] args) {
        Singleton s1=Singleton.getSingletonInstance();
        Singleton s2=Singleton.getSingletonInstance();
        System.out.println(s1==s2);
    }
}