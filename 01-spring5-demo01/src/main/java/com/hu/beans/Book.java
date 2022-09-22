package com.hu.beans;

/**
 * @author huyongkun
 * @ClassName Book
 * @create 2022-08-09 11:14
 * @Version 1.0
 * @description: TODO
 */
public class Book {
    private String BanName;
    private String BanAuthor;

    public Book() {
    }

    public void setBanName(String banName) {
        BanName = banName;
    }

    public void setBanAuthor(String banAuthor) {
        BanAuthor = banAuthor;
    }
    @Override
    public String toString() {
        return "Book{" +
                "BanName='" + BanName + '\'' +
                ", BanAuthor='" + BanAuthor + '\'' +
                '}';
    }
}
