package com.bookStore.jaesa.dao;

import com.bookStore.jaesa.domain.User;

public interface UserDao {

	User selectOneUser(Integer uno);
	Integer selectCnt();

}