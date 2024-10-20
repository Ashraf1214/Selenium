package com.assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        int a = 4;
        int b = 5;
        int result = 9;
        assertEquals("Result should be 9", result, a + b);
    }

    @Test
    public void testStringExists() {
        String str = "Hello World";
        assertNotNull("String should not be null", str);
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }
}
