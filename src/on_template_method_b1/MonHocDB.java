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
public class MonHocDB extends EntityDB<MonHoc>{

    @Override
    protected MonHoc findById(int id) {
        for (MonHoc mh : list) {
            if (mh.maMH == id) {
                return mh;
            }
        }
        return null;
    }

    @Override
    protected int getKey(MonHoc t) {
        return t.maMH;
    }
}
