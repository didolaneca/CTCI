package com.diyan.leetcode;

public class DuplicateZeros {
    /**
     * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
     *
     * Note that elements beyond the length of the original array are not written.
     *
     * Do the above modifications to the input array in place, do not return anything from your function.
     * @param arr
     */
    public int[] duplicateZeros(int[] arr){
        int arrLength = arr.length, i;
        for (i = 0; i < arrLength - 1; i++) {
            if(arr[i] == 0){
                moveArrElementToTheRight(arr, i + 1);
                i++;
            }
        }
        return arr;
    }

    /**
     * Move all the elements of an array by one position to the right the given element
     * @param arr the array the operation needs to be performed
     * @param index the rest of the elements of the array will moved to the right
     *              e.g. given array [1,2,3,4,5,6,7,8,9] and index 6 the result will be
     *              the same array [1,2,3,4,5,6,7,7,8]
     */
    public static void moveArrElementToTheRight(int[] arr, int index){
        int arrLength = arr.length, i;
        for(i = arrLength - 1; i >= index; i--){
//            System.out.println(arr[i]);
//            System.out.println(arr[i - 1]);
            arr[i] = arr[i - 1];
        }
    }
}
