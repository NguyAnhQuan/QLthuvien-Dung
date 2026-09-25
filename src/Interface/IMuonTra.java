/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author vun19
 */
import DB.MuonTra;
import java.util.List;

public interface IMuonTra {
    boolean themMuonTra(MuonTra muonTra);
    boolean suaMuonTra(MuonTra muonTra);
    boolean xoaMuonTra(String id);
    MuonTra timKiemMuonTra(String id);

    List<MuonTra> getAllMuonTras();
}
