<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 20/03/2024
  Time: 08:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body class="container">
<form action="/sinh-vien/add" method="post">
    <div class="mb-3">
        <label class="form-label">Ma hoa don</label>
        <input type="text" class="form-control" name="maSinhVien">
    </div>
    <div class="mb-3">
        <label class="form-label">So luong</label>
        <input type="text" class="form-control" name="tuoi">
    </div>
    <div class="mb-3">
        <label class="form-label">Gia ban</label>
        <input type="text" class="form-control" name="tuoi">
    </div>
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Nhan vien</label>
        <select id="disabledSelect" class="form-select" name="tenLop">
            <%--            <c:forEach items="${list}" var="s">--%>
            <%--                <option value="${s}">${s}</option>--%>
            <%--            </c:forEach>--%>
            <option value="">Nguyen Van A</option>
            <option value="">Hang 1</option>
            <option value="">Hang 1</option>
        </select>
    </div>
    <div class="row">
        <p class="col-4">Hinh thuc thanh toan
        </p>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nam" name="gioiTinh">
            <label class="form-check-label">
                Tien mat
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nu" name="gioiTinh">
            <label class="form-check-label">
                Chuyen khoan
            </label>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Update</button>
</form>
</body>
</html>
