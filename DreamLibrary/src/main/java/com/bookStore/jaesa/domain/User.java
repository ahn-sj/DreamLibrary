package com.bookStore.jaesa.domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import lombok.Data;

public class User {
	private Integer uno;
	private String uid;
	private String upwd;
	private String uname;
	private String unickname;
	private Integer rentalCnt;
	private Date uregdate;

	private List<Book> book;


	public User() {}

	public User(String uid, String upwd, String uname, String unickname) {
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.unickname = unickname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(uno, user.uno) && Objects.equals(uid, user.uid) && Objects.equals(upwd, user.upwd) && Objects.equals(uname, user.uname) && Objects.equals(unickname, user.unickname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uno, uid, upwd, uname, unickname);
	}

	@Override
	public String toString() {
		return "User{" +
				"uno=" + uno +
				", uid='" + uid + '\'' +
				", upwd='" + upwd + '\'' +
				", uname='" + uname + '\'' +
				", unickname='" + unickname + '\'' +
				", rentalCnt=" + rentalCnt +
				", uregdate=" + uregdate +
				'}';
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public Integer getUno() {
		return uno;
	}

	public void setUno(Integer uno) {
		this.uno = uno;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUnickname() {
		return unickname;
	}

	public void setUnickname(String unickname) {
		this.unickname = unickname;
	}

	public Integer getRentalCnt() {
		return rentalCnt;
	}

	public void setRentalCnt(Integer rentalCnt) {
		this.rentalCnt = rentalCnt;
	}

	public Date getUregdate() {
		return uregdate;
	}

	public void setUregdate(Date uregdate) {
		this.uregdate = uregdate;
	}
}
