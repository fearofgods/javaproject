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
public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getQuantityById(int id){
        return getItemById(id).getQuantity();
    }
    
    private Item getItemById(int id){
        for (Item item : items) {
            if (item.getProducts().getId()==id) {
                return item;
            }
        }
        return null;
    }
    
    public void addItem(Item t){
        if (getItemById(t.getProducts().getId())!=null) {
            Item m = getItemById(t.getProducts().getId());
            m.setQuantity(m.getQuantity()+t.getQuantity());
        }else{
            items.add(t);
        }
    }
    
    public void removeItem(int id){
        if (getItemById(id)!=null) {
            items.remove(getItemById(id));
        }
    }
    
    public int getTotalMoney(){
        int total = 0;
        for (Item item : items) {
            total+=(item.getQuantity()*item.getProducts().getPrice());
        }
        return total;
    }
}
