package com.soft1851.study.week1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

/**
 * @ClassName RandomTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/1/13
 **/
public class RandomTest {
    public static void main(String[] args) {
        final int number = 100;
        Random random = new Random();
        String[] text = new String[100];
        int content;
        for (int i = 0;i<number;i++){
            content = random.nextInt(number);
            text[i] = content+"\n";
        }
        File file = new File("D:/java-holiday-study/randomText.txt");
        try {
            if (!file.exists()){
                boolean exist = file.createNewFile();
                if (exist){
                    System.out.println("自动创建该文件！");
                }
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : text) {
                bufferedWriter.write(s);
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e){
            System.out.println("写入失败");
        }
    }
}