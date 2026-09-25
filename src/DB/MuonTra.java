/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

/**
 *
 * @author vun19
 */
import java.sql.Date;

public class MuonTra {
    private String id;
    private String idSach;
    private String idDocGia;
    private Date ngayMuon;
    private Date ngayTra;

    // Constructor
    public MuonTra(String id, String idSach, String idDocGia, Date ngayMuon, Date ngayTra) {
        this.id = id;
        this.idSach = idSach;
        this.idDocGia = idDocGia;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getIdSach() { return idSach; }
    public void setIdSach(String idSach) { this.idSach = idSach; }

    public String getIdDocGia() { return idDocGia; }
    public void setIdDocGia(String idDocGia) { this.idDocGia = idDocGia; }

    public Date getNgayMuon() { return ngayMuon; }
    public void setNgayMuon(Date ngayMuon) { this.ngayMuon = ngayMuon; }

    public Date getNgayTra() { return ngayTra; }
    public void setNgayTra(Date ngayTra) { this.ngayTra = ngayTra; }
}
