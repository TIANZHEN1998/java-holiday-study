package com.soft1851.study.week3.Observer;

/**
 * @ClassName Idol
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/22
 **/
public interface Idol {
    void  addFan(Fan fan);
    void  deleteFan(Fan fan);
    void  notify(String message);
}
