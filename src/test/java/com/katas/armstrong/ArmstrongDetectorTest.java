package com.katas.armstrong;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArmstrongDetectorTest {

    private static final ArmstrongDetector ARMSTRONG_DETECTOR = new ArmstrongDetector();

    @Test
    public void zero_should_be_an_armstrong_number() {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(0));
    }

    @Test
    public void nine_should_be_an_armstrong_number() {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(9));
    }

    @Test
    public void ten_should_not_be_an_armstrong_number() {
        assertFalse(ARMSTRONG_DETECTOR.isArmstrong(10));
    }

    @Test
    public void one_hundred_and_fifty_three_should_be_an_armstrong_number() {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(153));
    }

    @Test
    public void one_hundred_and_fifty_four_should_not_be_an_armstrong_number() {
        assertFalse(ARMSTRONG_DETECTOR.isArmstrong(154));
    }

    @Test
    public void three_hundred_and_seventy_should_be_an_armstrong_number() {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(370));
    }
}
