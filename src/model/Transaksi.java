/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Transaksi {
    private String id_transaksi;
    private String waktu;
    private String username;
    private String kode_barang;
    private String nama_barang;
    private int jumlah;
    private Double total_harga;

    public Transaksi() {
    }

    public Transaksi( String waktu, String username, String kode_barang, String nama_barang, int jumlah, Double total_harga) {
       
        this.waktu = waktu;
        this.username = username;
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.jumlah = jumlah;
        this.total_harga = total_harga;
    }

   
    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Double total_harga) {
        this.total_harga = total_harga;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "id_transaksi=" + id_transaksi + ", waktu=" + waktu + ", username=" + username + ", kode_barang=" + kode_barang + ", nama_barang=" + nama_barang + ", jumlah=" + jumlah + ", total_harga=" + total_harga + '}';
    }
    
}
