/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaperLibrary.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Informatica
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private int codEditorial;
    private int price;
    private Date registry;
    private String editorialName;

    public Book(int id, String title, String author, int codEditorial, int price, Date registry, String editorialName) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.codEditorial = codEditorial;
        this.price = price;
        this.registry = registry;
        this.editorialName = editorialName;
    }

    public Book() {
    }
       
    public ArrayList<Book> getBooks(){
        ArrayList<Book> output = new ArrayList<>();
        String query = "Select id, titulo, autor, cod_editorial, fecha_registro,"
                + " precio, (Select editorial from Editorial where Editorial.id = "
                + "Libro.cod_editorial) As NombreEditorial from libro";
        try {
            PreparedStatement ps = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                output.add(new Book(
                        rs.getInt("id"), 
                        rs.getString("titulo"), 
                        rs.getString("autor"), 
                        rs.getInt("cod_editorial"), 
                        rs.getInt("precio"), 
                        rs.getDate("fecha_registro"), 
                        rs.getString("NombreEditorial")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
    
    public ArrayList<Book> getBooksByEditorial(int editorialCode){
        ArrayList<Book> output = new ArrayList<>();
        String query = "Select id, titulo, autor, cod_editorial, fecha_registro,"
                + " precio, (Select editorial from Editorial where Editorial.id "
                + "= Libro.cod_editorial) As NombreEditorial from libro WHERE "
                + "cod_editorial=?";
        try {
            PreparedStatement ps = DbConnection.getConnection().prepareStatement(query);
            ps.setInt(1, editorialCode);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                output.add(new Book(
                        rs.getInt("id"), 
                        rs.getString("titulo"), 
                        rs.getString("autor"), 
                        rs.getInt("cod_editorial"), 
                        rs.getInt("precio"), 
                        rs.getDate("fecha_registro"), 
                        rs.getString("NombreEditorial")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
    
    public boolean createBook(Book book){
        try {
            String query = "INSERT INTO LIBRO (ID, TITULO, AUTOR, cod_editorial, "
                    + "fecha_registro, precio) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = DbConnection.getConnection().prepareStatement(query);
            ps.setInt(1, book.getId());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setInt(4, book.getCodEditorial());
            ps.setString(5,  "2018-11-08");
            ps.setInt(6, book.getPrice());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String getEditorialName() {
        return editorialName;
    }

    public void setEditorialName(String editorialName) {
        this.editorialName = editorialName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getRegistry() {
        return registry;
    }

    public void setRegistry(Date registry) {
        this.registry = registry;
    }                
}
