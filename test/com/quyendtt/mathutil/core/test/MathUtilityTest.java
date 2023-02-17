
package com.quyendtt.mathutil.core.test;

import com.quyendtt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    
    // Test hàm getF với n cà chớn
    // Expected: Illegal Argument Exception
    /*
    JUnit 4 ko có hàm assertEquals() cho Exception
    JUnit 5 có hàm assertEquals() cho Exception
    
    dùng chiêu, ko phải assertE()
    để đo lường, lắng nghe xem có ngoại lệ hay ko
    */
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
    }
    
    // Test hàm getF với n đúng
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        /* 
        Test case #1: Test getF() with n = 0;
                      Expected value: 1
        */
         
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        
        Assert.assertEquals(expected, actual);
        
        /* 
        Test case #2: Test getF() with n = 1;
                      Expected value: 1
        */
        
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        /* 
        Test case #3: Test getF() with n = 2;
                      Expected value: 2
        */
        
        n = 2;
        expected = 2;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
               
        /* 
        Test case #4: Test getF() with n = 2;
                      Expected value: 2
        */
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        
        /* 
        Test case #5: Test getF() with n = 2;
                      Expected value: 2
        */
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
    @Test   //interface, bắt buộc có
    public void testRedGreen() {
        Assert.assertEquals(6978, 6978);
    }
    
}
