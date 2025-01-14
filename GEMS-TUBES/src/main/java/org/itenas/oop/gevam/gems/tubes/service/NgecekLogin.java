/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.service;

import java.sql.SQLException;

/**
 *
 * @author ADIKA
 */
public interface NgecekLogin {
    boolean checkCredentials(String username, String password, String tableName) throws SQLException;
}   
