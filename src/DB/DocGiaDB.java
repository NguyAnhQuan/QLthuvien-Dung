/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

/**
 *
 * @author vun19
 */
import SQL.sql;
import Interface.IDocGia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocGiaDB implements IDocGia {
    private Connection conn;

    public DocGiaDB() {
        try {
            conn = sql.getConnection(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean themDocGia(DocGia docGia) {
        try {
            String query = "INSERT INTO docgia (id, ten_doc_gia, dia_chi, so_dien_thoai) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, docGia.getId());
            pstmt.setString(2, docGia.getTenDocGia());
            pstmt.setString(3, docGia.getDiaChi());
            pstmt.setString(4, docGia.getSoDienThoai());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean suaDocGia(DocGia docGia) {
        try {
            String query = "UPDATE docgia SET ten_doc_gia = ?, dia_chi = ?, so_dien_thoai = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, docGia.getTenDocGia());
            pstmt.setString(2, docGia.getDiaChi());
            pstmt.setString(3, docGia.getSoDienThoai());
            pstmt.setString(4, docGia.getId());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean xoaDocGia(String id) {
        try {
            String query = "DELETE FROM docgia WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DocGia timKiemDocGia(String id) {
        try {
            String query = "SELECT * FROM docgia WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new DocGia(rs.getString("id"), rs.getString("ten_doc_gia"), rs.getString("dia_chi"), rs.getString("so_dien_thoai"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<DocGia> getAllDocGias() {
        List<DocGia> danhSachDocGia = new ArrayList<>();
        try {
            String query = "SELECT * FROM docgia";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DocGia docGia = new DocGia(rs.getString("id"), rs.getString("ten_doc_gia"), rs.getString("dia_chi"), rs.getString("so_dien_thoai"));
                danhSachDocGia.add(docGia);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachDocGia;
    }
}
