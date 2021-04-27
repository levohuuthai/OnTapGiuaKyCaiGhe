
package com.example.ongiuakycaighe;

import java.util.ArrayList;

public class DSGheC {

    private ArrayList<DataGhe> arrGhe;
    private static DSGheC instance;

    private DSGheC(){
        arrGhe = new ArrayList<>();

    }
    public static DSGheC getInstance(){
        if(instance == null){
            instance = new DSGheC();
        }
        return instance;
    }
    public ArrayList<DataGhe> getDSGHE(){
        return this.arrGhe;
    }
    public void themGhe(DataGhe dataGhechon){
       DataGhe dataGhe = new DataGhe();
        dataGhe.setAdd(dataGhechon.getAdd());
        dataGhe.setPrice(dataGhechon.getPrice());
        dataGhe.setName(dataGhechon.getName());
        arrGhe.add(dataGhe);
    }
}
