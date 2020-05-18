package com.diyan.ctci.chapter01;

public class IsUnique {
    /**
     *  Problem: Implement an algorithm to determine if a string has all unique characters.
     *  Ask if the string is ASCII of Unicode. Java uses Unicode.
     * @param string the string we want to determine if contains all unique characters
     * @return true if the string contains all unique characters and false otherwise.
     */
    public boolean isUniqueChars(String string) {
        boolean[] checks = new boolean[256];
        for (int i = 0; i < string.length(); i++) {
            int index = string.charAt(i);
            if (checks[index]) {
                return false;
            }
            checks[index] = true;
        }
        return true;
    }

    /**
     * Note: This implementation will work only for alphabet characters
     * Different implementation of {@link #isUniqueChars(String)}
     * @param string the string we want to determine if contains all unique characters
     * @return true if the string contains all unique characters and false otherwise.
     */
    public boolean isUniqueCharsBit(String string){
        int checker = 0;
        for(int i = 0; i < string.length(); i++){
            int val = string.charAt(i) - 'a';
            if((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }
}