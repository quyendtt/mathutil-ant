/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quyendtt.mathutil.core;

/**
 *
 * @author Truc Quyen
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 21) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n ==0 || n == 1) 
            return 1;
        
        //sống sót tới đây, sure n= 2..20
        long product = 1; 
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}
