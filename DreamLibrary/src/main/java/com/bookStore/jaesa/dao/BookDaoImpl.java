package com.bookStore.jaesa.dao;

import com.bookStore.jaesa.domain.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    private final String namespace = "com.bookStore.jaesa.dao.BookDao.";

    @Autowired
    SqlSession session;

    @Override
    public Book selectOneBook(Integer bno) throws Exception {
        return session.selectOne(namespace + "selectOneBook", bno);
    }

    @Override
    public List<Book> selectAllBook() throws Exception {
        return session.selectList(namespace + "selectAllBook");
    }

    @Override
    public Integer selectAllBooksCnt() throws Exception {
        return session.selectOne(namespace + "selectAllBooksCnt");
    }

    @Override
    public Integer insertBook(Book book) throws Exception {
        return session.insert(namespace + "insertBook", book);
    }

    @Override
    public Integer deleteBook(Integer bno) throws Exception {
        return session.delete(namespace + "deleteBook", bno);
    }

    @Override
    public Integer updateBook(Book book) throws Exception {
        return session.update(namespace + "updateBook", book);
    }

}
