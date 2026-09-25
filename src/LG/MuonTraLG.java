/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LG;

/**
 *
 * @author vun19
 */
import DB.MuonTra;
import Interface.IMuonTra;
import java.util.ArrayList;
import java.util.List;

public class MuonTraLG extends TriThuc{

    public MuonTraLG(IMuonTra muonTraRepo) {
        super(muonTraRepo);
    }
    

    public List<MuonTra> timKiemMuonTra(String id) {
        List<MuonTra> danhSachMuonTra = new ArrayList<>();
        MuonTra muonTra = muonTraRepo.timKiemMuonTra(id);
        if (muonTra != null) {
            danhSachMuonTra.add(muonTra);
        }
        return danhSachMuonTra;
    }

    public List<MuonTra> getAllMuonTras() {
        return muonTraRepo.getAllMuonTras();
    }
}
