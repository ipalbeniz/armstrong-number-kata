package com.katas.armstrong;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigInteger;

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
            "1634",
            "1741725",
            "4679307774",
            "4338281769391370",
            "3289582984443187032",
            "1550475334214501539088894",
            "1145037275765491025924292050346",
            "1122763285329372541592822900204593",
            "115132219018763992565095597973971522400",
            "115132219018763992565095597973971522401"
    })
    public void it_should_detect_the_armstrong_numbers(String number) {
        assertTrue(ARMSTRONG_DETECTOR.isArmstrong(new BigInteger(number)));
    }

    @Test
    @Parameters({
            "10",
            "154",
            "3289582984443187031",
            "115132219018763992565095597973971522399",
            "115132219018763992565095597973971522402"
    })
    public void it_should_detect_the_false_armstrong_numbers(String number) {
        assertFalse(ARMSTRONG_DETECTOR.isArmstrong(new BigInteger(number)));
    }
}