package com.soft1851.study.week3.MilkTea;

import com.soft1851.study.week3.MilkTea.BuyMilkTea;

/**
 * @ClassName Tea
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class MilkTea1 implements BuyMilkTea {
    @Override
    public float getTotalPrice() {
        return 12;
    }

    @Override
    public String useMaterial() {
        return "一点点原味奶茶";
    }
}