/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
import App.Model.User;
import App.Model.book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author sinic
 */
public class BookDao {

    public ArrayList<book> selectBook() throws Exception {
        String sql = "SELECT * FROM book";
        ArrayList<book> list = new ArrayList<>();
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try (ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        book sach = new book(res.getString(1), res.getString(2), res.getString(3), res.getString(5), res.getBoolean(4));
                        list.add(sach);
                    }
                }
            }
        }
        return list;
    }

    public ArrayList<book> selectBook(String cate, boolean status) throws Exception {
        String sql = "SELECT * FROM book"
                + " where cate = ? AND status = ?";
        ArrayList<book> list = new ArrayList<>();
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, cate);
            pstmt.setBoolean(2, status);
            try (ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        book sach = new book(res.getString(1), res.getString(2), res.getString(3), res.getString(5), res.getBoolean(4));
                        list.add(sach);
                    }
                }
            }
        }
        return list;
    }

    public ArrayList<book> selectBook(String idBook) throws Exception {
        String sql = "SELECT * from Book"
                + " where idBook = ?";
        ArrayList<book> list = new ArrayList<>();
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idBook);
            try (ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        book sach = new book(res.getString(1), res.getString(2), res.getString(3), res.getString(5), res.getBoolean(4));
                        list.add(sach);
                    }
                }
            }
        }
        return list;
    }

    public void thuesach(String idBook, String user) throws Exception {
        String sql = "UPDATE book"
                + " SET user = ?, status = true"
                + " WHERE idBook = ?";
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, user);
            pstmt.setString(2, idBook);
            pstmt.execute();
        }
    }

    public void huythuesach(String idBook) throws Exception {
        String sql = "UPDATE book"
                + " SET user = null, status = false"
                + " WHERE idBook = ?";
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idBook);
            pstmt.execute();
        }
    }

    public book checkidBook(String id) throws Exception {
        String sql = "SELECT * from book "
                + " WHERE idBook=?";
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, id);
            try (ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        book book = new book(res.getString(1), res.getString(2), res.getString(3), res.getString(5), res.getBoolean(4));
                        return book;
                    }
                }
            }
        }
        return null;
    }

    public book checkUser(String user) throws Exception {
        String sql = "SELECT * from book "
                + " WHERE user=?";
        try (Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, user);
            try (ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        book book = new book(res.getString(1), res.getString(2), res.getString(3), res.getString(5), res.getBoolean(4));
                        return book;
                    }
                }
            }
        }
        return null;
    }
}
