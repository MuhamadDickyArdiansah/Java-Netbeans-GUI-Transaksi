/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.User;
import db.ConnectionManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ControllerUser {
    public List<User> getAllUser(){
        List<User> lsUser = new ArrayList<User>();
        String query = "Select * from user";
        String iduser, nama, notelp, username, password;
        Double saldo;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                User user = new User();
                user.setIduser(rs.getInt("id_user"));
                user.setNama(rs.getString("nama"));
                user.setNotelp(rs.getString("no_telepon"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setSaldo(rs.getDouble("saldo"));
//                iduser = rs.getString("id_user");
//                nama = rs.getString("nama");
//                email = rs.getString("email");
//                notelp = rs.getString("no_telepon");
//                username = rs.getString("username");
//                password = rs.getString("password");
                
//                User user = new User( nama, email, notelp, username, password);
                lsUser.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsUser;
    }
    
    public int jumlahUser() {
        int hasil = 0;
        String query = "SELECT COUNT(*) from user";
        
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
    
    public int loginUser(String username, String password) {
        int hasil = 0;
        String query = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";

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
    
    
    public int simpanUser(User user){
        int hasil = 0;
         String query = "INSERT INTO user (nama, no_telepon, username, password, saldo) VALUES "
                + "('" + user.getNama() + "','" + user.getNotelp() + "','" + user.getUsername() + "','" + user.getPassword() +"', 0)";
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
    
    public int ubahUser(User user){
        int hasil = 0;
        String query = "UPDATE user SET nama = '" + user.getNama() + "', no_telepon = '" + user.getNotelp() + "', username = '" + user.getUsername() + "', password = '" + user.getPassword() + "' WHERE id_user = '" + user.getIduser() + "'";
        
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
    
    public int hapusUser(int iduser){
        int hasil = 0;
        String query = "DELETE FROM user WHERE id_user = '" + iduser + "'";

        
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
    
    public int tambahSaldo(User user, double amount) {
        int hasil = 0;
        String query = "UPDATE user SET saldo = saldo + " + amount + " WHERE username = '" + user.getUsername() + "'";
        
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
    
    public int kurangSaldo(User user, double amount) {
        int hasil = 0;
        String query = "UPDATE user SET saldo = saldo - " + amount + " WHERE username = '" + user.getUsername() + "'";
        
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
