package com.soft1851.study.week3.book;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/18
 **/
public class Book {
    private  String ISBN;
    private  String bookName;
    private double price;
    public  Book(){
    }
    public Book(String ISBN, String bookName, double price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}