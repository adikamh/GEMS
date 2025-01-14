/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADIKA
 */
public class ConnectionManager {
    
    private Connection koneksi;
    private String url = "jdbc:mysql://localhost:3306/gems"; // mys1l kalian
    private String Driver = "com.mysql.cj.jdbc.Driver"; // driver kalian
    private String Username = "root";   // id kalian
    private String Password = "basdat24"; //pw kalian
    
    public Connection logOn(){
        if(koneksi == null) {
            try {
                Class.forName(Driver).newInstance();
                koneksi = DriverManager.getConnection(url,Username,Password);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return koneksi;
    }
    
    public Connection logOff() {
        try {
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
    }
        return koneksi;
    }
}
