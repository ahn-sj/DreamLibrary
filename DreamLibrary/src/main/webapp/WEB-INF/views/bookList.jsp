<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<style>
    .NBookTable {
        border-collapse: collapse;
    }
    .NBookTable th, .NBookTable td{
        border:1px solid black;
        padding: 5px;
    }
</style>
<body>

<form action="bookList.do">
    <input type="text" name="keyword" >
    <input type="submit" value="검색">
</form>

<br>

<table class="NBookTable">
<%--    <tr>--%>
<%--        <td colspan="7" width="100%" bgcolor="black"></td>--%>
<%--    </tr>--%>
    <c:forEach var="b" items="${bookList}">
        <tr>
            <td rowspan="2"><img src="${b.image}"></td>
            <td rowspan="2" width="800"><a href="${b.link}">"${b.title}"</a></td>
            <td rowspan="2" width="200">${b.author}</td>
        </tr>
        <tr>
            <td width="150">${b.price }</td>
            <td width="100">${b.discount }</td>
            <td width="100">${b.publisher }</td>
            <td width="200">${b.pubdate }</td>
            <td width="200">${b.isbn }</td>
            <td width="100">
                <button id="rentalBtn">대여</button>
                <button id="returnBtn">반납</button>
            </td>
        </tr>
        <tr>
            <td colspan="9">${b.description}</td>
        </tr>
<%--        <tr>--%>
<%--            <td colspan="7" width="100%" bgcolor="pink"></td>--%>
<%--        </tr>--%>
    </c:forEach>
</table>
</body>
</html>
