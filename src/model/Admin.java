/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Admin {
    private String idadmin;
    private String username;
    private String password;
    private String no_telepon;

    public Admin() {
    }

    public Admin(String idadmin, String username, String password, String no_telpon) {
        this.idadmin = idadmin;
        this.username = username;
        this.password = password;
        this.no_telepon = no_telpon;
    }

    public String getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(String idadmin) {
        this.idadmin = idadmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_telpon() {
        return no_telepon;
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telepon = no_telpon;
    }

    @Override
    public String toString() {
        return "admin{" + "idadmin=" + idadmin + ", username=" + username + ", password=" + password + ", no_telpon=" + no_telepon + '}';
    }
    
    
}
