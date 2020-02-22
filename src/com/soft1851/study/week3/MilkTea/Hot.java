package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName Hot
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class Hot extends  MilkTeaMaterial {
    public Hot(BuyMilkTea milkTea) {
        super(milkTea);
    }
    @Override
    public float getTotalPrice(){
        return  super.getTotalPrice() ;
    }
    @Override
    public String useMaterial(){
        return  super.useMaterial()+"（备注：加热）";
    }
}