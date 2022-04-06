package com.bookStore.jaesa.dao;

import java.util.List;

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
	public User selectOneUser(Integer uno) throws Exception{
		return session.selectOne(namespace + "selectOneUser", uno); 
	}

	@Override
	public List<User> selectAllUser() throws Exception {
		return session.selectList(namespace + "selectAllUser");
	}

	@Override
	public Integer selectAllUsersCnt() throws Exception{
		return session.selectOne(namespace + "selectAllUsersCnt");
	}

	@Override
	public Integer insertUser(User user) throws Exception {
		return session.insert(namespace + "insertUser", user);
	}

	@Override
	public Integer deleteUser(Integer uno) throws Exception {
		return session.delete(namespace + "deleteUser", uno);
	}
	
}
