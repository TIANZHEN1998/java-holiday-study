package com.soft1851.study.week1;

import java.io.*;
import java.util.UUID;

/**
 * @ClassName RandomTest
 * @Description 实现文件的拷贝
 * @Author 田震
 * @Date 2020/1/14
 **/
public class RandomCopyTest {
    public static void main(String[] args) {
        final String choose = "txt";
        File startFile = new File("D:/java-holiday-study/1.png");
        String startFileName = startFile.getName();
        String start = startFile.getPath();
        int position = startFileName.indexOf(".");
        System.out.println(start);
        //取得文件扩展名
        String suffixName = startFileName.substring(position+1);
        try {
            if (suffixName.equals(choose)){
                BufferedReader br = new BufferedReader(new FileReader(start));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:/java-holiday-study/randomTextCopy2"+"."+suffixName));
                String line;
                while ((line = br.readLine())!=null){
                    bw.write(line);
                }
                bw.close();
                br.close();
            } else{
                BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(start));
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("D:/java" +
                        "-holiday-study/1(1)"+"."+suffixName));
                int len;
                while ((len = fileInputStream.read())!=-1){
                    fileOutputStream.write(len);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }
            System.out.println("拷贝成功");
        } catch (IOException e){
            System.out.println("拷贝失败");
        }
    }

}
