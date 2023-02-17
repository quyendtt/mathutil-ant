/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quyendtt.mathutil.main;

import com.quyendtt.mathutil.core.MathUtility;

/**
 *
 * @author Truc Quyen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        testFactorialGivenWrongArgumentThrowsExceptation();
        testFactorialGivenRightArgumentReturnWell();
    }
    
    /* 
    Kiểm thử xemm hàm getF có được viết đúng như thiết kế hong
    Thiết kế: đưa n tử tế từ 0..20 -> tính được n! Đúng như kỳ vọng
              đưa n sai, <0 or > 20, chửi
    Ta phải giả lập các cách dùng của user 
    Mỗi cách xài lfa 1 test case
    */
    
    public static void testFactorialGivenRightArgumentReturnWell() {
        
        /* 
        Test case #1: Test getF() with n = 0;
                      Expected value: 1
        */
        
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        //so sánh expected vs. acual
        
        System.out.println("Test " + n + "!: expected: " + expectedValue + ""
                + "| actual: " + actualValue);
        
        /* 
        Test case #2: Test getF() with n = 1;
                      Expected value: 1
        */
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected: " + expectedValue + ""
                + "| actual: " + actualValue);
        
        /* 
        Test case #3: Test getF() with n = 2;
                      Expected value: 2
        */
        System.out.println("Test 2!: expected: 2"
                            + "| actual: " + MathUtility.getFactorial(2));
        
        /* 
        Test case #4: Test getF() with n = 2;
                      Expected value: 2
        */
        System.out.println("Test 3!: expected: 6"
                            + "| actual: " + MathUtility.getFactorial(3));
        
        /* 
        Test case #4: Test getF() with n = 2;
                      Expected value: 2
        */
        System.out.println("Test 5!: expected: 120"
                            + "| actual: " + MathUtility.getFactorial(5));
    }
    
    // Kiểm thử xem hàm getF có chửi hay hông nếu đưa sai n
    public static void testFactorialGivenWrongArgumentThrowsExceptation() {
        
        /* 
        Test case #6: Test getF() with n = -1;
                      Expected value: 1 câu chửi
        */
        System.out.println("Test -1!: expected: an illegal argumnet exception is thrown!"
                + " | actual ???");
        MathUtility.getFactorial(-1);
    }
}
