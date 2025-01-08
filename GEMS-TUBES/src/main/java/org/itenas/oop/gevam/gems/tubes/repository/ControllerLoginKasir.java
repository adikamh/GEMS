/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */
public class ControllerLoginKasir {

    private ConnectionManager conManKasir;
    private Connection connKasir;
    Statement stmtKasir;
    ResultSet rsKasir;
    
    public int Login(String userKasir, String pwdKasir){
        int statKasir = 0;
        conManKasir = new ConnectionManager();
        connKasir = conManKasir.logOn();
        try{
            Statement stmKasir = connKasir.createStatement();
            ResultSet rsKasir = stmKasir.executeQuery("SELECT * FROM kasir where id_kasir = '"
            + userKasir + "' and pass_kasir ='" + pwdKasir + "'");
            while(rsKasir.next()) {
                if (userKasir.equals(rsKasir.getString("id_kasir"))
                        && pwdKasir.equals(rsKasir.getString("pass_kasir"))){
                    statKasir = 1;
                }else{
                    statKasir = 0;
                    
                }
            }
            return statKasir;
        } catch (SQLException ex) {
            return statKasir;
        }
    }
    
    public int registerKasir(String userKasir, String pwdKasir){
        int statKasir = 0;
        String query = "INSERT INTO  `supermarket_is`.`kasir` (`id_kasir`, `pass_kasir`) VALUES ('"+userKasir+"','"+pwdKasir+"');";
        conManKasir = new ConnectionManager();
        connKasir = conManKasir.logOn();
        try{
        stmtKasir = connKasir.createStatement();
        stmtKasir.executeUpdate(query);
        conManKasir.logOff();
    } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
    }
        return statKasir;
    }
}
