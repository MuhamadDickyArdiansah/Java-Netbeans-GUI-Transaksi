/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Merchandise extends Barang{

    private String nama_barang;
    private double harga;

    public Merchandise() {

    }

    public Merchandise(String kode_barang, String nama_barang, double harga) {
        super(kode_barang);
        this.nama_barang = nama_barang;
        this.harga = harga;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
    
    
    public double hitungHargaFinal() {
      
        double diskonAmount = harga * (10.0 / 100);
        
        return diskonAmount;
    }

    @Override
    public String toString() {
        return "Merchandise{" +super.toString() + "nama_barang=" + nama_barang + ", harga=" + harga + '}';
    }

}
