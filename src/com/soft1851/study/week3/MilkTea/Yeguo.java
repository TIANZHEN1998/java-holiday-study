package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName Yeguo
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class Yeguo extends MilkTeaMaterial {
    public Yeguo(BuyMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public float getTotalPrice(){
        return  super.getTotalPrice() + 2;
    }
    @Override
    public String useMaterial(){
        return  super.useMaterial()+"(备注:加椰果)";
    }
}