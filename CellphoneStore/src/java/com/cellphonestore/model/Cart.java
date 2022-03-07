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
        items=new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
    public int getQuantityById(int id){
        return getItemById(id).getQuantity();
    }
    public Item getItemById(int id){
//        System.out.println(items.isEmpty());
        for(Item i:items){
//            System.out.println(i.getPrice());
            if(i.getProducts().getId()==id){
                return i;
            }
        }
        return null;
    }
    public void addItem(Item t){
        if(getItemById(t.getProducts().getId())!=null){
            Item m=getItemById(t.getProducts().getId());
            m.setQuantity(m.getQuantity()+t.getQuantity());
        }else
            items.add(t);
    }
    public void removeItem(int id){
        if(getItemById(id)!=null){
            items.remove(getItemById(id));
        }
    }
    public int getTotalMoney(){
        int t=0;
        for(Item i:items)
            t+=(i.getQuantity()*i.getPrice());
        return t;
    }
    private Products getProductById(int id,List<Products> list){
        for(Products i:list){
            if(i.getId()==id)
                return i;
        }
        return null;
    }
    public Cart(String txt,List<Products> list){
        items=new ArrayList<>();
        try{
        if(txt!=null && txt.length()!=0){
            String[] s=txt.split(",");
            for(String i:s){
                String[] n=i.split(":");
                int id=Integer.parseInt(n[0]);
                int quantity=Integer.parseInt(n[1]);
                Products p=getProductById(id, list);
                Item t=new Item(p, quantity, p.getPrice()*2);
                addItem(t);
            }
        }
        }catch(NumberFormatException e){
            System.out.println("Error: "+e);
        }
    }
}
