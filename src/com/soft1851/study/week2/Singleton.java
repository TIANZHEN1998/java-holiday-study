package com.soft1851.study.week2;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/16
 **/
public class Singleton {
    private  static  Singleton singleton=null;
    private  Singleton(){

    }
    public  static  Singleton getSingletonInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return  singleton;
    }

}