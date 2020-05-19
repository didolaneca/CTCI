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

    /**
     * Different implementation of the {@link #urlify} problem. This implementation takes
     * @param string char array and
     * @param trueLength the string legth plus the white spaces
     * and modifies the char array
     */
    void replaceSpaces(char[] string, int trueLength){
        int spaceCount = 0,  index, i;
        //first we count the white spaces in the char array
        for (i = 0; i < trueLength; i++){
            if(string[i] == 32){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < string.length){
            string[trueLength] = '\0';
        }
        for(i = trueLength - 1;  i >= 0; i--){
            if(string[i] == 32){
                string[index - 1] = '0';
                string[index - 2] = '2';
                string[index - 3] = '%';
                index -= 3;
            } else {
                string[index - 1] = string[i];
                index--;
            }
        }
    }
}
