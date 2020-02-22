package com.soft1851.study.week3.Proxy;

/**
 * @ClassName UserDaoProxy
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/20
 **/
public class UserDaoProxy implements UserDao {
    private UserDao target;
    public  UserDaoProxy(UserDao target){
        this.target=target;
    }
    @Override
    public void save() {
        System.out.println("开始事务..");
        target.save();
        System.out.println("提交事务...");
    }
}