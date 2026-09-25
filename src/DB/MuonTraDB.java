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
import Interface.IMuonTra;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuonTraDB implements IMuonTra {
    private Connection conn;

    public MuonTraDB() {
        try {
            conn = sql.getConnection(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean themMuonTra(MuonTra muonTra) {
        try {
            String query = "INSERT INTO muontra (id, id_sach, id_doc_gia, ngay_muon, ngay_tra) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, muonTra.getId());
            pstmt.setString(2, muonTra.getIdSach());
            pstmt.setString(3, muonTra.getIdDocGia());
            pstmt.setDate(4, muonTra.getNgayMuon());
            pstmt.setDate(5, muonTra.getNgayTra());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean suaMuonTra(MuonTra muonTra) {
        try {
            String query = "UPDATE muontra SET id_sach = ?, id_doc_gia = ?, ngay_muon = ?, ngay_tra = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, muonTra.getIdSach());
            pstmt.setString(2, muonTra.getIdDocGia());
            pstmt.setDate(3, muonTra.getNgayMuon());
            pstmt.setDate(4, muonTra.getNgayTra());
            pstmt.setString(5, muonTra.getId());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean xoaMuonTra(String id) {
        try {
            String query = "DELETE FROM muontra WHERE id = ?";
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
    public MuonTra timKiemMuonTra(String id) {
        try {
            String query = "SELECT * FROM muontra WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new MuonTra(rs.getString("id"), rs.getString("id_sach"), rs.getString("id_doc_gia"), rs.getDate("ngay_muon"), rs.getDate("ngay_tra"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MuonTra> getAllMuonTras() {
        List<MuonTra> danhSachMuonTra = new ArrayList<>();
        try {
            String query = "SELECT * FROM muontra";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                MuonTra muonTra = new MuonTra(rs.getString("id"), rs.getString("id_sach"), rs.getString("id_doc_gia"), rs.getDate("ngay_muon"), rs.getDate("ngay_tra"));
                danhSachMuonTra.add(muonTra);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachMuonTra;
    }
}