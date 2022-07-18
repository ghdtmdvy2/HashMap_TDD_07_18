package com.ll.exam;

import java.util.ArrayList;
import java.util.List;

public class HashMap<S,T> {
    private Object keys[];
    private Object values[];
    private int lastIndex;

    HashMap(){
        keys = new Object[2];
        values = new Object[2];
        lastIndex = -1;
    }
    public void put(S key, T value) {
        sizeUp();
        int findkey = find_Index(key);
        if ( findkey != -1 ) {
            values[findkey] = value;
            return;
        }
        lastIndex++;
        keys[lastIndex] = key;
        values[lastIndex] = value;
    }

    private void sizeUp() {
        if ( lastIndex + 1 >= keys.length){
            Object[] newarrkey = new Object[keys.length * 2];
            Object[] newarrvalue = new Object[keys.length * 2];
            for(int i = 0; i<size(); i++){
                newarrvalue[i] = values[i];
                newarrkey[i] = keys[i];
            }
            values = newarrvalue;
            keys = newarrkey;
        }
    }

    private int find_Index(S key) {
        for (int i = 0; i<size(); i++){
            if (key.equals(keys[i])){
                return i;
            }
        }
        return -1;
    }

    int size(){
        return lastIndex + 1;
    }
    public T get(S key) {
        int findkey = find_Index(key);
        if ( findkey != -1 ) {
            return (T)values[findkey];
        }
        return null;
    }

    public void remove(S key) {
        int findkey = find_Index(key);
        if ( findkey != -1 ) {
            for(int i = findkey; i<size()-1; i++){
                keys[i] = keys[i + 1];
                values[i] = values[i + 1];
            }
            lastIndex--;
        }

    }

    public List<S> keySet() {
        List<S> list = new ArrayList<>();
        for(int i = 0; i<size(); i++) {
            list.add((S)keys[i]);
        }
        return list;
    }
}

