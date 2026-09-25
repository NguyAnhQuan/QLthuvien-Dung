CREATE TABLE SACH (
    id VARCHAR(20) PRIMARY KEY,
    ten_sach VARCHAR(255) NOT NULL,
    tac_gia VARCHAR(255) NOT NULL,
    nam_xuat_ban INT,
    the_loai VARCHAR(100)
);

-- Thêm dữ liệu vào bảng SACH
INSERT INTO SACH (id, ten_sach, tac_gia, nam_xuat_ban, the_loai) VALUES
('SACH001', 'Sách 1', 'Tác giả A', 2020, 'Khoa học'),
('SACH002', 'Sách 2', 'Tác giả B', 2019, 'Văn học'),
('SACH003', 'Sách 3', 'Tác giả C', 2021, 'Lịch sử'),
('SACH004', 'Sách 4', 'Tác giả D', 2018, 'Kinh tế'),
('SACH005', 'Sách 5', 'Tác giả E', 2022, 'Khoa học');

-- Tạo bảng DOCGIA
CREATE TABLE DOCGIA (
    id VARCHAR(20) PRIMARY KEY,
    ten_doc_gia VARCHAR(255) NOT NULL,
    dia_chi VARCHAR(255),
    so_dien_thoai VARCHAR(20)
);

-- Thêm dữ liệu vào bảng DOCGIA
INSERT INTO DOCGIA (id, ten_doc_gia, dia_chi, so_dien_thoai) VALUES
('DOC001', 'Nguyễn Văn A', 'Hà Nội', '0123456789'),
('DOC002', 'Trần Thị B', 'Hồ Chí Minh', '0987654321'),
('DOC003', 'Lê Văn C', 'Đà Nẵng', '0112233445'),
('DOC004', 'Phạm Thị D', 'Hải Phòng', '0223344556'),
('DOC005', 'Hoàng Văn E', 'Cần Thơ', '0334455667');

-- Tạo bảng MUONTRA
CREATE TABLE MUONTRA (
    id VARCHAR(20) PRIMARY KEY,
    id_sach VARCHAR(20) REFERENCES SACH(id),
    id_doc_gia VARCHAR(20) REFERENCES DOCGIA(id),
    ngay_muon DATE NOT NULL,
    ngay_tra DATE
);

-- Thêm dữ liệu vào bảng MUONTRA
INSERT INTO MUONTRA (id, id_sach, id_doc_gia, ngay_muon, ngay_tra) VALUES
('MT001', 'SACH001', 'DOC001', '2024-09-01', '2024-09-15'),
('MT002', 'SACH002', 'DOC002', '2024-09-02', '2024-09-16'),
('MT003', 'SACH003', 'DOC003', '2024-09-03', NULL),
('MT004', 'SACH004', 'DOC004', '2024-09-04', '2024-09-18'),
('MT005', 'SACH005', 'DOC005', '2024-09-05', NULL);