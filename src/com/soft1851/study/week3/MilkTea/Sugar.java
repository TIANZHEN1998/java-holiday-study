package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName Clod
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class Sugar extends MilkTeaMaterial {
    public Sugar(BuyMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public float getTotalPrice(){
        return  super.getTotalPrice()  ;
    }
    @Override
    public String useMaterial(){
        return  super.useMaterial()+"（备注：加糖）";
    }
}