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
        "/sinh-vien/update", //POST
})
public class HomeServlet extends HttpServlet {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public HomeServlet() {
        list.add("SD12345");
        list.add("SD12346");
        list.add("SD12347");
        list.add("SD12348");
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
            request.setAttribute("list", list);
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

        String uri = request.getRequestURI();
        System.out.println(uri);
        if (uri.equals("/sinh-vien/add")) {
            String ma = request.getParameter("maSinhVien");
            String ten = request.getParameter("tenSinhVien");
            Integer tuoi = Integer.parseInt(request.getParameter("tuoi"));
            String diaChi = request.getParameter("diaChi");
            String tenLop = request.getParameter("tenLop");
            System.out.println(tenLop);
            listSinhVien.add(new SinhVien(ma, ten, diaChi, tuoi));
            response.sendRedirect("/sinh-vien/trang-chu");
        } else if (uri.equals("/sinh-vien/update")) {
            String ma = request.getParameter("maSinhVien");
            String ten = request.getParameter("tenSinhVien");
            Integer tuoi = Integer.parseInt(request.getParameter("tuoi"));
            String diaChi = request.getParameter("diaChi");
            for (SinhVien sinhVien : listSinhVien) {
                if (sinhVien.getMaSinhVien().equals(ma)) {
                    sinhVien.setTenSinhVien(ten);
                    sinhVien.setTuoi(tuoi);
                    sinhVien.setDiaChi(diaChi);
                }
            }
            response.sendRedirect("/sinh-vien/trang-chu");
        }
    }
}
