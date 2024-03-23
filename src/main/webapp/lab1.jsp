<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 20/03/2024
  Time: 07:43
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
        <label class="form-label">Ma san pham</label>
        <input type="text" class="form-control" name="maSinhVien">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten san pham</label>
        <input type="text" class="form-control" name="tenSinhVien">
    </div>
    <div class="mb-3">
        <label class="form-label">So luong ton</label>
        <input type="text" class="form-control" name="tuoi">
    </div>
    <div class="mb-3">
        <label class="form-label">Gia ban</label>
        <input type="text" class="form-control" name="diaChi">
    </div>
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Danh muc</label>
        <select id="disabledSelect" class="form-select" name="tenLop">
            <%--            <c:forEach items="${list}" var="s">--%>
            <%--                <option value="${s}">${s}</option>--%>
            <%--            </c:forEach>--%>
            <option value="">Hang 1</option>
            <option value="">Hang 1</option>
            <option value="">Hang 1</option>
        </select>
    </div>
    <div class="row">
        <p class="col-4">Trang thai
        </p>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nam" name="gioiTinh">
            <label class="form-check-label">
                Con hang
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Nu" name="gioiTinh">
            <label class="form-check-label">
                Het hang
            </label>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Add</button>
</form>

<form action="/sinh-vien/add" method="post">
    <div class="mb-3">
        <label class="form-label">Ten san pham</label>
        <input type="text" class="form-control" name="maSinhVien">
    </div>
    <button class="btn btn-primary">Tim kiem</button>
</form>
<h1>Danh sach san pham</h1>
<table class="table">
    <thead>
    <tr>
        <td>STT</td>
        <td>Ma san pham</td>
        <td>Ten san pham</td>
        <td>So luong ton</td>
        <td>Gia ban</td>
        <td>Danh muc</td>
        <td>Trang thai</td>
        <td>Chuc nang</td>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="sinhVien" items="${listSv}" varStatus="i">
        <tr>
            <td>${i.index + 1}</td>
            <td>${sinhVien.maSinhVien}</td>
            <td>${sinhVien.tenSinhVien}</td>
            <td>${sinhVien.diaChi}</td>
            <td>${sinhVien.tuoi}</td>
            <td>${sinhVien.lop}</td>
            <td>${sinhVien.gioiTinh}</td>
            <td>
                    <%--                <a href="/sinh-vien/detail?maSinhVien=${sinhVien.maSinhVien}" class="btn btn-dark">Chi tiet</a>--%>
                <a href="/sinh-vien/delete?maSinhVien=${sinhVien.maSinhVien}" class="btn btn-dark">Xoa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

Tạo giao diện như hình với các đường dẫn như sau: 1đ
/san-pham/hien-thi
/san-pham/add
/san-pham/delete
/san-pham/search
1. Hiển thị được danh sách 5 sản phẩm 3đ
2. Xoá thành công khi bấm Xoá 1đ
3. Add thành công 1 sản phẩm 2đ
4. Search theo tên sản phẩm 1đ
5. Khi xoá không còn phần tử nào màn hình hiển thi "Danh sách trống" 2đ
