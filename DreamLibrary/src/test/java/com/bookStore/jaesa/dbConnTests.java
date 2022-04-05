package com.bookStore.jaesa;

import java.util.Date;

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
public class dbConnTests {
	
	@Autowired
	DataSource datasource;
	
	@Test
	public void dbConnTest1() {
		log.info("==============");
		log.info(datasource);
		log.info("==============");
		
	}
	
	@Test
	public void dbInsertUserTest() {
		
		
	}


}
