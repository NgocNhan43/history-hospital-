<%-- 
    Document   : hospital
    Created on : Jun 8, 2023, 12:05:30 PM
    Author     : HUNTER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="a" class="DAO.HospitalDAO" scope="request"></jsp:useBean>
<!DOCTYPE html>
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
        <th>name</th>
        <th>address</th>
        <th>email</th>
        <th>hotline</th>

      </tr>
    </thead>
    <tbody>
    <c:forEach items="${a.hospital}" var="o">
      <tr>
        <td>${o.name}</td>
        <td>${o.address}</td>
         <td>${o.email}</td>
        <td>${o.hotline}</td>
  
        
            
      </tr>
 </c:forEach>
    </tbody>
  </table>
</body>
</html>



