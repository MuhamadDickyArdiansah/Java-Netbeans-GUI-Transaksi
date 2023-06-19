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
import model.Jersey;

/**
 *
 * @author Lenovo
 */
public class ControllerJersey {
    public List<Jersey> getAllJersey(){
        List<Jersey> lsJersey = new ArrayList<Jersey>();
        String query = "Select * from barang where kode_barang LIKE 'JA-%'";
        String kode_barang, nama_barang;
        double harga;
        int jumlah;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                kode_barang = rs.getString("kode_barang");
                nama_barang = rs.getString("nama_barang");
                harga = rs.getDouble("harga");

                Jersey jersey = new Jersey(kode_barang, nama_barang, harga);
                lsJersey.add(jersey);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerJersey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsJersey;
    }
    
    
    public int simpanJersey(Jersey jersey){
        int hasil = 0;
        String query = "INSERT INTO barang (kode_barang, nama_barang, harga) VALUES "
                + "('" + jersey.getKode_barang() + "','" + jersey.getNama_barang() + "','" + jersey.getHarga() + "')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerJersey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
    public int ubahJersey(Jersey jersey){
        int hasil = 0;
        String query = "UPDATE barang SET nama_barang = '" + jersey.getNama_barang() + "', harga = '" + jersey.getHarga() + "' WHERE kode_barang = '" + jersey.getKode_barang() + "'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerJersey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;
    }
    
    public int hapusJersey(String kode_barang){
        int hasil = 0;
        String query = "DELETE FROM barang WHERE kode_barang = '" + kode_barang + "'";

        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerJersey.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
