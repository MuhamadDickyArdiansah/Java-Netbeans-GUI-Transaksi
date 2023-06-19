/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public abstract class Barang {
    String kode_barang;

    public Barang() {
    }

    public Barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }
    
    public abstract double hitungHargaFinal();

    @Override
    public String toString() {
        return "barang{" + "kode_barang=" + kode_barang  +  '}';
    }
    
    
}
