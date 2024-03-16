package com.example.sd18310.servlet;

import com.example.sd18310.model.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = {
        "/sinh-vien/trang-chu",// GET
        "/sinh-vien/add",// POST
        "/sinh-vien/detail", //GET
})
public class HomeServlet extends HttpServlet {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public HomeServlet() {
        list.add("A");
        list.add("Nguyen Van B");
        list.add("Nguyen Van 2");
        list.add("Nguyen Van 4");
        SinhVien sinhVien = new SinhVien("Ph12345", "Nguyen Van B", "HCM", 20);
        listSinhVien.add(sinhVien);
        listSinhVien.add(new SinhVien("Ph3211", "Nguyen Thi B", "HN", 23));
        listSinhVien.add(new SinhVien("Ph3221", "Tran Thi C", "HN", 23));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        System.out.println(uri);
        if (uri.equals("/sinh-vien/trang-chu")) {
            request.setAttribute("listSv", listSinhVien);
            request.setAttribute("list", listSinhVien);
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        } else if (uri.equals("/sinh-vien/detail")) {
            String ma = request.getParameter("maSinhVien");
            SinhVien sinhVien = new SinhVien();
            for (SinhVien sv : listSinhVien) {
                if (sv.getMaSinhVien().equals(ma)) {
                    sinhVien = sv;
                }
            }
            request.setAttribute("sinhVien", sinhVien);
            request.getRequestDispatcher("/chi-tiet.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("maSinhVien");
        String ten = request.getParameter("tenSinhVien");
        Integer tuoi = Integer.parseInt(request.getParameter("tuoi"));
        String diaChi = request.getParameter("diaChi");
        listSinhVien.add(new SinhVien(ma, ten, diaChi, tuoi));
        response.sendRedirect("/sinh-vien/trang-chu");
    }
}
