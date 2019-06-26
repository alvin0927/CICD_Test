package com.playground.buildcicd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isCorrect2() {
        assertEquals(6, 3 + 3);
    }

    @Test
    public void addition_isCorrect3() {
        assertEquals(8, 4 + 4);
    }

    @Test
    /** 錯誤測試程式區段 */
    public void errorTestMethod() {
        assertEquals(3 , 2 + 1);
    }

    @Test
    /** 錯誤測試程式區段 */
    public void errorTestMethod2() {
        assertEquals(5 , 1 + 4);
    }
}