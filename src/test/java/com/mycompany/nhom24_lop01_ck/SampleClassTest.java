/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.nhom24_lop01_ck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class SampleClassTest {
    
    public SampleClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of getName method, of class SampleClass.
     */
    @Test
    public void TGS01() {
        System.out.println("getName");
        SampleClass instance = new SampleClass("john doe", -5);
        String expResult = "JOHN DOE";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setName method, of class SampleClass.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        SampleClass instance = null;
//        instance.setName(name);
//    }

//    /**
//     * Test of getAge method, of class SampleClass.
//     */
//    @Test
//    public void testGetAge() {
//        System.out.println("getAge");
//        SampleClass instance = null;
//        int expResult = 0;
//        int result = instance.getAge();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of setAge method, of class SampleClass.
     */
    @Test
    public void TGS02() {
        System.out.println("setAge");
        SampleClass instance = new SampleClass("john doe", -5);
        int expectedAge = 0;
        instance.setAge(expectedAge);
        assertEquals(expectedAge, instance.getAge());
    }

//    /**
//     * Test of calculateYearsUntilRetirement method, of class SampleClass.
//     */
//    @Test
//    public void testCalculateYearsUntilRetirement() {
//        System.out.println("calculateYearsUntilRetirement");
//        int retirementAge = 0;
//        SampleClass instance = null;
//        int expResult = 0;
//        int result = instance.calculateYearsUntilRetirement(retirementAge);
//        assertEquals(expResult, result);
//    }
    
}
