/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Merchandise;

/**
 *
 * @author Lenovo
 */
public class ControllerMerchandise {
    
 
    public List<Merchandise> getAllMerchandise(){
        List<Merchandise> lsMerchandise = new ArrayList<Merchandise>();
        String query = "Select * from barang where kode_barang LIKE 'MA-%'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Merchandise barang = new Merchandise();
                barang.setKode_barang(rs.getString("kode_barang"));
                barang.setNama_barang(rs.getString("nama_barang"));
                barang.setHarga(rs.getDouble("harga"));

                lsMerchandise.add(barang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerMerchandise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsMerchandise;
    }
    
    public int jumlahMerchandise() {
        int hasil = 0;
        String query = "SELECT COUNT(*) from barang";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            if (rs.next()) {
                hasil = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        conMan.logOff();
        return hasil;
    }
    
    public int simpanMerchandise(Merchandise merchandise){
        int hasil = 0;
        String query = "INSERT INTO barang (kode_barang, nama_barang, harga) VALUES "
                + "('" + merchandise.getKode_barang() + "','" + merchandise.getNama_barang() + "','" + merchandise.getHarga() + "')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMerchandise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
    public int ubahMerchandise(Merchandise merchandise){
        int hasil = 0;
        String query = "UPDATE barang SET nama_barang = '" + merchandise.getNama_barang() + "', harga = '" + merchandise.getHarga() + "' WHERE kode_barang = '" + merchandise.getKode_barang() + "'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMerchandise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;
    }
    
    public int hapusMerchandise(String kode_barang){
        int hasil = 0;
        String query = "DELETE FROM barang WHERE kode_barang = '" + kode_barang + "'";

        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMerchandise.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
