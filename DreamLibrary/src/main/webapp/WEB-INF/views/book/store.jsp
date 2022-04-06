<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>


    <%@include file="../includes/header.jsp" %> 
            
   <main>
       <div class="container-fluid px-4">
           <h1 class="mt-4">꿈꾸는 도서관</h1>

           <div class="card mb-4">
               <div class="card-body">
                   <table id="datatablesSimple">
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
                                   <td>${bookDto.breg_date}</td>
                                   <td>${bookDto.bupdate_date}</td>
                               </tr>
                           </c:forEach>
                       </tbody>
                   </table>
               </div>
           </div>
       </div>
   </main>
   
   <%@include file="../includes/footer.jsp" %> 
                