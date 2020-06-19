/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on_template_method_b1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nga
 */
public abstract class EntityDB<T> {
    protected List<T> list;

    public EntityDB() {
        list = new ArrayList<>();
    }
    
    public boolean add(T t) {
        int key = getKey(t);
        T item = findById(key);
        if (item == null) {
            list.add(t);
            return true;
        }
        return false;
    }
    
    public int delete(T t) {
        int key = getKey(t);
        T item = findById(key);
        if (item != null) {
            if (list.contains(item)) {
                list.remove(item);
                return 1;
            }
        }
        
        return 0;
    }
    
    public int deleteByKey(int id) {
        T item = findById(id);
        if (item != null) {
            if (list.contains(item)) {
                list.remove(item);
                return 1;
            }
        }
        return 0;
    }
    
    public int update(T t) {
        int key = getKey(t);
        T item = findById(key);
        if (item != null) {
            if (list.contains(item)) {
                list.remove(item);
                list.add(t);
                return 1;
            }    
        }
        
        return 0;
    }
    
    protected abstract T findById(int id);
    protected abstract int getKey(T t);

    public List<T> getList() {
        return list;
    }
}
