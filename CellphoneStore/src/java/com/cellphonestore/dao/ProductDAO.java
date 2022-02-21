/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.dao;

import com.cellphonestore.model.Color;
import com.cellphonestore.model.ProductDetails;
import com.cellphonestore.model.Products;
import com.cellphonestore.model.Storage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hongd
 */
public class ProductDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Products> getAll(){
        List<Products> list = new ArrayList<>();
        String query = "select * from Products";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return list;
    }
    
    public List<Products> getTop4Offset(int amount){
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select * from Products order by id desc offset ? rows fetch next 4 rows only";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listTop4.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return listTop4;
    }
    
    public List<Products> getTop4(){
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select top 4 * from Products order by id desc";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listTop4.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return listTop4;
    }
    
    public Products getProductById(String id){
        String query = "Select * from Products where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {                
                return new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return null;
    }
    
    public ProductDetails getInfoById(String id){
        String query = "Select * from ProductDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new ProductDetails(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return null;
    }
    
    public List<Color> getColorById(String id){
        List<Color> color = new ArrayList<>();
        String query = "Select * from ColorDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                color.add(new Color(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return color;
    }
    
    public List<Storage> getStorageById(String id){
        List<Storage> storage = new ArrayList<>();
        String query = "Select * from StorageDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                storage.add(new Storage(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return storage;
    }
    public static void main(String[] args) {
        com.cellphonestore.dao.ProductDAO dao = new ProductDAO();
        Products a = dao.getProductById("OP_FIND3PRO");
        List<Storage> st = dao.getStorageById("AP_13PRO");
        List<Products> pd = dao.getAll();
        for (Storage storage : st) {
            System.out.println(storage.getId());
        }
        
//        for (Products products : pd) {
//            System.out.println(products.getName());
//        }
//        System.out.println(a.getName());
    }
}
