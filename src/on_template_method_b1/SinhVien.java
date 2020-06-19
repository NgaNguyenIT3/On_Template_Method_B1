/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on_template_method_b1;

/**
 *
 * @author nga
 */
public class SinhVien {
    int maSV;
    String tenSV, ngaySinh, queQuan;

    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + '}'; 
    }
}
