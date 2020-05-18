package com.diyan.ctci.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
