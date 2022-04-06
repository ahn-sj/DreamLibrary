package com.bookStore.jaesa.service;

import com.bookStore.jaesa.dao.BookDao;
import com.bookStore.jaesa.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Book getBook(Integer bno) throws Exception {
        return bookDao.selectOneBook(bno);
    }

    @Override
    public List<Book> getBookList() throws Exception {
        return bookDao.selectAllBook();
    }

    @Override
    public Integer getBooksCnt() throws Exception {
        return bookDao.selectAllBooksCnt();
    }

    @Override
    public Integer writeBook(Book book) throws Exception {
        return bookDao.insertBook(book);
    }

    @Override
    public Integer removeBook(Integer bno) throws Exception{
        return bookDao.deleteBook(bno);
    }

    @Override
    public Integer modifyBook(Book book) throws Exception{
        return bookDao.updateBook(book);
    }

}
