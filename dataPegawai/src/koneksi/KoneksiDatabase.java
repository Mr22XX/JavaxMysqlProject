/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Mr22xx
 */
public class KoneksiDatabase {
    Connection cn;
    public static Connection connect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dataPegawai", "root", "");
        return cn;
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}
