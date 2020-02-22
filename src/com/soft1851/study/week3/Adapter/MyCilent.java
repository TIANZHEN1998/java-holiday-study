package com.soft1851.study.week3.Adapter;

/**
 * @ClassName MyCilent
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/20
 **/
public class MyCilent extends  MyAdapter {
    @Override
    public void methodA(String param){
        System.out.println(param);
    }
    @Override
    public  void  methodD(){
        System.out.println("无参数方法");
    }
}