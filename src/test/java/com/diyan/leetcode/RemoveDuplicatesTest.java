package com.diyan.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
   RemoveDuplicates removeDuplicates;

    @BeforeEach
    void init(){
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    void SquaresOfASortedArrayPositivePath() {
//        int[] firstNumArray = {1,1,2};
//        int[] expectedFirst = {1, 2, 2};
//        Assertions.assertEquals(2 ,removeDuplicates.removeDuplicates(firstNumArray));
//        Assertions.assertArrayEquals(expectedFirst, firstNumArray);
        int[] secondNumArray = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};// i
        Assertions.assertEquals(6, removeDuplicates.removeDuplicates(secondNumArray));
    }
}
