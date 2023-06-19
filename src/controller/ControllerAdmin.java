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
import model.Admin;
import model.User;

/**
 *
 * @author Lenovo
 */
public class ControllerAdmin {
    public List<Admin> getAllAdmin(){
        List<Admin> lsAdmin = new ArrayList<Admin>();
        String query = "Select * from admin";
        String idadmin, username, password, no_telepon;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                idadmin = rs.getString("id_admin");
                username = rs.getString("username");
                password = rs.getString("password");
                no_telepon = rs.getString("no_telepon");

                Admin admin = new Admin(idadmin, username, password, no_telepon);
                lsAdmin.add(admin);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsAdmin;
    }
    
    public int simpanAdmin(Admin admin){
        int hasil = 0;
        String query = "INSERT INTO admin (id_admin, username, password, no_telepon) VALUES "
                + "('" + admin.getIdadmin() + "','" + admin.getUsername() + "','" + admin.getPassword() + "','" + admin.getNo_telpon() + "')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
    
}
