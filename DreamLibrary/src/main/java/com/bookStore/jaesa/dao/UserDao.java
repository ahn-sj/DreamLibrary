package com.bookStore.jaesa.dao;

import java.util.List;

import com.bookStore.jaesa.domain.User;

public interface UserDao {

	// 하나의 사용자를 검색
	User selectOneUser(Integer uno) throws Exception;
	
	// 모든 사용자를 검색
	List<User> selectAllUser() throws Exception;
	
	// 모든 사용자의 수 검색
	Integer selectAllUsersCnt() throws Exception;
	
	// 사용자 추가
	Integer insertUser(User user) throws Exception;
	
	// 사용자 삭제
	Integer deleteUser(Integer uno) throws Exception;

}