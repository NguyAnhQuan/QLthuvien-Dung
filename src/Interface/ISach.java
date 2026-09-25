/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author vun19
 */
import DB.Sach;
import java.util.List;

public interface ISach {
    boolean themSach(Sach sach);
    boolean suaSach(Sach sach);
    boolean xoaSach(String id);
    Sach timKiemSach(String id);

    List<Sach> getAllSachs();
}
