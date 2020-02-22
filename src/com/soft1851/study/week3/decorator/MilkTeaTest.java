package com.soft1851.study.week3.decorator;

/**
 * @ClassName MilkTeaTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/21
 **/
public class MilkTeaTest {
    public static void main(String[] args) {
        MilkTea milkTea1=new MilkDecorator(new AnotherMilkTea1());
        milkTea1.buy("一杯原味奶茶");
        MilkTea milkTea2=new MilkDecorator(new AnotherMilkTea2());
        milkTea2.buy("一杯加波霸珍珠奶茶");
    }
}