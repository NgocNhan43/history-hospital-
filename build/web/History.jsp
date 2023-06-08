<%-- 
    Document   : History
    Created on : Jun 7, 2023, 10:40:25 PM
    Author     : HUNTER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="b" class="DAO.HistoryDAO" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
  <title>Table Example</title>
  <style>
    table {
      border-collapse: collapse;
      width: 100%;
    }

    th, td {
      padding: 8px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }

    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
  <table>
    <thead>
      <tr>
        <th>Username</th>
        <th>Gender</th>
        <th>Hospital</th>
        <th>Date</th>
        <th>Vaccine</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${b.history}" var="o">
      <tr>
        <td>${o.userName}</td>
        <td>${o.gender}</td>
         <td>${o.hospital}</td>
        <td>${o.date}</td>
        <td>${o.vaccine}</td>
        <td>${o.price}</td>
        
            
      </tr>
 </c:forEach>
    </tbody>
  </table>
</body>
</html>


