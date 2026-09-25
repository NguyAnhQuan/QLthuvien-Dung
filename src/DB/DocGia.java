/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

/**
 *
 * @author vun19
 */
public class DocGia {
    private String id;
    private String tenDocGia;
    private String diaChi;
    private String soDienThoai;

    // Constructor
    public DocGia(String id, String tenDocGia, String diaChi, String soDienThoai) {
        this.id = id;
        this.tenDocGia = tenDocGia;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTenDocGia() { return tenDocGia; }
    public void setTenDocGia(String tenDocGia) { this.tenDocGia = tenDocGia; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }
}
