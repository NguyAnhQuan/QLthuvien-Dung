/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LG;

/**
 *
 * @author vun19
 */
import DB.Sach;
import Interface.ISach;
import java.util.ArrayList;
import java.util.List;

public class SachLG extends TriThuc{

    public SachLG(ISach sachRepo) {
        super(sachRepo);
    }
    

    public List<Sach> timKiemSach(String id) {
        List<Sach> danhSachSach = new ArrayList<>();
        Sach sach = sachRepo.timKiemSach(id);
        if (sach != null) {
            danhSachSach.add(sach);
        }
        return danhSachSach;
    }

    public List<Sach> getAllSachs() {
        return sachRepo.getAllSachs();
    }
}
