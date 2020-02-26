package com.soft1851.study.week4.factory;

/**
 * @ClassName FactoryTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/26
 **/
public class FactoryTest {
    public static void main(String[] args) {
        ComputerFactory.createComputer("Hp").start();
        ComputerFactory.createComputer("Lenovo").start();
    }
}