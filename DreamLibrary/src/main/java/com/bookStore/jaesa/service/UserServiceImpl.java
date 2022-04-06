package com.bookStore.jaesa.service;

import com.bookStore.jaesa.dao.UserDao;
import com.bookStore.jaesa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUser(Integer uno) throws Exception {
        return userDao.selectOneUser(uno);
    }

    @Override
    public List<User> getUserList() throws Exception {
        return userDao.selectAllUser();
    }

    @Override
    public Integer getBooksCnt() throws Exception {
        return userDao.selectAllUsersCnt();
    }

    @Override
    public Integer writeUser(User user) throws Exception {
        return userDao.insertUser(user);
    }

    @Override
    public Integer removeUser(Integer uno) throws Exception {
        return userDao.deleteUser(uno);
    }
}
