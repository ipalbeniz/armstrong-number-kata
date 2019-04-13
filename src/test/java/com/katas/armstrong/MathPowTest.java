package com.katas.armstrong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathPowTest {

    @Test
    public void java_math_pow_overflows_integer_max_value_for_big_numbers() {
        assertEquals(Integer.MAX_VALUE, (int) Math.pow(5, 14));
        assertEquals(Integer.MAX_VALUE, (int) Math.pow(10, 20));
        assertEquals(Integer.MAX_VALUE, (int) Math.pow(15, 25));
    }

    @Test
    public void java_math_pow_overflows_long_max_value_for_big_numbers() {
        assertEquals(Long.MAX_VALUE, (long) Math.pow(9, 20));
        assertEquals(Long.MAX_VALUE, (long) Math.pow(10, 25));
        assertEquals(Long.MAX_VALUE, (long) Math.pow(11, 30));
    }
}