/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integral;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class ClsPolinomioTest {
    
    public ClsPolinomioTest() {
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
     * Test of grado method, of class ClsPolinomio.
     */
    @Test
    public void testGrado_int() {
        System.out.println("grado");
        int valor = 0;
        ClsPolinomio instance = null;
        instance.grado(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of a method, of class ClsPolinomio.
     */
    @Test
    public void testA_doubleArr() {
        System.out.println("a");
        double[] coef = null;
        ClsPolinomio instance = null;
        instance.a(coef);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of a method, of class ClsPolinomio.
     */
    @Test
    public void testA_int_float() {
        System.out.println("a");
        int i = 0;
        float valor = 0.0F;
        ClsPolinomio instance = null;
        instance.a(i, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grado method, of class ClsPolinomio.
     */
    @Test
    public void testGrado_0args() {
        System.out.println("grado");
        ClsPolinomio instance = null;
        int expResult = 0;
        int result = instance.grado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of a method, of class ClsPolinomio.
     */
    @Test
    public void testA_0args() {
        System.out.println("a");
        ClsPolinomio instance = null;
        double[] expResult = null;
        double[] result = instance.a();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of a method, of class ClsPolinomio.
     */
    @Test
    public void testA_int() {
        System.out.println("a");
        int i = 0;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.a(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Horner method, of class ClsPolinomio.
     */
    @Test
    public void testHorner() {
        System.out.println("Horner");
        float valx = 0.0F;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.Horner(valx);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of izquierdo method, of class ClsPolinomio.
     */
    @Test
    public void testIzquierdo() {
        System.out.println("izquierdo");
        float a = 0.0F;
        float b = 0.0F;
        int n = 0;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.izquierdo(a, b, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of derecho method, of class ClsPolinomio.
     */
    @Test
    public void testDerecho() {
        System.out.println("derecho");
        float a = 0.0F;
        float b = 0.0F;
        int n = 0;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.derecho(a, b, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trapecio method, of class ClsPolinomio.
     */
    @Test
    public void testTrapecio() {
        System.out.println("trapecio");
        float a = 0.0F;
        float b = 0.0F;
        int n = 0;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.trapecio(a, b, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simpson method, of class ClsPolinomio.
     */
    @Test
    public void testSimpson() {
        System.out.println("simpson");
        float a = 0.0F;
        float b = 0.0F;
        int n = 0;
        ClsPolinomio instance = null;
        double expResult = 0.0;
        double result = instance.simpson(a, b, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ver method, of class ClsPolinomio.
     */
    @Test
    public void testVer() {
        System.out.println("ver");
        ClsPolinomio instance = null;
        String expResult = "";
        String result = instance.ver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
