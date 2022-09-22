package com.hu.spring.service;

import com.hu.spring.dao.BookDao;
import com.hu.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName BookDaoService
 * @create 2022-08-11 21:57
 * @Version 1.0
 * @description: TODO
 */
@Service
public class BookDaoService {
    //注入dao
    @Autowired
    private BookDao bookDao;


    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改方法
    public void updateBook(Book book){
        bookDao.update(book);
    }
    //删除方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }
    //查询表记录数
    public int findcount(){
        return bookDao.selectCount();
    }

    //查询表记录数（一条记录）
    public Book findone(String id){
        return bookDao.selectone(id);
    }

    //查询所有的记录
    public List<Book> findall(){
        return bookDao.selectall();
    }

    //批量添加功能
    public void batchAdd(List<Object[]> list){
        bookDao.insertallbook(list);
    }
    //批量修改功能
    public void batchipdate(List<Object[]> list){
        bookDao.batchchange(list);
    }

}
