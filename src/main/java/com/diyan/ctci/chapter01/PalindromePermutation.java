package com.diyan.ctci.chapter01;

import java.util.Arrays;

public class PalindromePermutation {
    /**
     * Given a string, write a function to check if it is a permutation of palindrome. A palindrome is a word
     * or a phrase that is the same forwards and backwards. A permutation is rearrangement of letters.
     * The palindrome does not need to be limited to just dictionary words.
     * @param str to be checked it it is palindrome permutation
     * @return true if the string is a palindrome permutation an false if it is not
     */
    public boolean isItpalindromePermutation(String str){
        /*
         * Solution: for a string to be a permutation of a palindrome it has to have all its characters in even count
         * and only one character can be in odd count.
         */
        final int A = Character.getNumericValue('a');
        final int Z = Character.getNumericValue('z');
        int oddChars = 0;
        int[] chars = new int[Z - A + 1];
        for(char c : str.toCharArray()){
            int C = Character.getNumericValue(c);
            int charNum = A <= C && C <= Z ? C - A : -1;
            if(charNum != -1){
                chars[charNum]++;
                if (chars[charNum] % 2 == 1) {
                    oddChars++;
                } else {
                    oddChars--;
                }
            }
        }
        return oddChars <= 1;
    }
}
