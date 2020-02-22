package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName Padding
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class Boba extends MilkTeaMaterial {
    public Boba(BuyMilkTea milkTea){
        super(milkTea);
    }
    @Override
    public float getTotalPrice(){
        return  super.getTotalPrice() + 2 ;
    }
    @Override
    public String useMaterial(){
        return  super.useMaterial()+"（备注：加波霸）";
    }
}