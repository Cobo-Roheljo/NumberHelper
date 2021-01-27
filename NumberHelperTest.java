/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberhelper1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEvenFalse() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(6);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsEvenTrue() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOddTrue() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(6);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }
    
      @Test
    public void testIsOddFalse() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 12;
        NumberHelper instance = new NumberHelper(n);
        int expResult = 12;
        int result = instance.sum(n);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrimeFalse() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeTrue() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleByTrue() {
        System.out.println("isDivisibleBy");
        int n = 24;
        NumberHelper instance = new NumberHelper(n);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIsDivisibleByFalse() {
        System.out.println("isDivisibleBy");
        int n = 5;
        NumberHelper instance = new NumberHelper(n);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
}
