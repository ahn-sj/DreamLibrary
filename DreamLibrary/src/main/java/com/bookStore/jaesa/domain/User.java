package com.bookStore.jaesa.domain;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private Integer uno;
	private String uid;
	private String upwd;
	private String uname;
	private Date ubirth;
	private String unickname;
	private Integer rentalCnt;
	private Date uregdate;
	
	public User(Integer uno, String uid, String upwd, String uname, Date ubirth, String unickname, Integer rentalCnt,
			Date uregdate) {
		this.uno = uno;
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.ubirth = ubirth;
		this.unickname = unickname;
		this.rentalCnt = rentalCnt;
		this.uregdate = uregdate;
	}
}
