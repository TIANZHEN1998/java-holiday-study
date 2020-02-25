package com.soft1851.study.week4;

/**
 * @ClassName BuilderPattern
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/25
 **/
public class BuilderPattern {
    public static void main(String[] args) {
        Student student=Student.builder().name("田震").age(23).gender("男").build();

        System.out.println(student);
    }
}