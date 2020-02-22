package com.soft1851.study.week3.Observer;

import java.util.ArrayList;

/**
 * @ClassName ConCreateIdol
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/22
 **/
public class ConCreateIdol implements  Idol {
    private ArrayList<Fan> fans;
    public ConCreateIdol(){
        this.fans=new ArrayList<Fan>();
    }
    @Override
    public void addFan(Fan fan) {
        fans.add(fan);
    }

    @Override
    public void deleteFan(Fan fan) {
           fans.remove(fan);
    }

    @Override
    public void notify(String message) {
        for (Fan fan:fans
             ) {
            fan.update(message);
        }
    }
}