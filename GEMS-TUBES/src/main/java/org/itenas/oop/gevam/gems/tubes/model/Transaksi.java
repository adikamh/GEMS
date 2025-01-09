/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.gevam.gems.tubes.model;

/**
 *
 * @author ADIKA
 */
public class Transaksi {
    private int idTransaksi;
    private String tanggal;
    private String namaCustomer;
    private double totalTransaksi;

    public Transaksi() {
    }

    public Transaksi(int idTransaksi, String tanggal, String namaCustomer, double totalTransaksi) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.namaCustomer = namaCustomer;
        this.totalTransaksi = totalTransaksi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public double getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(double totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }

    @Override
    public String toString() {
        return "Transaksi{idTransaksi=" + idTransaksi + ", tanggal='" + tanggal + '\'' +
               ", namaCustomer='" + namaCustomer + '\'' + ", totalTransaksi=" + totalTransaksi + '}';
    }
}

