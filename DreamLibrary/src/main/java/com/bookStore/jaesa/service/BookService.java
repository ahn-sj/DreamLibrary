package com.bookStore.jaesa.service;

import com.bookStore.jaesa.domain.Book;

import java.util.List;

public interface BookService {
    Book getBook(Integer bno) throws Exception;

    List<Book> getBookList() throws Exception;

    Integer getBooksCnt() throws Exception;

    Integer writeBook(Book book) throws Exception;

    Integer removeBook(Integer bno) throws Exception;

    Integer modifyBook(Book book) throws Exception;
}
