package com.nest.productapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private String productName;
    private String manudate;
    private String expdate;
    private String brand;
    private int price;
    private String sellerName;
    private String distributorName;

    public Products() {
    }

    public Products(int id, int productCode, String productName, String manudate, String expdate, String brand, int price, String sellerName, String distributorName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manudate = manudate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManudate() {
        return manudate;
    }

    public void setManudate(String manudate) {
        this.manudate = manudate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
