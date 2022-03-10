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

//    Get data function
    
    public List<Products> getAll() {
        List<Products> list = new ArrayList<>();
        String query = "select * from Products";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return list;
    }

    public List<Products> getTop4Offset(int amount) {
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select * from Products order by id desc offset ? rows fetch next 4 rows only";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            rs = ps.executeQuery();
            while (rs.next()) {
                listTop4.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return listTop4;
    }
    
    public List<Products> paging(int check){
        List<Products> paging = new ArrayList<>();
        String query = "Select * from Products order by id desc offset ? rows fetch next 4 rows only";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (check - 1)*4);
            rs = ps.executeQuery();
            while (rs.next()) {
                paging.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return paging;
    }

    public List<Products> getTop4() {
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select top 4 * from Products order by id desc";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listTop4.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return listTop4;
    }

    public Products getProductById(String id) {
        String query = "Select * from Products where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return null;
    }
    
    public Products getProductById2(int id) {
        String query = "Select * from Products where id = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return null;
    }

    public ProductDetails getInfoById(String id) {
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
            System.out.println("Error" + e);
        }
        return null;
    }

    public List<Color> getColorById(String id) {
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
            System.out.println("Error" + e);
        }
        return color;
    }

    public List<Storage> getStorageById(String id) {
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
            System.out.println("Error" + e);
        }
        return storage;
    }

    public List<Products> search(String key) {
        List<Products> list = new ArrayList<>();
        String query = "Select * from Products where name like ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + key + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return list;
    }

    public List<Products> searchByPrice(int min_raw, int max_raw){
        List<Products> list = new ArrayList<>();
        String query = "Select * from Products where price between ? and ?";
        try {
            int min = min_raw * 1000000;
            int max = max_raw * 1000000;
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, min);
            ps.setInt(2, max);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return list;
    }
    
    public List<Products> productByCid(int key) {
        List<Products> list = new ArrayList<>();
        String query = "Select * from Products where cid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, key);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return list;
    }
    
    
//    Add function
    

    public Products addProduct(Products products) {
        String query = "INSERT INTO Products(pid,cid,[name],[image],price,[description],[amount])\n"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, products.getPid());
            ps.setInt(2, products.getCid());
            ps.setNString(3, products.getName());
            ps.setNString(4, products.getImage());
            ps.setInt(5, products.getPrice());
            ps.setNString(6, products.getDescription());
            ps.setInt(7, products.getAmount());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return null;
    }

    public ProductDetails addPDetail(ProductDetails pd) {
        String query = "Insert into ProductDetails(pid,screen,os,rearcam,frontcam,soc,ram,sim,battery)\n"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pd.getPid());
            ps.setString(2, pd.getScreen());
            ps.setString(3, pd.getOs());
            ps.setString(4, pd.getRearcam());
            ps.setString(5, pd.getFrontcam());
            ps.setString(6, pd.getSoc());
            ps.setString(7, pd.getRam());
            ps.setNString(8, pd.getSim());
            ps.setNString(9, pd.getBattery());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return null;
    }

    public Color addColor(Color c) {
        String query = "Insert into ColorDetails(pid, color)\n"
                + "values(?,?)";

        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getPid());
            ps.setNString(2, c.getColor());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public Storage addStorage(Storage st) {
        String query = "Insert into StorageDetails(pid,storage)\n"
                + "values(?,?)";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, st.getPid());
            ps.setString(2, st.getStorage());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    
//    Delete function
    
    
    public void deleleProductByPid(String pid){
        String query = "Delete from Products where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void deletePDetailsByPid(String pid){
        String query = "Delete from ColorDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void deleteColorDetailByPid(String pid){
        String query = "Delete from ProductDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void deleteStorageDetailByPid(String pid){
        String query = "Delete from StorageDetails where pid = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void deleteColorById(int id){
        String query = "Delete from ColorDetails where id = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void deleteStorageById(int id){
        String query = "Delete from StorageDetails where id = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public static void main(String[] args) {
        com.cellphonestore.dao.ProductDAO dao = new ProductDAO();
        Products a = dao.getProductById("OP_FIND3PRO");
        List<Storage> st = dao.getStorageById("AP_13PRO");
        List<Products> pd = dao.paging(1);
        for (Products storage : pd) {
            System.out.println(storage.getName());
        }

//        for (Products products : pd) {
//            System.out.println(products.getName());
//        }
//        System.out.println(a.getName());
    }
}
