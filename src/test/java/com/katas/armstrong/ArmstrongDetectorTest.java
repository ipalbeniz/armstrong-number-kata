package com.katas.armstrong;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class ArmstrongDetectorTest {

    private static final ArmstrongDetector ARMSTRONG_DETECTOR = new ArmstrongDetector();

    @Test
    @Parameters({
            "0",
            "1",
            "9",
            "153",
            "370",
            "3289582984443187032"
    })
    public void it_should_detect_the_armstrong_numbers(long number) {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(number));
    }

    @Test
    @Parameters({
            "10",
            "154",
            "3289582984443187031"
    })
    public void it_should_detect_the_false_armstrong_numbers(long number) {
        assertFalse(ARMSTRONG_DETECTOR.isArmstrong(number));
    }
}