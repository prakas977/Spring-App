package com.learn.spring.project.springbootapp.models;

import java.util.ArrayList;

public class Products {
    private  ArrayList<Parts> partsArrayList = new ArrayList<>();
    private  Integer productID;
    private String productName;
    public double productPrice;
    public int prodMax;
    public int prodMin;



    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProdMax() {
        return prodMax;
    }

    public void setProdMax(int prodMax) {
        this.prodMax = prodMax;
    }

    public int getProdMin() {
        return prodMin;
    }

    public void setProdMin(int prodMin) {
        this.prodMin = prodMin;
    }

    public ArrayList<Parts> getPartsArrayList() {
        return partsArrayList;
    }

    public void setPartsArrayList(ArrayList<Parts> partsArrayList) {
        this.partsArrayList = partsArrayList;
    }

    @Override
    public String toString() {
        return "Products{" +
                "partsArrayList=" + partsArrayList +
                ", productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", prodMax=" + prodMax +
                ", prodMin=" + prodMin +
                '}';
    }
}
