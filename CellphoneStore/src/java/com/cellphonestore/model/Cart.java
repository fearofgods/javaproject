/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hongd
 */
public final class Cart {

    private List<Item> items = new ArrayList<>();
    private int total;

    public Cart() {
    }

    public Cart(int total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Item getItemById(int id){
        for (Item item : items) {
            if (item.getProducts().getId() == id) {
                return item;
            }
        }
        return null;
    }
    
    public Products getProductsById(int id, List<Products> list){
        for (Products products : list) {
            if (products.getId() == id) {
                return products;
            }
        }
        return null;
    }
    
    public void removeItem(int id){
        if (getItemById(id)!=null) {
            items.remove(getItemById(id));
        }
    }
    
    public void addItem(Item item){
        if (getItemById(item.getProducts().getId())!=null) {
            Item itemInList = getItemById(item.getProducts().getId());
            itemInList.setQuantity(itemInList.getQuantity()+item.getQuantity());
        } else {
            items.add(item);
        }
    }
    
    public int getQuantityById(int id){
        return getItemById(id).getQuantity();
    }
    
    public int getTotalMoney(){
        for (Item item : items) {
            total+=(item.getQuantity()*item.getPrice());
        }
        return total;
    }
    
    
    public Cart(String txt, List<Products> list){
        try {
            if (txt != null && !txt.isEmpty()) {
                String s[] = txt.split(",");
                for (String string : s) {
                    String split[] =string.split(":");
                    int id = Integer.parseInt(split[0]);
                    int quantity = Integer.parseInt(split[1]);
                    Products pdt = getProductsById(id, list);
                    Item item = new Item(pdt, quantity, pdt.getPrice()*2);
                    addItem(item);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
