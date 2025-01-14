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
    
    public List<Barang> tampilkanBarangFilterjenisLaptop(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Laptop' asc");
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
    
    public List<Barang> tampilkanBarangFilterjenisHandphone(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Handphone' asc");
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
    
    public List<Barang> tampilkanBarangFilterjenisVr(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Virtual Reality' asc");
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
    
    public List<Barang> tampilkanBarangFilterjenisSmartWatch(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Smart Watch' asc");
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
    
    public List<Barang> tampilkanBarangFilterjenisHeadset(){
        List<Barang> listBarang= new ArrayList<Barang>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM barang  where  jenis  like '%Headset' asc");
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
    
 
    public List<Barang> tampilkanNamaBarangLaptop(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis  'Laptop' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
    public List<Barang> tampilkanNamaBarangHandphone(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis = 'Handhphone' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
    public List<Barang> tampilkanNamaBarangVR(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis = 'Virtual Reality' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
    public List<Barang> tampilkanNamaBarangHeadset(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis =  ' Headset' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
    public List<Barang> tampilkanNamaBarangSW(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis = 'Smart Watch' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
    
        public List<Barang> tampilkanNamaBarangSearch(String namaBarang){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang WHERE jenis like '% "+ namaBarang +"' asc");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
   
public List<Barang> tampilkanNamaBarang(){
        List<Barang> listBarang = new ArrayList<Barang>();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT namaBarang FROM barang");
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setNamaBarang(rs.getString("namaBarang"));
                
                listBarang.add(barang);
            }
            System.out.println("data berhasil diambil");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("data gagal diambil");
        }
        return listBarang;
    }
}