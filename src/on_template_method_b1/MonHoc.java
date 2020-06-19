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
public class MonHoc {
    int maMH, soTC;
    String tenMH;

    public MonHoc(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMH=" + maMH + ", soTC=" + soTC + ", tenMH=" + tenMH + '}';
    } 
}
