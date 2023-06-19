/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class User {
    private int iduser;
    private String nama;
    private String notelp;
    private String username;
    private String password;
    private Double saldo;

    public User() {
    }

    public User( String nama, String notelp, String username, String password) {
        
        this.nama = nama;
        this.notelp = notelp;
        this.username = username;
        this.password = password;
        this.saldo = 0.0; // Mengatur saldo sebagai 0 secara default
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
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

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "User{" + "iduser=" + iduser + ", nama=" + nama + ", notelp=" + notelp + ", username=" + username + ", password=" + password + ", saldo=" + saldo + '}';
    }
   
}
