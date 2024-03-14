<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 07/03/2024
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">
<form action="/sinh-vien/add" method="post">
    <label for="">Name</label>
    <input type="text" name="hoTen">
    <button type="submit">Submit</button>
</form>
<table class="table">
    <c:forEach items="${list}" var="s" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${s}</td>
        </tr>
    </c:forEach>
</table>
<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <td>STT</td>--%>
<%--        <td>Ma sinh vien</td>--%>
<%--        <td>Ten sinh vien</td>--%>
<%--        <td>Dia chi</td>--%>
<%--        <td>Tuoi</td>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach var="sinhVien" items="${listSv}" varStatus="i">--%>
<%--        <tr>--%>
<%--            <td>${i.index + 1}</td>--%>
<%--            <td>${sinhVien.maSinhVien}</td>--%>
<%--            <td>${sinhVien.tenSinhVien}</td>--%>
<%--            <td>${sinhVien.diaChi}</td>--%>
<%--            <td>${sinhVien.tuoi}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>
