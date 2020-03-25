package com.diyan.ctci.chapter01;

public class Permutation {
    /**
     * Problem: Given two strings, write a method to decide if one is a permutation of the other.
     * @param s1 First String
     * @param s2 Second String
     * @return true if the two strings are permutation of each other and false otherwise
     * If two Strings are permutations of each other then they have the same characters in a different order.
     * One approach is to convert the Strings into two char arrays, sort the arrays and compare them. Not very efficient but clean.
     *
     */
    public boolean permutation(String s1, String s2){
        // 1. if the two strings are of different length then we return false
        if(s1.length() != s2.length()){
            return false;
        }

        // Assuming its ASCII encoding which has 128 characters
        int[] chars_counts = new int[128];
        char[] s_chars = s1.toCharArray();
        // Counting the characters in the first String
        for (char c: s_chars) {
            chars_counts[c]++;
        }
        // Going through the second String and subtracting each character  from the count array
        for (int i = 0; i < s2.length(); i++){
            int num = (int) s2.charAt(i);
            chars_counts[num]--;
            if(chars_counts[num] < 0){
                return false;
            }
        }
        return true;
    }
}
