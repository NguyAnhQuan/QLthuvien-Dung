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
import Interface.ISach;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SachDB implements ISach {
    private Connection conn;

    public SachDB() {
        try {
            conn = sql.getConnection(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean themSach(Sach sach) {
        try {
            String query = "INSERT INTO sach (id, ten_sach, tac_gia, nam_xuat_ban, the_loai) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, sach.getId());
            pstmt.setString(2, sach.getTenSach());
            pstmt.setString(3, sach.getTacGia());
            pstmt.setInt(4, sach.getNamXuatBan());
            pstmt.setString(5, sach.getTheLoai());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean suaSach(Sach sach) {
        try {
            String query = "UPDATE sach SET ten_sach = ?, tac_gia = ?, nam_xuat_ban = ?, the_loai = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, sach.getTenSach());
            pstmt.setString(2, sach.getTacGia());
            pstmt.setInt(3, sach.getNamXuatBan());
            pstmt.setString(4, sach.getTheLoai());
            pstmt.setString(5, sach.getId());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean xoaSach(String id) {
        try {
            String query = "DELETE FROM sach WHERE id = ?";
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
    public Sach timKiemSach(String id) {
        try {
            String query = "SELECT * FROM sach WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Sach(rs.getString("id"), rs.getString("ten_sach"), rs.getString("tac_gia"), rs.getInt("nam_xuat_ban"), rs.getString("the_loai"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Sach> getAllSachs() {
        List<Sach> danhSachSach = new ArrayList<>();
        try {
            String query = "SELECT * FROM sach";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Sach sach = new Sach(rs.getString("id"), rs.getString("ten_sach"), rs.getString("tac_gia"), rs.getInt("nam_xuat_ban"), rs.getString("the_loai"));
                danhSachSach.add(sach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachSach;
    }
}
