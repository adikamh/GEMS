package com.gevam.gems.tubes.model;

/**
 *
 * @author GEMS
 */

public class Barang {
    private int id;
    private String namaBarang;
    private String newNama;
    private String jenis;
    private int harga;
    private String merk;
    private String warna;
    private int garansi;
    private int stok;

    public Barang() {
    }

    public Barang(int id, String namaBarang, String newNama, String jenis, int harga, String merk, String warna, int garansi, int stok) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.newNama = newNama;
        this.jenis = jenis;
        this.harga = harga;
        this.merk = merk;
        this.warna = warna;
        this.garansi = garansi;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNewNama() {
        return newNama;
    }

    public void setNewNama(String newNama) {
        this.newNama = newNama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    
                   
}
