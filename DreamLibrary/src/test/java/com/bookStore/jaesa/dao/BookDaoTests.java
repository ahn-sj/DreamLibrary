package com.bookStore.jaesa.dao;

import com.bookStore.jaesa.domain.Book;
import com.bookStore.jaesa.domain.User;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BookDaoTests {

    @Autowired
    BookDao bookDao;

    @Test
    public void selectOneBookTest() throws Exception {
        Book book = bookDao.selectOneBook(1);

        System.out.println("========");
        System.out.println("book = " + book);
        System.out.println("========");
    }

    @Test
    public void selectAllBookTest() throws Exception {
        List<Book> book = bookDao.selectAllBook();

        System.out.println("========");
        System.out.println("book.size() = " + book.size());
        System.out.println("========");
    }

    @Test
    public void selectAllBooksCntTest() throws Exception {

        int rowCnt = bookDao.selectAllBooksCnt();

        log.info("=========");
        log.info(rowCnt);
        log.info("=========");
    }

    @Test
    public void insertBookTest() throws Exception {

        int rowCnt = 0;

        for(int i = 1; i <= 20; i++) {
            Book book = new Book("daoTestTitle" + i, "daoTestContent" + i, "daoTester");

            rowCnt += bookDao.insertBook(book);
        }

        log.info("=========");
        log.info(rowCnt);
        log.info("=========");
    }

    @Test
    public void deleteBookTest() throws Exception {
        int rowCnt = bookDao.deleteBook(4);

        log.info("=========");
        log.info(rowCnt);
        log.info("=========");
    }

    @Test
    public void updateBookTest() throws Exception {
        Book book = new Book("UpdateTitle", "UpdateContent", "daoTester");
        book.setBno(3);

        int rowCnt = bookDao.updateBook(book);

        log.info("=========");
        log.info(rowCnt);

        Book book2 = bookDao.selectOneBook(3);
        System.out.println("book = " + book);
        log.info("=========");
    }
}
