package com.diyan.ctci.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class URLifyTests {
    URLify urLify;

    @BeforeEach
    void init(){
        urLify = new URLify();
    }

    @Test
    void urlifyPositiveTest(){
        String result = urLify.urlify("Hello World  ");
        String result1 = urLify.urlify("Dido is awesome    ");
        String result2 = urLify.urlify("I like going to the mall for ice cream                ");
        Assertions.assertEquals("Hello%20World", result);
        Assertions.assertEquals("Dido%20is%20awesome", result1);
        Assertions.assertEquals("I%20like%20going%20to%20the%20mall%20for%20ice%20cream", result2);
    }

    @Test
    void replaceSpacesPositiveTest() {
        char[] test1 = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', ' ', ' '};
        urLify.replaceSpaces(test1, 11);
        Assertions.assertArrayEquals(new char[]{'H', 'e', 'l', 'l', 'o', '%', '2', '0', 'W', 'o', 'r', 'l', 'd'}, test1);
        char[] test2 = new char[]{'D', 'i', 'd', 'o', ' ', 'i', 's', ' ', 'a', 'w', 'e', 's', 'o', 'm', 'e', ' ', ' ', ' ', ' '};
        urLify.replaceSpaces(test2, 15);
        Assertions.assertArrayEquals(new char[]{'D', 'i', 'd', 'o', '%', '2', '0', 'i', 's', '%', '2', '0', 'a', 'w', 'e', 's', 'o', 'm', 'e'}, test2);

        char[] test3 = new char[]{'I', ' ', 'l', 'i', 'k', 'e', ' ', 'g', 'o', 'i', 'n', 'g', ' ', 't', 'o', ' ', 't', 'h', 'e', ' ', 'm', 'a', 'l', 'l', ' ', 'f', 'o', 'r', ' ', 'i', 'c', 'e', ' ', 'c', 'r', 'e', 'a', 'm', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        urLify.replaceSpaces(test3, 38);
        Assertions.assertArrayEquals(new char[]{'I', '%', '2', '0', 'l', 'i', 'k', 'e', '%', '2', '0', 'g', 'o', 'i', 'n', 'g', '%', '2', '0', 't', 'o', '%', '2', '0', 't', 'h', 'e', '%', '2', '0', 'm', 'a', 'l', 'l', '%', '2', '0', 'f', 'o', 'r', '%', '2', '0', 'i', 'c', 'e', '%', '2', '0', 'c', 'r', 'e', 'a', 'm'}, test3);
    }
}
