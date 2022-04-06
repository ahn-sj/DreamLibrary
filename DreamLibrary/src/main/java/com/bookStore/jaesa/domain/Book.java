package com.bookStore.jaesa.domain;

import java.util.Date;
import java.util.Objects;

public class Book {
    private Integer bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date breg_date;
    private Date bupdate_date;

    public Book() {}

    public Book(String btitle, String bcontent, String bwriter) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bno, book.bno) && Objects.equals(btitle, book.btitle) && Objects.equals(bcontent, book.bcontent) && Objects.equals(bwriter, book.bwriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, btitle, bcontent, bwriter);
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public Date getBreg_date() {
        return breg_date;
    }

    public void setBreg_date(Date breg_date) {
        this.breg_date = breg_date;
    }

    public Date getBupdate_date() {
        return bupdate_date;
    }

    public void setBupdate_date(Date bupdate_date) {
        this.bupdate_date = bupdate_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", breg_date=" + breg_date +
                ", bupdate_date=" + bupdate_date +
                '}';
    }
}
