package com.diyan.ctci.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isItpalindromePermutationTest {

    @Test
    void isItpalindromePermutationPositivePathTest(){
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        boolean result1 = palindromePermutation.isItpalindromePermutation("SOS");
        boolean result2 = palindromePermutation.isItpalindromePermutation("Tact Coa");
        boolean result3 = palindromePermutation.isItpalindromePermutation("argyqstaugqrymsmtu");
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);

    }

    @Test
    void isItpalindromePermutationNegativePathTest(){
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        boolean result1 = palindromePermutation.isItpalindromePermutation("SOTS");
        boolean result2 = palindromePermutation.isItpalindromePermutation("Tactr Coa");
        boolean result3 = palindromePermutation.isItpalindromePermutation("argyqstaPWugqrymsmtu");
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);
    }
}
