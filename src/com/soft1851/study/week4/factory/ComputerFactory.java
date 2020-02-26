package com.soft1851.study.week4.factory;

/**
 * @ClassName ComputerFactory
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/26
 **/
public class ComputerFactory {
    public  static  Computer createComputer(String type){
        Computer computer=null;
        switch (type){
            case  "Lenovo" :
                computer =new LenovoComputer();
                break;
            case  "Hp":
                computer=new HpComputer();
                break;
            case  "Asus":
                computer=new AsusComputer();
                break;
        }
        return computer;
    }
}