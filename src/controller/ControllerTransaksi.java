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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transaksi;

/**
 *
 * @author Lenovo
 */
public class ControllerTransaksi {
    public List<Transaksi> getAllTransaksi(){
        List<Transaksi> lsTransaksi = new ArrayList<Transaksi>();
        String query = "Select * from transaksi";
        String id_transaksi, waktu, username, kode_barang, nama_barang;
        double total_harga;
        int jumlah;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                id_transaksi = rs.getString("id_transaksi");
                waktu = rs.getString("waktu_transaksi");
                kode_barang = rs.getString("kode_barang");
                nama_barang = rs.getString("nama_barang");
                username = rs.getString("username");
                jumlah = rs.getInt("jumlah");
                total_harga = rs.getDouble("total_harga");
//                Transaksi transaksi = new Transaksi(waktu, username, kode_barang, nama_barang, jumlah, total_harga);
                Transaksi transaksi = new Transaksi();
                transaksi.setId_transaksi(id_transaksi);
                transaksi.setWaktu(waktu);
                transaksi.setUsername(username);
                transaksi.setKode_barang(kode_barang);
                transaksi.setNama_barang(nama_barang);
                transaksi.setJumlah(jumlah);
                transaksi.setTotal_harga(total_harga);
                
                lsTransaksi.add(transaksi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsTransaksi;
    }
    
    public List<Transaksi> getUserTransaksi(String username){
        List<Transaksi> lsTransaksi = new ArrayList<Transaksi>();
        String query = "SELECT * FROM transaksi WHERE username = ?";
        
        String id_transaksi, waktu, kode_barang, nama_barang;
        double total_harga;
        int jumlah;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username); // Mengikat nilai parameter username
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Transaksi transaksi = new Transaksi();
                transaksi.setId_transaksi(rs.getString("id_transaksi"));
                transaksi.setWaktu( rs.getString("waktu_transaksi"));
                transaksi.setKode_barang( rs.getString("kode_barang"));
                transaksi.setNama_barang(rs.getString("nama_barang"));
                transaksi.setUsername( rs.getString("username"));
                transaksi.setJumlah( rs.getInt("jumlah"));
                transaksi.setTotal_harga(rs.getDouble("total_harga"));
                
             
                lsTransaksi.add(transaksi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsTransaksi;
    }
    
    public int jumlahTransaksi() {
        int hasil = 0;
        String query = "SELECT COUNT(*) from transaksi";
        
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
    
    public int simpanTransaksi(Transaksi transaksi){
        int hasil = 0;
        String query = "INSERT INTO transaksi ( waktu_transaksi, username, kode_barang, nama_barang, jumlah, total_harga) VALUES "
                + "('"  + transaksi.getWaktu() + "','" + transaksi.getUsername() + "','" 
                + transaksi.getKode_barang() + "','" + transaksi.getNama_barang() + "','" + transaksi.getJumlah() + "','" 
                + transaksi.getTotal_harga() +"')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
}
