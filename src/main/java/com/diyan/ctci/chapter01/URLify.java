package com.diyan.ctci.chapter01;

public class URLify {
    /**
     * Method that will replace all spaces in a given string with '%20' e.g. Hello World -> Hello%20World.
     * You are given the true length of the string (characters plus empty spaces). We may assume that
     * the given string has sufficient space at the end to hold the additional characters.
     * @param string to be reformatted
     * @return new urlified string
     */
    public String urlify(String string){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length() - 1; i++){
            char temp = string.charAt(i);
            char next = string.charAt(i + 1);
            if( temp == 32 && next != 32){
                result.append("%20");
            } else if(temp != 32) {
                result.append(temp);
            }
        }

        return result.toString();
    }
}
