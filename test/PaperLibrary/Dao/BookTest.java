/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaperLibrary.Dao;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Informatica
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBooks method, of class Book.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        Book instance = new Book();
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksByEditorial method, of class Book.
     */
    @Test
    public void testGetBooksByEditorial() {
        System.out.println("getBooksByEditorial");
        int editorialCode = 0;
        Book instance = new Book();
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = instance.getBooksByEditorial(editorialCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBook method, of class Book.
     */
    @Test
    public void testCreateBook() {
        System.out.println("createBook");
        Book book = new Book(4, "ya nos vamo", "Jean Paul", 1, 1000, new Date(), "Edi Java Doc");
        Book instance = new Book();
        boolean expResult = true;
        boolean result = instance.createBook(book);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEditorialName method, of class Book.
     */
    @Test
    public void testGetEditorialName() {
        System.out.println("getEditorialName");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getEditorialName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditorialName method, of class Book.
     */
    @Test
    public void testSetEditorialName() {
        System.out.println("setEditorialName");
        String editorialName = "";
        Book instance = new Book();
        instance.setEditorialName(editorialName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Book.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Book.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Book instance = new Book();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Book instance = new Book();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        Book instance = new Book();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodEditorial method, of class Book.
     */
    @Test
    public void testGetCodEditorial() {
        System.out.println("getCodEditorial");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getCodEditorial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEditorial method, of class Book.
     */
    @Test
    public void testSetCodEditorial() {
        System.out.println("setCodEditorial");
        int codEditorial = 0;
        Book instance = new Book();
        instance.setCodEditorial(codEditorial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Book.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Book.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Book instance = new Book();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistry method, of class Book.
     */
    @Test
    public void testGetRegistry() {
        System.out.println("getRegistry");
        Book instance = new Book();
        Date expResult = null;
        Date result = instance.getRegistry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistry method, of class Book.
     */
    @Test
    public void testSetRegistry() {
        System.out.println("setRegistry");
        Date registry = null;
        Book instance = new Book();
        instance.setRegistry(registry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
