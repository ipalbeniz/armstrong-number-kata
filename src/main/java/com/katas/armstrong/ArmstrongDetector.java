package com.katas.armstrong;

import java.math.BigInteger;
import java.util.Arrays;

public class ArmstrongDetector {

    public boolean isArmstrong(BigInteger number) {
        final int[] digits = getDigitsFrom(number);
        return number.equals(sumOfPowers(digits));
    }

    private int[] getDigitsFrom(BigInteger number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    private BigInteger sumOfPowers(int[] digits) {
        return Arrays.stream(digits)
                .mapToObj(BigInteger::valueOf)
                .map(digit -> digit.pow(digits.length))
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}