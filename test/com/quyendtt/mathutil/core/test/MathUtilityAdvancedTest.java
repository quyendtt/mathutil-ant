
package com.quyendtt.mathutil.core.test;

import com.quyendtt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Truc Quyen
 */

// implement tên trong @
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    
    // chuẩn bị data là mảng 2 chiều kiểu Object
    // JUnit tự loop qua mảng lôi tách data ra
    // giúp ta fill / đổ vào hàm asserE()
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] 
                                {{0, 1}, 
                                 {1, 1}, 
                                 {2, 2}, 
                                 {3, 6}, 
                                 {4, 24}, 
                                 {5, 120}, 
                                 {6, 720}};
        
        
    }
    // map từng cột của từng dòng vào 2 biến tương ứng n và expected
        
        @Parameterized.Parameter(value = 1)
        public long expected;
        
        @Parameterized.Parameter(value = 0)
        public int n;
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
