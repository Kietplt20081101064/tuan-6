gói  com.kiet2008110164.tuan06 ;

nhập  java.util.Scanner ;
 lớp  công khai SanPhamTestDrive {
    static  Scanner sc =  new  Scanner ( Hệ thống . in);
    static  SanPham sanPham =  new  SanPham ();
    static  void  nhap ( SanPham  ds []) {
        for ( int i =  0 ; i < sanPham . soLuong; i ++ ) {
            ds [i] =  new  SanPham ();
            ds [i] . nhapThongTin ();
        }
    }
    static  void  xuat ( SanPham  ds []) {
        for ( int i =  0 ; i < sanPham . soLuong; i ++ ) {
            ds [i] . xuatThongTin ();
        }
    }
    static  void  sapXepGiamdan ( SanPham  ds []) {
        for ( int i =  0 ; i < sanPham . soLuong - 1 ; i ++ ) {
            for ( int j = i + 1 ; j < sanPham . soLuong; j ++ ) {
                if (ds [i] . donGia < ds [j] . donGia) {
                    SanPham temp = ds [i];
                    ds [i] = ds [j];
                    ds [j] = tạm thời;
                }
            }
        }
        xuat (ds);
    }
    static  void  tinhTrungBinh ( SanPham  ds []) {
        tong đôi =  0 ;
        double trungBinh =  0 ;
        cho ( SanPham x : ds) {
            tong + = x . donGia;
        }
        trungBinh = tong / ds . chiều dài;
        Hệ thống . ra ngoài . println ( " Giá trung bình của các sản phẩm là: " + trungBinh);
    }
    static  void  timVaXoa ( SanPham  ds []) {
        Hệ thống . ra ngoài . print ( " - Nhập tên sản phẩm muốn xóa: " );
        Chuỗi tenXoa = sc . hàng tiếp theo();
        for ( int i =  0 ; i < sanPham . soLuong; i ++ ) {
            if ((ds [i] . ten) . bằng (tenXoa)) {
                for ( int j = i; j < sanPham . soLuong -  1 ; j ++ ) {
                    ds [j] = ds [j +  1 ];
                }
            }
        }
        Hệ thống . ra ngoài . println ( " - Xóa thành công! " );
        sanPham . soLuong - ;
    }
    static  void  clearScreen () {
        Hệ thống . ra ngoài . print ( " \ 0 33 [H \ 0 33 [2J " );  
        Hệ thống . ra ngoài . tuôn ra();
    }
    public  static  void  main ( String [] args ) {
        clearScreen ();
        Hệ thống . ra ngoài . print ( " Nhập số sản phẩm: " );
        sanPham . soLuong = sc . nextInt ();
        SanPham ds [] =  mới  SanPham [sanPham . soLuong];
        làm {
            Hệ thống . ra ngoài . println ( " ____________________MENU____________________ " );
            Hệ thống . ra ngoài . println ( " | >> 1. Nhập sản phẩm. | " );
            Hệ thống . ra ngoài . println ( " | >> 2. Export list. | " );
            Hệ thống . ra ngoài . println ( " | >> 3. Sắp xếp dần theo giá trị. | " );
            Hệ thống . ra ngoài . println ( " | >> 4. Tìm và xóa sản phẩm. | " );
            Hệ thống . ra ngoài . println ( " | >> 5. Xuất giá trung bình của các sản phẩm. | " );
            Hệ thống . ra ngoài . println ( " | >> 6. Kết thúc! | " );
            Hệ thống . ra ngoài . println ( " | ____________________________________________ | " );
            Hệ thống . ra ngoài . print ( " Mời bạn chọn: " );
            int key = sc . nextInt ();
            sc . hàng tiếp theo();
            chuyển (phím) {
                trường hợp  1 :
                    clearScreen ();
                    Hệ thống . ra ngoài . println ( " _______ Nhập sản phẩm _______ " );
                    nhap (ds);
                    phá vỡ ;
                trường hợp  2 :
                    clearScreen ();
                    Hệ thống . ra ngoài . println ( " _______ Export danh sách sản phẩm _______ " );
                    xuat (ds);
                    phá vỡ ;
                trường hợp  3 :
                    clearScreen ();
                    Hệ thống . ra ngoài . println ( " _______ Sắp xếp giảm dần theo giá _______ " );
                    sapXepGiamdan (ds);
                    phá vỡ ;
                trường hợp  4 :
                    clearScreen ();
                    Hệ thống . ra ngoài . println ( " _______ Tìm và xóa sản phẩm _______ " );
                    timVaXoa (ds);
                    xuat (ds);
                    phá vỡ ;
                trường hợp  5 :
                    clearScreen ();
                    Hệ thống . ra ngoài . println ( " _______ Xuất giá trung bình của các sản phẩm _______ " );
                    tinhTrungBinh (ds);
                    phá vỡ ;
                trường hợp  6 :
                    Hệ thống . thoát ra ( 0 );
                mặc định :
                    Hệ thống . ra ngoài . println ( " bad select! " );    
            }
            Hệ thống . ra ngoài . print ( " Quay về MENU lựa chọn? (y / n): " );
        } while (sc . nextLine () . equals ( " y " ));
    }
}