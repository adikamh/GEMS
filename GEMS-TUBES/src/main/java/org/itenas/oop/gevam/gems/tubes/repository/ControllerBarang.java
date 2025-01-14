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

import org.itenas.oop.gevam.gems.tubes.model.Barang;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */
public class ControllerBarang {
    
    Scanner scan = new Scanner(System.in);
    ConnectionManager koneksi = new ConnectionManager();
    Connection con = koneksi.logOn();
    
    public boolean tambahBarang(String id, String namaBarang, String jenis, int harga, String merk, String warna, int garansi, int stok) {
    String query = "INSERT INTO barang (id, namaBarang, jenis, harga, merk, warna, garansi, stok) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement pstmt = con.prepareStatement(query)) {
        pstmt.setString(1, id);
        pstmt.setString(2, namaBarang);
        pstmt.setString(3, jenis);
        pstmt.setInt(4, harga);
        pstmt.setString(5, merk);
        pstmt.setString(6, warna);
        pstmt.setInt(7, garansi);
        pstmt.setInt(8, stok);
        pstmt.executeUpdate();
        return true;
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
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
                barang.setId(rs.getString("id"));
                barang.setNamaBarang(rs.getString("namaBarang"));
                barang.setJenis(rs.getString("jenis"));
                barang.setHarga(rs.getInt("harga"));
                barang.setMerk(rs.getString("merk"));
                barang.setWarna(rs.getString("warna"));
                barang.setGaransi(rs.getInt("garansi"));
                barang.setStok(rs.getInt("stok"));
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
     public boolean updateBarang(String idBarang, String newNama, String jenis, int harga, String merk, String warna, int garansi, int stok) {
    String query = "UPDATE barang SET stok = ?, garansi = ?, warna = ?, merk = ?, harga = ?, jenis = ?, namaBarang = ? WHERE id = ?";
    try (PreparedStatement pst = con.prepareStatement(query)) {
        // Set the parameters for the query
        pst.setInt(1, stok);
        pst.setInt(2, garansi);
        pst.setString(3, warna);
        pst.setString(4, merk);
        pst.setInt(5, harga);
        pst.setString(6, jenis);
        pst.setString(7, newNama);
        pst.setString(8, idBarang);  // Ensure that idBarang is the correct type (String or Integer)

        // Log the query and parameters for debugging
        System.out.println("Executing query: " + query);
        System.out.println("Parameters: " + stok + ", " + garansi + ", " + warna + ", " + merk + ", " + harga + ", " + jenis + ", " + newNama + ", " + idBarang);

        // Execute the query and check the number of affected rows
        int rowsAffected = pst.executeUpdate();
        System.out.println("Rows affected: " + rowsAffected);
        return rowsAffected > 0;  // If rows were updated, return true
    } catch (SQLException ex) {
        System.out.println("Error updating barang: " + ex.getMessage());
        return false;
    }
}


    
    public boolean deleteBarang(String id) {
    if (con == null) {
        System.out.println("Database connection is not established.");
        return false;
    }
    
    String query = "DELETE FROM barang WHERE id= '" + id + "'";
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
                barang.setId(rs.getString("id"));
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
    
    public List<Barang> tampilkanBarangFilterjenisLaptop(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Laptop' asc");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getString("id"));
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
    
    public List<Barang> tampilkanBarangFilterjenisHandphone(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Handphone' asc");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getString("id"));
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
    
    public List<Barang> tampilkanBarangFilterjenisVr(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Virtual Reality' asc");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getString("id"));
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
    
    public List<Barang> tampilkanBarangFilterjenisSmartWatch(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Smart Watch' asc");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getString("id"));
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
    
    public List<Barang> tampilkanBarangFilterjenisHeadset(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Headset' asc");
            while (rs.next()){
                Barang barang = new Barang();
                barang.setId(rs.getString("id"));
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
