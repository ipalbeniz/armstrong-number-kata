package com.katas.armstrong;

import com.google.common.math.LongMath;

import java.util.Arrays;

public class ArmstrongDetector {

    public boolean isArmstrong(long number) {
        return number == sumOfPowers(digitsFrom(number));
    }

    private long[] digitsFrom(long number) {
        return String.valueOf(number)
                .chars()
                .mapToLong(Character::getNumericValue)
                .toArray();
    }

    private long sumOfPowers(long[] digits) {
        return Arrays.stream(digits)
                .map(digit -> LongMath.checkedPow(digit, digits.length))
                .sum();
    }
}
