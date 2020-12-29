package com.diyan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquaresOfASortedArrayTest {
    SquaresOfASortedArray sqauresOfASortedArr;

    @BeforeEach
    void init(){
        sqauresOfASortedArr = new SquaresOfASortedArray();
    }

    @Test
    void SquaresOfASortedArrayPositivePath(){
        int[] firstNumArray = {-4,-1,0,3,10};
        int[] secondNumArray = {-7,-3,2,3,11};
        int[] thirdNumArray = {5,9,3,1,4,2,3,8,7,6};
        int[] expectedThird = {1,4,9,9,16,25,36,49,64,81};
        int[] expectedFirst = {0,1,9,16,100};
        int[] expectedSecond = {4,9,9,49,121};
        Assertions.assertArrayEquals(expectedThird,  sqauresOfASortedArr.sortedSquares(thirdNumArray));
        Assertions.assertArrayEquals(expectedFirst,  sqauresOfASortedArr.sortedSquares(firstNumArray));
        Assertions.assertArrayEquals(expectedSecond,  sqauresOfASortedArr.sortedSquares(secondNumArray));
    }
}
