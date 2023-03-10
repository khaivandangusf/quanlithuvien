/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
import App.Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sinic
 */
public class UserDao {
    public User checkLogin(String acc, String passWord) throws Exception {
        String sql = "SELECT * from Person "
                + " WHERE user=? AND password=?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, acc);
            pstmt.setString(2, passWord);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while(res.next()) {
                        User user = new User(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
                        return user;
                    }
                }
            }
        }
        return null;
    }
    public User checkSignUp(String acc) throws Exception {
        String sql = "SELECT * from Person "
                + " WHERE user=?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, acc);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while(res.next()) {
                        User user = new User(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),"Thành viên");
                        return user;
                    }
                }
            }
        }
        return null;
    }

    public void Singup(String acc, String fullName, String phoneNumber, String passWord, String genDer, String position) throws Exception {
        String sql = "INSERT INTO Person VALUES "
                + "(?,?,?,?,?,?)";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fullName);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, genDer);
            pstmt.setString(4, acc);
            pstmt.setString(5, passWord);
            pstmt.setString(6, position);
            pstmt.execute();  
        }
    }
}
