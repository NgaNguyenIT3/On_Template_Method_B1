/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on_template_method_b1;

import java.util.List;

/**
 *
 * @author nga
 */
public class On_Template_Method_B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityDB sinhVienDB = new SinhVienDB();
        List<SinhVien> sinhViens = sinhVienDB.getList();
        sinhVienDB.add(new SinhVien(0, "Nguyen Khanh Linh", "02/12/1997", "Phu Yen"));
        sinhVienDB.add(new SinhVien(1, "Nguyen Hoang Nhat Minh","06/01/1997", "Nha Trang"));
        sinhVienDB.add(new SinhVien(2, "Le Thi Hoang Mai","25/06/1997", "Nha Trang"));
        sinhVienDB.add(new SinhVien(3, "Nguyen Le Hoang My","03/11/1997", "Khanh Hoa"));
        
        
        sinhViens.forEach(sv -> System.out.println(sv.toString()));
        
        System.out.println("");
        
        sinhVienDB.delete(new SinhVien(2, "Le Thi Hoang Mai","25/06/1997","Nha Trang"));
        sinhViens.forEach(sv -> System.out.println(sv.toString()));
        
        System.out.println("");
        
        sinhVienDB.deleteByKey(1);
        sinhViens.forEach(sv -> System.out.println(sv.toString()));
        
        System.out.println("");
        
        sinhVienDB.update(new SinhVien(3, "Nguyen Thi Kim Nga","03/11/1997", "Nha Trang"));
        sinhViens.forEach(sv -> System.out.println(sv.toString()));
        
        System.out.println("");
        
        MonHocDB monHocDB = new MonHocDB();
        List<MonHoc> monHocs = monHocDB.getList();
        monHocDB.add(new MonHoc(0, 4, "Toan"));
        monHocDB.add(new MonHoc(1, 4, "Van"));
        monHocDB.add(new MonHoc(2, 4, "Anh"));
        monHocDB.add(new MonHoc(3, 4, "Su"));
        
        
        monHocs.forEach(mh -> System.out.println(mh.toString()));
        
        System.out.println("");
        
        monHocDB.delete(new MonHoc(2, 4, "Anh"));
        monHocs.forEach(mh -> System.out.println(mh.toString()));
        
        System.out.println("");
        
        monHocDB.deleteByKey(1);
        monHocs.forEach(mh -> System.out.println(mh.toString()));
        
        System.out.println("");
        
        monHocDB.update(new MonHoc(3, 3, "VanHoc"));
        monHocs.forEach(mh -> System.out.println(mh.toString()));
    }
}
