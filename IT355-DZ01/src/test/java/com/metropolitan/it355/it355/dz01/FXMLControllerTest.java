/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.it355.dz01;

import com.metropolitan.it355.it355.dz01.FXMLController;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Srdjan@NIGHTSHADOW
 */
public class FXMLControllerTest {

    /**
     * Test of is palindrome method, of class FXMLController.
     */
    @Test
    public void testReverse() {
        System.out.println("Is palindrome");
        String source = "mom";
        FXMLController instance = new FXMLController();
        String expResult = "jeste";
        String result = instance.isPalindrom(source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}