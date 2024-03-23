package com.example.sd18310.repository;

import com.example.sd18310.connect.HibernateUtils;
import com.example.sd18310.model.DanhMuc;
import org.hibernate.Session;

import java.util.ArrayList;

public class DanhMucRepository {

    public ArrayList<DanhMuc> getList() {
        Session session = HibernateUtils.getFACTORY().openSession();
        // truy van
//        ArrayList<DanhMuc> list =
//                (ArrayList<DanhMuc>) session.createQuery("select " +
//                        " new DanhMuc(d.id, d.maDanhMuc,d.tenDanhMuc,d.trangThai,d.ngayTao,d.ngaySua) " +
//                        " from DanhMuc d").list();

        ArrayList<DanhMuc> list =
                (ArrayList<DanhMuc>) session.createQuery("from DanhMuc").list();
        session.close();
        return list;
    }

    public static void main(String[] args) {
        ArrayList<DanhMuc> list = new DanhMucRepository().getList();
        for (DanhMuc danhMuc : list) {
            System.out.println(danhMuc.toString());
        }
    }
}
