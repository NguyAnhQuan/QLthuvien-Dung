/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author vun19
 */
import DB.DocGia;
import java.util.List;

public interface IDocGia {
    boolean themDocGia(DocGia docGia);
    boolean suaDocGia(DocGia docGia);
    boolean xoaDocGia(String id);
    DocGia timKiemDocGia(String id);

    List<DocGia> getAllDocGias();
}
