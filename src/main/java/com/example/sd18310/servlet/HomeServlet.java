package com.example.sd18310.servlet;

import com.example.sd18310.model.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = {"/sinh-vien/trang-chu",
        "/sinh-vien/add",
})
public class HomeServlet extends HttpServlet {
    ArrayList<String> list = new ArrayList<>();

    public HomeServlet() {
        list.add("A");
        list.add("Nguyen Van B");
        list.add("Nguyen Van 2");
        list.add("Nguyen Van 4");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        SinhVien sinhVien = new SinhVien("Ph12345", "Nguyen Van B", "HCM", 20);
//        request.setAttribute("sinhVien", sinhVien);
//        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
//        listSinhVien.add(sinhVien);
//        listSinhVien.add(new SinhVien("Ph3211", "Nguyen Thi B", "HN", 23));
//        listSinhVien.add(new SinhVien("Ph3221", "Tran Thi C", "HN", 23));
//        request.setAttribute("listSv", listSinhVien);


        request.setAttribute("list", list);
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("hoTen");
        list.add(ten);
        response.sendRedirect("/sinh-vien/trang-chu");
    }
}
