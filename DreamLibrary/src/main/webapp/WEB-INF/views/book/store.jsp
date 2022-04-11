<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="../includes/header.jsp" %>

<main>
    <div class="container-fluid px-4">
    <div>
        <h1 class="mt-4">꿈꾸는 도서관</h1>

<%--                <div class="card mb-4">--%>
<%--                    <div class="card-body">--%>
        <div>
            <div>
                <table class="listTable">
                    <thead>
                    <tr>
                        <th>Bno</th>
                        <th>Title</th>
                        <th>Content</th>
                        <th>Writer</th>
                        <th>Reg_date</th>
                        <th>Update_date</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="bookDto" items="${book}">
                        <tr>
                            <td>${bookDto.bno}</td>
                            <td>${bookDto.btitle}</td>
                            <td>${bookDto.bcontent}</td>
                            <td>${bookDto.bwriter}</td>
                            <td><fmt:formatDate value="${bookDto.breg_date}" pattern="yyyy-MM-dd HH:mm:ss" type="time"/></td>
                            <td><fmt:formatDate value="${bookDto.bupdate_date}" pattern="yyyy-MM-dd HH:mm:ss" type="time"/></td>
                        </tr>
                    </c:forEach>
                    <br>
                    <div class="paging-container">
                        <div class="paging">
                            <a class="page" hrer="<c:url value=""/> ">&lt;</a>

                            <a class="page" hrer="<c:url value=""/> ">1</a>
                            <a class="page" hrer="<c:url value=""/> ">2</a>

                            <a class="page" hrer="<c:url value=""/> ">&gt;</a>
                            <button id="registerBtn">등록</button>
                        </div>
                    </div>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</main>

<%@include file="../includes/footer.jsp" %>
