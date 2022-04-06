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

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class UserDaoTests {

	@Autowired
    DataSource ds;
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void selectOneUserTest() throws Exception {
		User user = userDao.selectOneUser(4);
		
		log.info("=========");
		log.info(user);
		log.info("=========");
	}
	
	@Test
	public void selectAllUserTest() throws Exception {
		List<User> list =  userDao.selectAllUser();
		
		log.info("=========");
		log.info(list.size());
		log.info("=========");
	}

	@Test
	public void selectAllUsersCntTest() throws Exception {
		int userCnt = userDao.selectAllUsersCnt();

		log.info("=========");
		log.info(userCnt);
		log.info("=========");
	}

	@Test
	public void insertUserTest() throws Exception {
		int rowCnt = 0;
		
		for(int i = 1; i <= 1; i++) {
			User user = new User("testerId"+ i, "testerPwd"+i, "tester"+i, "daoTester");
			rowCnt += userDao.insertUser(user);
		}
		
		log.info("=========");
		log.info(rowCnt);
		log.info("=========");
	}

	@Test
	public void deleteUserTest() throws Exception {
		int rowCnt = userDao.deleteUser(6);

		log.info("=========");
		log.info(rowCnt);
		log.info("=========");
	}
}
