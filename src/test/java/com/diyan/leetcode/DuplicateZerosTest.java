package com.diyan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DuplicateZerosTest {
    DuplicateZeros duplicateZeros;

    @BeforeEach
    void init(){
        duplicateZeros = new DuplicateZeros();
    }

    @Test
    void SquaresOfASortedArrayPositivePath() {
        int[] firstNumArray = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] secondNumArray = {1, 2, 0, 3, 0, 4, 5, 0};
        int[] expectedFirst = {1, 0, 0, 2, 3, 0, 0, 4};
        int[] expectedSecond = {1, 2, 0, 0, 3, 0, 0, 4};
        Assertions.assertArrayEquals(expectedFirst, duplicateZeros.duplicateZeros(firstNumArray));
        Assertions.assertArrayEquals(expectedSecond,  duplicateZeros.duplicateZeros(secondNumArray));
    }
}
