
package org.itenas.oop.gevam.gems.tubes.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;
import org.itenas.oop.gevam.gems.tubes.view.viewRiwayatTransaksi;


public class ControllerRiwayatTransaksi {
    
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.logOn();
    
    public void tampilkanSemuaTransaksi() {
        String query = "SELECT d.id_detail, t.id_transaksi, b.id, d.jumlah, d.harga_peritem, d.totalHarga FROM detail_transaksi d"
                + "INNER JOIN transaksi t ON d.id_transaksi = t.id_transaksi INNER JOIN barang b"
                + "ON d.id = b.id";
        try (Statement stmt = con.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Daftar Transaksi:");
            while (rs.next()) {
                int idDetail = rs.getInt("id_detail");
                int idTransaksi = rs.getInt("id_transaksi");
                int Id = rs.getInt("id");
                int Jumlah = rs.getInt("jumlah");
                double hargaPeritem = rs.getDouble("harga_peritem");
                double totalHarga = rs.getDouble("totalHarga");

                System.out.printf("id_detail: %d, id_transaki: %d, id: %d, jumlah: %d, harga_peritem: %.2f, totalHarga: %.2f\n", 
                                  idDetail, idTransaksi, Id, Jumlah, hargaPeritem, totalHarga);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
}
