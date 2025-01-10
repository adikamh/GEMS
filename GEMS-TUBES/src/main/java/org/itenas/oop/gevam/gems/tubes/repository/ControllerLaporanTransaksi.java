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
import org.itenas.oop.gevam.gems.tubes.model.Transaksi;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;

/**
 *
 * @author ADIKA
 */


public class ControllerLaporanTransaksi {
    
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.logOn();

   public void tampilkanSemuaTransaksi() {
        String query = "SELECT * FROM transaksi";
        try (Statement stmt = con.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Daftar Transaksi:");
            while (rs.next()) {
                int idTransaksi = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String namaCustomer = rs.getString("nama_customer");
                double totalTransaksi = rs.getDouble("total_transaksi");

                System.out.printf("ID: %d, Tanggal: %s, Nama Customer: %s, Total: %.2f\n", 
                                  idTransaksi, tanggal, namaCustomer, totalTransaksi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cariTransaksiById() {
        System.out.print("Masukkan ID Transaksi yang ingin dicari: ");
        int idTransaksi = sc.nextInt();
        String query = "SELECT * FROM transaksi WHERE id_transaksi = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, idTransaksi);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.printf("ID: %d, Tanggal: %s, Nama Customer: %s, Total: %.2f\n",
                                  rs.getInt("id_transaksi"), rs.getString("tanggal"),
                                  rs.getString("nama_customer"), rs.getDouble("total_transaksi"));
            } else {
                System.out.println("Transaksi dengan ID " + idTransaksi + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cariTransaksiByNamaCustomer() {
        System.out.print("Masukkan Nama Customer yang ingin dicari: ");
        sc.nextLine();  // Menghindari masalah dengan input buffer
        String namaCustomer = sc.nextLine();
        String query = "SELECT * FROM transaksi WHERE nama_customer LIKE ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, "%" + namaCustomer + "%");
            ResultSet rs = stmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.printf("ID: %d, Tanggal: %s, Nama Customer: %s, Total: %.2f\n",
                                  rs.getInt("id_transaksi"), rs.getString("tanggal"),
                                  rs.getString("nama_customer"), rs.getDouble("total_transaksi"));
            }
            if (!found) {
                System.out.println("Tidak ada transaksi dengan nama customer '" + namaCustomer + "'.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}