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

import com.gevam.gems.tubes.model.Barang;
import com.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */
public class ControllerBarang {
    
    Scanner scan = new Scanner(System.in);
    ConnectionManager koneksi = new ConnectionManager();
    Connection con = koneksi.logOn();
    
    public boolean tambahBarang(String namaBarang, String jenis, int harga, String merk, String warna, int garansi, int stok){
        String query = "INSERT INTO barang (namaBarang, jenis, harga, merk, warna, garansi, stok) " +
                   "VALUES ('" + namaBarang + "', '" + jenis + "', " + harga + ", '" + merk + "', '" + warna + "', " + garansi + ", " + stok + ")";
    try {
        Statement stm = con.createStatement();
        stm.executeUpdate(query);
        return true; 
    } catch (SQLException ex) {
        System.out.println(ex.toString());
        return false; 
        }
    }
    
    public List<Barang> tampilkanBarang(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setId(rs.getInt("id"));
                barang.setNamaBarang(rs.getString("namaBarang"));
                barang.setJenis(rs.getString("jenis"));
                barang.setHarga(rs.getInt("harga "));
                barang.setMerk(rs.getString("merk"));
                barang.setWarna(rs.getString("warna"));
                barang.setGaransi(rs.getInt("garansi"));
                barang.setStok(rs.getInt("stok"));
                listBarang.add(barang);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listBarang;
    }
    
     public boolean updateBarang(String newNama, String namaBarang, String jenis , int harga , String merk, String warna , int garansi , int stok, int id){
        String query = "UPDATE barang SET  stok=" + stok +" ,garansi = " + garansi+" ,warna = '"+ warna + "' ,merk = '"+ merk + "' ,harga = "+ harga + ",jenis = '" + jenis + "' ,namaBarang = '"
                + newNama + "' WHERE id = " + id;
        try{
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean deleteBarang(int id) {
    if (con == null) {
        System.out.println("Database connection is not established.");
        return false;
    }
    
    String query = "DELETE FROM barang WHERE id= " + id;
    try {
        Statement stm = con.createStatement();
        int rows = stm.executeUpdate(query);

        // Jika setidaknya ada satu baris yang dihapus, operasi berhasil
        return rows > 0;
    } catch (SQLException ex) {
        System.out.println(ex.toString());
        return false;
    }
    }
    
    public List<Barang> tampilkanBarangSearch(String namaBarang){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where namaBarang = '" + namaBarang + "'");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getInt("id"));
                barang.setNamaBarang(rs.getString("namaBarang"));
                barang.setJenis(rs.getString("jenis"));
                barang.setHarga(rs.getInt("harga"));
                barang.setMerk(rs.getString("merk"));
                barang.setWarna(rs.getString("warna"));
                barang.setGaransi(rs.getInt("garansi"));
                barang.setStok(rs.getInt("stok"));
                
                listBarang.add(barang);
            }
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return listBarang;
    }
    
    
    
}
