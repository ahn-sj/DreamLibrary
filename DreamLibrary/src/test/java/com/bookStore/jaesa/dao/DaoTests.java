package com.bookStore.jaesa.dao;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bookStore.jaesa.domain.User;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class DaoTests {

	@Autowired
    DataSource ds;
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void userSelectUser() {
//		User user = new User("testerId", "testerPwd", "tester", new Date("2022-04-04"), "testerNickN");
		
		User user = userDao.selectOneUser(2);
		System.out.println(user.getUname());
//		System.out.println("==========");
//		System.out.println(userDao.selectCnt());
//		System.out.println("==========");
//		System.out.println(user.getUname());
	}
}
