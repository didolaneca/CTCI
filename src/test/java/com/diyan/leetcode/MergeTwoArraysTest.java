package com.diyan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTwoArraysTest {
    MergeTwoArrays mergeTwoArrays;

    @BeforeEach
    void init(){
        mergeTwoArrays = new MergeTwoArrays();
    }

    @Test
    void SquaresOfASortedArrayPositivePath() {
        int[] firstNumArray = {1, 2, 3, 0, 0, 0};
        int[] secondNumArray = {4,5,6};
        int[] expectedFirst = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedFirst, mergeTwoArrays.merge(firstNumArray,3, secondNumArray, 3));
        int[] nums2 = {2,5,6};// i
        int[] nums1 = {1, 2, 3, 0, 0, 0};// j
        int[] expectedSecond = {1, 2, 2, 3, 5, 6};
        Assertions.assertArrayEquals(expectedSecond, mergeTwoArrays.merge(nums1,3, nums2, 3));
//        Assertions.assertArrayEquals(expectedSecond,  duplicateZeros.duplicateZeros(secondNumArray));
    }
}
