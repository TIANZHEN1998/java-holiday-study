package com.soft1851.study.week3.book;

/**
 * @ClassName CheckBookImpl
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/18
 **/
public class CheckBookImpl implements CheckBook {
    @Override
    public void check(String ISBN, String bookName, double price) {
        int length = 13,price1 =100;
        String text1 = "暴力",text2="恐怖";
        try {
            if (ISBN.length()!=length){
                throw new ISBNException(bookName+"ISBN编码长度不是13位");
            }
            if (bookName.contains(text1)||bookName.contains(text2)){
                throw  new BookNameException(bookName+"书名含有敏感词汇”暴力+”恐怖“");
            }
            if (price>price1){
                throw new PriceException(bookName+"价格高过100");
            }
            System.out.println(bookName+"书籍上架成功");
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}