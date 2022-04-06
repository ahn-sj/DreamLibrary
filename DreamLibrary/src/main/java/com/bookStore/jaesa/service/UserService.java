package com.bookStore.jaesa.service;

import com.bookStore.jaesa.domain.User;

import java.util.List;

public interface UserService {
    User getUser(Integer uno) throws Exception;

    List<User> getUserList() throws Exception;

    Integer getBooksCnt() throws Exception;

    Integer writeUser(User user) throws Exception;

    Integer removeUser(Integer uno) throws Exception;
}
