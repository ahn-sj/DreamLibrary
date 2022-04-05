package com.bookStore.jaesa.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookStore.jaesa.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private String namespace = "com.bookStore.jaesa.dao.UserDao.";
	
	@Autowired
    private SqlSession session;
	

	@Override
	public User selectOneUser(Integer uno) {
		return session.selectOne(namespace + "select", uno); 
	}


	@Override
	public Integer selectCnt() {
		return session.selectOne(namespace + "selectCnt");
	}
	
}
