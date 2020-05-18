package com.diyan.ctci.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsUniqueTests {
    @Test
    void IsUniquePositiveTest(){
        IsUnique isUnique = new IsUnique();
        boolean result = isUnique.isUniqueChars("asdfghjklzxcvbnm");
        boolean result1 = isUnique.isUniqueChars("qwertyuiop");
        boolean result2 = isUnique.isUniqueChars("zxcvbnm,./");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void IsUniqueNegativeTest(){
        IsUnique isUnique = new IsUnique();
        boolean result = isUnique.isUniqueChars("asdfghjklzxcvbbnm");
        boolean result1 = isUnique.isUniqueChars("asdfghjklzxcvvbnm");
        boolean result2 = isUnique.isUniqueChars("asdffghjklzxcvbnm");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
    }

    @Test
    void IsUniqueCharsBitPositiveTest(){
        IsUnique isUnique = new IsUnique();
        boolean result = isUnique.isUniqueCharsBit("asdfghjklzxcvbnm");
        boolean result1 = isUnique.isUniqueCharsBit("qwertyuiop");
        boolean result2 = isUnique.isUniqueCharsBit("zxAcUYTRvbnm");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
    }
}
