package com.soft1851.study.week3.Proxy;

/**
 * @ClassName UserDaoProxy
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/20
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("数据已经保存");
    }
}