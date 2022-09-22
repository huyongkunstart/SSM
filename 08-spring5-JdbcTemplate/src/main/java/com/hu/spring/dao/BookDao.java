package com.hu.spring.dao;

import com.hu.spring.entity.Book;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName BookDao
 * @create 2022-08-11 21:57
 * @Version 1.0
 * @description: TODO
 */
public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book selectone(String id);

    List<Book> selectall();

    void insertallbook(List<Object[]> list);

    void batchchange(List<Object[]> list);
}
