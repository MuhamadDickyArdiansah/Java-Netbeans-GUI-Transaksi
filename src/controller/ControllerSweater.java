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
import model.Sweater;

/**
 *
 * @author Lenovo
 */
public class ControllerSweater {
    
    
    public List<Sweater> getAllSweater(){
        List<Sweater> lsSweater = new ArrayList<Sweater>();
        String query = "Select * from barang where kode_barang LIKE 'SA-%'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Sweater barang = new Sweater();
                barang.setKode_barang(rs.getString("kode_barang"));
                barang.setNama_barang(rs.getString("nama_barang"));
                barang.setHarga(rs.getDouble("harga"));

                lsSweater.add(barang);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerSweater.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsSweater;
    }
    
    
    public int simpanSweater(Sweater sweater){
        int hasil = 0;
        String query = "INSERT INTO barang (kode_barang, nama_barang, harga) VALUES "
                + "('" + sweater.getKode_barang() + "','" + sweater.getNama_barang() + "','" + sweater.getHarga() + "')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerSweater.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
    public int ubahSweater(Sweater barang){
        int hasil = 0;
        String query = "UPDATE barang SET nama_barang = '" + barang.getNama_barang() + "', harga = '" + barang.getHarga() + "' WHERE kode_barang = '" + barang.getKode_barang() + "'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerSweater.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;
    }
    
    public int hapusSweater(String kode_barang){
        int hasil = 0;
        String query = "DELETE FROM barang WHERE kode_barang = '" + kode_barang + "'";

        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerSweater.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
