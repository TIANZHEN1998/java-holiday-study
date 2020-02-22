package com.soft1851.study.week3.decorator;

import java.util.Calendar;

/**
 * @ClassName MilkDecorator
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/21
 **/
public class MilkDecorator implements  MilkTea {
    private MilkTea dercortarMilk;
    public MilkDecorator(MilkTea dercortarMilk){
        this.dercortarMilk=dercortarMilk;

    }
    @Override
    public void buy(String something) {
        dercortarMilk.buy(something);
//        buyTime();
    }
//    public  void  buyTime(){
//        System.out.println(Calendar.getInstance().getTime());
//    }
}