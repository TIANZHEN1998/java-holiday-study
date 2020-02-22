package com.soft1851.study.week3.decorator;

/**
 * @ClassName BuyMilkTea2
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/21
 **/
public class AnotherMilkTea2 implements  MilkTea {
    @Override
    public void buy(String something) {
        System.out.println("14元的"+something);
    }
}