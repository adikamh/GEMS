/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gevam.gems.tubes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.gevam.gems.tubes.model.User;
import com.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */

public class ControllerDataAdmin {
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.logOn();
    
    public boolean insertDataAdmin(String Nama,String Username, String Password){
       String query = "INSERT INTO admin (Nama, Username, Password) "
             + "VALUES ('" + Nama + "', '" + Username + "', '" + Password + "')";

        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public List<User> showAdmin(){
        List<User> listAdmin = new ArrayList<User>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM admin");
            while (rs.next()) {                
                User usr = new User() {};
                usr.setID(rs.getInt("ID_admin"));
                usr.setNama(rs.getString("Nama"));
                usr.setUsername(rs.getString("Username"));
                usr.setPassword(rs.getString("Password"));
                listAdmin.add(usr);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listAdmin;
    }
    
    public boolean updateDataAdmin(String newNama, String newUsername, String newPassword, String Nama, String Username, String Password, int ID){
        String query = "UPDATE admin SET Nama = " + newNama
             + ", Username = '" + newUsername + "', Password = '" + newPassword
             + "' WHERE ID_admin = " + ID;    

        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean hapusDataAdmin(int ID) {
    String query = "DELETE FROM admin WHERE ID_admin = ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, ID);
        pstmt.executeUpdate();
        return true;
    } catch (SQLException ex) {
        System.out.println(ex.toString());
        return false;
        }
    }
    
    public User cariDataAdmin(String Nama){
    User Admin = null;
    String query = "SELECT * FROM admin WHERE Nama = ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, Nama);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            Admin = new User() {};  // Create a new User instance only if a record is found
            Admin.setID(rs.getInt("ID_admin"));
            Admin.setNama(rs.getString("Nama"));
            Admin.setUsername(rs.getString("Username"));
            Admin.setPassword(rs.getString("Password"));
        }
    } catch (SQLException ex){
        System.out.println(ex.toString());
    }
    return Admin;
}
}
