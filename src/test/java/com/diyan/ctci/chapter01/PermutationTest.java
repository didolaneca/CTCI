package com.diyan.ctci.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PermutationTest {
    Permutation permutation;

    @BeforeEach
    void init(){
        this.permutation = new Permutation();
    }
    @Test
    void PermutationPositiveTest(){
        boolean result = permutation.permutation("qqwweerrttyyuuiioopp", "qwertyuiopqwertyuiop");
        boolean result1 = permutation.permutation("qazwsxedcrfvtgbyhn", "nbvcxzasdfghytrewq");
        boolean result2 = permutation.permutation("azsxdcfvgbhnjmk,l.", ".,mnbvcxzasdfghjkl");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void PermutationNegativeTest(){
        boolean result = permutation.permutation("qqwweerrttyyuuiiooppp", "qwertyuiopqwertyuiop");
        boolean result1 = permutation.permutation("qqwweerrttyyuuiiooppq", "qwertyuiopqwertyuiopw");
        boolean result2 = permutation.permutation("qqwweerrttyyuuiiooppe", "qwertyuiopqwertyuiopr");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
    }
}
