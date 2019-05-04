/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import xpresspass.pojo.HodPojo;
import xpresspass.pojo.StudentPojo;

/**
 *
 * @author Rahul
 */
public class GatePassHodTest {
    
    public GatePassHodTest() {
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
     * Test of main method, of class GatePassHod.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GatePassHod.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePasses method, of class GatePassHod.
     */
    @Test
    public void testUpdatePasses() {
        System.out.println("updatePasses");
        GatePassHod instance = new GatePassHod();
        instance.updatePasses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasses method, of class GatePassHod.
     */
    @Test
    public void testGetPasses() {
        System.out.println("getPasses");
        HodPojo hPojo = null;
        GatePassHod.getPasses(hPojo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPass method, of class GatePassHod.
     */
    @Test
    public void testPrintPass() {
        System.out.println("printPass");
        StudentPojo sPojo = null;
        GatePassHod instance = new GatePassHod();
        instance.printPass(sPojo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
