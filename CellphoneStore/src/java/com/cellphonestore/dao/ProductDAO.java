/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.dao;

import com.cellphonestore.model.Products;
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
                list.add(new Products(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return list;
    }
    
    public List<Products> getTop4Offset(int amount){
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select * from Products order by pid offset ? rows fetch next 4 rows only";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listTop4.add(new Products(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return listTop4;
    }
    
    public List<Products> getTop4(){
        List<Products> listTop4 = new ArrayList<>();
        String query = "Select top 4 * from Products";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listTop4.add(new Products(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return listTop4;
    }
}
