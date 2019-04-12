package com.katas.armstrong;

import java.util.Arrays;

public class ArmstrongDetector {

    public boolean isArmstrong(int number) {
        return number == sumOfPowers(digitsFrom(number));
    }

    private int[] digitsFrom(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    private int sumOfPowers(int[] digits) {
        return Arrays.stream(digits)
                .map(digit -> (int) Math.pow(digit, digits.length))
                .sum();
    }
}
