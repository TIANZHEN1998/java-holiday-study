package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName DrinkTeaTest
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class BuyMilkTeaTest {
    public static void main(String[] args) {
        //原味
        BuyMilkTea buyMilkTea = new MilkTea1();
        System.out.println(buyMilkTea.useMaterial()+"总价格为："+ buyMilkTea.getTotalPrice());

//        //加波霸
//        drinkMilkTea =  new Boba(drinkMilkTea);
//        System.out.println(drinkMilkTea.useMaterial()+"总价格为：" +drinkMilkTea.getTotalPrice());
//
//        //加椰果
//        drinkMilkTea = new Yeguo(drinkMilkTea);
//        System.out.println(drinkMilkTea.useMaterial()+"总价格为：" +drinkMilkTea.getTotalPrice());
//
//        //加热
//        drinkMilkTea=  new Hot(drinkMilkTea);
//        System.out.println(drinkMilkTea.useMaterial()+"总价格为：" +drinkMilkTea.getTotalPrice());

        //去冰
        buyMilkTea = new Sugar(buyMilkTea);
        System.out.println(buyMilkTea.useMaterial()+"总价格为：" + buyMilkTea.getTotalPrice());
    }
}