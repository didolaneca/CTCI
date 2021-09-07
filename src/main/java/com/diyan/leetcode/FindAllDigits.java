package com.diyan.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindAllDigits {

    public static void main(String[] args) {
        int[] digits = {0,2,4};
        System.out.println(findAllTheDigitsInANumber(digits, 25));
    }

    /**
     * Method that will return the number of occurrences of the digits from the input array
     * in the range from 0 to the number given
     * @param digits
     * @param number
     * @return
     */
    static int findAllTheDigitsInANumber(int[] digits, int number){
        int totalOccur = 0;
        Map<Integer, Integer> mapDig = new HashMap<>();
        for (int digit : digits) {
            mapDig.put(digit, digit);
        }
        if(mapDig.containsKey(0))
            totalOccur++;
        for(int i = 1; i <= number; i++){
            int temp = i;
            while(temp > 0){
                int rem = temp % 10;
                if(mapDig.containsKey(rem)){
                    totalOccur++;
                }
                temp /= 10;
            }
        }
        return totalOccur;
    }
}
