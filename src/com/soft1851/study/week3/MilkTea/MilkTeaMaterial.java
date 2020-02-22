package com.soft1851.study.week3.MilkTea;

/**
 * @ClassName MilkTeaMaterial
 * @Description TODO
 * @Author YangJinG
 * @Date 2020/2/21
 **/
public class MilkTeaMaterial implements BuyMilkTea {
    public BuyMilkTea buyMilkTea;

    public MilkTeaMaterial(BuyMilkTea milkTea){
        this.buyMilkTea = milkTea;
    }
    @Override
    public float getTotalPrice() {
        return buyMilkTea.getTotalPrice();
    }

    @Override
    public String useMaterial() {
        return buyMilkTea.useMaterial();
    }
}