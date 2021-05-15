package com.diyan.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySortingTest {
    ArraySorting arraySorting;

    @Test
    void sortArrayPositivePath() {
        int[] firstNumArray = {2, 3, 1, 4, 5, 0};
        int[] secondNumArray = {89, 96, 114, 332, 14, 44, 35, 10};
        int[] expectedFirst = {0, 1, 2, 3, 4, 5};
        int[] expectedSecond = {10, 14, 35, 44, 89, 96, 114, 332};
        ArraySorting.sortArrayRecursively(firstNumArray, 0);
        Assertions.assertArrayEquals(expectedFirst, firstNumArray);
        ArraySorting.sortArrayRecursively(secondNumArray, 0);
        Assertions.assertArrayEquals(expectedSecond,  secondNumArray);
    }
}
