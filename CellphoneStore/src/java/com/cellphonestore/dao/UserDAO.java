/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.dao;

import com.cellphonestore.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServlet;
/**
 *
 * @author hongd
 */
public class UserDAO extends HttpServlet{
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    
    public Users login(String user, String pass){
        String query = "Select * from Users where username = ? and password = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {                
                return new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
        } catch (Exception e) {
            System.out.println("Connection error! "+e);
        }
        return null;
    }
    
    public Users register(String firstname, String lastname, String email, String username, String password ){
        String query = "Insert into Users(firstname, lastname, email, username, [password],[role])\n"+
                "values(?,?,?,?,?,?)";
        
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setNString(1, firstname);
            ps.setNString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, username);
            ps.setString(5, password);
            ps.setString(6, "us");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Connection error! " + e);
        }
        return null;
    }
    
    public boolean findUserByUsername(String user){
        String query = "select * from Users\n"
                + "where user = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
            System.out.println("Connection error! " + e);
        }
        return false;
    }
    
    
    
    public void updateProfile(Users a){
        String query = "update Users set firstname = ?, lastname = ?, email = ?, phone = ? ,address= ?, birthday = ? where username = ?";
        try {
            conn = new com.cellphonestore.context.DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setNString(1, a.getFirstname());
            ps.setNString(2, a.getLastname());
            ps.setString(3, a.getEmail());
            ps.setString(4, a.getPhone());
            ps.setNString(5, a.getAddress());
            ps.setDate(6, a.getBirthday());
            ps.setString(7, a.getUsername());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
