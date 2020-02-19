package com.diyan.ctci.chapter01;

public class IsUnique {
    //    public static void main(String[] args) {}
    public boolean isUniqueChars(String str) {
        boolean[] checks = new boolean[250];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (checks[index]) {
                return false;
            }
            checks[index] = true;
        }
        return true;
    }
}