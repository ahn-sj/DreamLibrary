package com.bookStore.jaesa.dao;

import com.bookStore.jaesa.domain.Book;

import java.util.List;

public interface BookDao {

    // 하나의 책을 검색
    Book selectOneBook(Integer bno) throws Exception;

    // 모든 책을 검색
    List<Book> selectAllBook() throws Exception;

    // 모든 책의 수 검색
    Integer selectAllBooksCnt() throws Exception;

    // 책 추가
    Integer insertBook(Book book) throws Exception;

    // 책 삭제
    Integer deleteBook(Integer bno) throws Exception;

    // 책 수정
    Integer updateBook(Book book) throws Exception;


}
