package com.soft1851.study.week3.Observer;

/**
 * @ClassName FanTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/22
 **/
public class FanTest {
    public static void main(String[] args) {
        ConCreateIdol conCreateIdol=new ConCreateIdol();
        ConCreateFan whl =new ConCreateFan("王欢乐");
        ConCreateFan tz =new ConCreateFan("田震");
        ConCreateFan hyj =new ConCreateFan("侯粤嘉");
        conCreateIdol.addFan(whl);
        conCreateIdol.addFan(tz);
        conCreateIdol.addFan(hyj);
        conCreateIdol.notify("---武汉加油！中国加油！");
    }
}