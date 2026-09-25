/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LG;

import DB.MuonTra;
import DB.Sach;
import Interface.IDocGia;
import Interface.IMuonTra;
import Interface.ISach;

/**
 *
 * @author vun19
 */
public class TriThuc {
    IDocGia docGiaRepo;

    public TriThuc(IDocGia docGiaRepo) {
        this.docGiaRepo = docGiaRepo;
    }

    public boolean themDocGia(DB.DocGia docGia) {
        return docGiaRepo.themDocGia(docGia);
    }

    public boolean suaDocGia(DB.DocGia docGia) {
        return docGiaRepo.suaDocGia(docGia);
    }

    public boolean xoaDocGia(String id) {
        return docGiaRepo.xoaDocGia(id);
    }
    
    
    IMuonTra muonTraRepo;

    public TriThuc(IMuonTra muonTraRepo) {
        this.muonTraRepo = muonTraRepo;
    }

    public boolean themMuonTra(MuonTra muonTra) {
        return muonTraRepo.themMuonTra(muonTra);
    }

    public boolean suaMuonTra(MuonTra muonTra) {
        return muonTraRepo.suaMuonTra(muonTra);
    }

    public boolean xoaMuonTra(String id) {
        return muonTraRepo.xoaMuonTra(id);
    }
    
    
    
    ISach sachRepo;

    public TriThuc(ISach sachRepo) {
        this.sachRepo = sachRepo;
    }

    public boolean themSach(Sach sach) {
        return sachRepo.themSach(sach);
    }

    public boolean suaSach(Sach sach) {
        return sachRepo.suaSach(sach);
    }

    public boolean xoaSach(String id) {
        return sachRepo.xoaSach(id);
    }
}
