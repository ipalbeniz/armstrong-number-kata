package com.katas.armstrong;

import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongDetector {

    public boolean isArmstrong(int number) {
        List<Integer> digits = extractDigitsFrom(number);
        int sumOfPowers = sumOfPowers(digits);
        return number == sumOfPowers;
    }

    private List<Integer> extractDigitsFrom(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());
    }

    private int sumOfPowers(List<Integer> digits) {
        return digits.stream()
                .mapToInt(digit -> (int) Math.pow(digit, digits.size()))
                .sum();
    }
}
