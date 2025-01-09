/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.itenas.oop.gevam.gems.tubes.model.User;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */

public class ControllerDataKasir {
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.logOn();
    
    public boolean insertDataKasir(String Nama,String Username, String Password){
       String query = "INSERT INTO kasir (Nama, Username, Password) "
             + "VALUES ('" + Nama + "', '" + Username + "', " + Password + ")";

        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public List<User> showKasir(){
        List<User> listKasir = new ArrayList<User>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM kasir");
            while (rs.next()) {                
                User usr = new User();
                usr.setID(rs.getInt("ID"));
                usr.setNama(rs.getString("Nama"));
                usr.setUsername(rs.getString("Username"));
                usr.setPassword(rs.getString("Password"));
                listKasir.add(usr);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listKasir;
    }
    
    public boolean updateDataKasir(String newNama, String newUsername, String newPassword, String Nama, String Username, String Password, int ID){
        String query = "UPDATE kasir SET Nama = " + newNama
             + ", Username = '" + newUsername + "', Password = '" + newPassword
             + "' WHERE ID = " + ID;    

        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean hapusDataKasir(int ID) {
    String query = "DELETE FROM kasir WHERE ID = ?";
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
    
    public User cariDataKasir(int ID){
        User kasir = new User();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM kasir WHERE ID = " + ID);
            while (rs.next()){
                kasir.setID(rs.getInt("ID"));
                kasir.setNama(rs.getString("Nama"));
                kasir.setUsername(rs.getString("Username"));
                kasir.setPassword(rs.getString("Password"));
            }
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return kasir;
    }
}
