package com.soft1851.study.week3;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

/**
 * @ClassName Tim1
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/17
 **/
public class Tim1 {
    public static void main(String[] args) {
        System.out.println(setDate(2020, 2, 17, 0, 0, 0));
    }

    public static String setDate(int year, int month, int day, int hour, int min, int second) {
        Calendar c1 = Calendar.getInstance();
        c1.set(year, month - 1, day, hour, min, second);
        c1.add(Calendar.HOUR_OF_DAY, 1);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c1.getTime());
    }
}