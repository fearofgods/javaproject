/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.model;

/**
 *
 * @author hongd
 */
public class Products {
    String pid;
    int cid;
    String name;
    String image;
    int price;
    String description;
    int amount;

    public Products() {
    }

    public Products(String pid, int cid, String name, String image, int price, String description, int amount) {
        this.pid = pid;
        this.cid = cid;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.amount = amount;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
    
}
