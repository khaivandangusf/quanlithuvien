/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Model;


public class book {
    private String idbook, bookName, cate, user;
    private boolean status;

    public book() {
    }
    
    
    public book(String idbook, String bookName, String cate, String user, boolean status) {
        this.idbook = idbook;
        this.bookName = bookName;
        this.cate = cate;
        this.user = user;
        this.status = status;
    }

    public String getIdbook() {
        return idbook;
    }

    public void setIdbook(String idbook) {
        this.idbook = idbook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "book{" + "idbook=" + idbook + ", bookName=" + bookName + ", cate=" + cate + ", user=" + user + ", status=" + status + '}';
    }
    
}
