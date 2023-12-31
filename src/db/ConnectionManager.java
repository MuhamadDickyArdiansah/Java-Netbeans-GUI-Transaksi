/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import tugas.besar.*;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author fahmi
 */
public class ConnectionManager {
    // Deklarasi atribut private Connection, String driver, url, username, dan password
    private Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/db_tubes";  // myDB --> nama database 
    private String username = "root";       // user name DMBS
    private String password = "";    // pswd DMBS

    // Method logOn untuk melakukan koneksi ke database
    public Connection logOn(){
        try {
            //Load JDBC Driver
            Class.forName( driver ).newInstance();
            //Buat object Connection
            con = DriverManager.getConnection( url, username, password );
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }

    public void logOff(){
        try {
            //Tutup Koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

    

