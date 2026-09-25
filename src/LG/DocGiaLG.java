/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LG;

/**
 *
 * @author vun19
 */
import DB.DocGia;
import Interface.IDocGia;
import java.util.ArrayList;
import java.util.List;

public class DocGiaLG extends TriThuc{

    public DocGiaLG(IDocGia docGiaRepo) {
        super(docGiaRepo);
    }
    

    public List<DocGia> timKiemDocGia(String id) {
        List<DocGia> danhSachDocGia = new ArrayList<>();
        DocGia docGia = docGiaRepo.timKiemDocGia(id);
        if (docGia != null) {
            danhSachDocGia.add(docGia);
        }
        return danhSachDocGia;
    }

    public List<DocGia> getAllDocGias() {
        return docGiaRepo.getAllDocGias();
    }
}
