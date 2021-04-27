package com.example.ongiuakycaighe;

public class DataGhe {
    private int ghe;
    private String price;
    private String name;
    private String add;
    public DataGhe() {


    }
    public DataGhe(int ghe, String price, String name) {
        this.ghe = ghe;
        this.price = price;
        this.name = name;

    }
    public DataGhe(int ghe, String price, String name, String add) {
        this.ghe = ghe;
        this.price = price;
        this.name = name;
        this.add = add;
    }

    public int getGhe() {
        return ghe;
    }

    public void setGhe(int ghe) {
        this.ghe = ghe;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
