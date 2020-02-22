package com.soft1851.study.week3.book;

import com.soft1851.study.week3.book.CheckBookImpl;

/**
 * @ClassName CheckBookTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/18
 **/
public class CheckBookTest{
    public static void main(String[] args) {
        CheckBookImpl cb=new CheckBookImpl();
        cb.check("1595626650501","《不在说再见》",75);
        cb.check("159562665","《暴力拳击》",109);
        cb.check("1595626650501","《暴力》",150);
        cb.check("1595626650501","《恐怖小说》",25);
        cb.check("1595626650501","《你在想什么》",109);
    }
}