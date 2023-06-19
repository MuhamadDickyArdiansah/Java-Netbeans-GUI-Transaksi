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
import model.Barang;
import model.Jersey;
import model.Merchandise;
import model.Sweater;

/**
 *
 * @author Lenovo
 */
public class ControllerBarang {

    public List<Barang> getAllBarang() {
        List<Barang> lsBarang = new ArrayList<Barang>();
        ControllerJersey cmdJersey = new ControllerJersey();
        ControllerSweater cmdSweater = new ControllerSweater();
        ControllerMerchandise cmdMerchandise = new ControllerMerchandise();
        // Mendapatkan data dari kelas Jersey
        List<Jersey> lsJersey = cmdJersey.getAllJersey();
        lsBarang.addAll(lsJersey);

        // Mendapatkan data dari kelas Sweater
        List<Sweater> lsSweater = cmdSweater.getAllSweater();
        lsBarang.addAll(lsSweater);

        // Mendapatkan data dari kelas Merchandise
        List<Merchandise> lsMerchandise = cmdMerchandise.getAllMerchandise();
        lsBarang.addAll(lsMerchandise);

        return lsBarang;
    }
    
    public int jumlahBarang() {
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

}
