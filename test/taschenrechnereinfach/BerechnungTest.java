/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris Kerber
 */
public class BerechnungTest {
    
    public BerechnungTest() {
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
     * Test of rechnetAus method, of class Berechnung.
     */
    @Test
    public void testAddition() {
        System.out.println("testAddition");
        double x = 4.0;
        double y = 5.0;
        String op = "+";
        Berechnung instance = new Berechnung();
        double expResult = 9.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }
    
    
    @Test
    public void testSubtraktion() {
        System.out.println("testSubtraktion");
        double x = 4.0;
        double y = 5.0;
        String op = "-";
        Berechnung instance = new Berechnung();
        double expResult = -1.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }
    
    
    @Test
    public void testMutliplikation() {
        System.out.println("testMutliplikation");
        double x = 4.0;
        double y = 4.0;
        String op = "*";
        Berechnung instance = new Berechnung();
        double expResult = 16.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivision() {
        System.out.println("testDivision");
        double x = 10.0;
        double y = 2.0;
        String op = "/";
        Berechnung instance = new Berechnung();
        double expResult = 5.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivisionDurchNull() {
        System.out.println("testDivisionDurchNull");
        double x = 4.0;
        double y = 0.0;
        String op = "/";
        Berechnung instance = new Berechnung();
        double expResult = 0.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }  
    
    @Test
    public void testFalscherOperator() {
        System.out.println("testFalscherOperator");
        double x = 4.0;
        double y = 3.0;
        String op = "r";
        Berechnung instance = new Berechnung();
        double expResult = -1.0;
        double result = instance.rechnetAus(x, y, op);
        assertEquals(expResult, result, 0.0);
    }  
}
