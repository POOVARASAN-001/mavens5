package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSwap() {
        App app = new App();
        int[] result = app.swapNumbers(10, 20);
        
        // Verifies that the first number is now 20 and the second is 10
        assertArrayEquals(new int[]{20, 10}, result);
    }
}
