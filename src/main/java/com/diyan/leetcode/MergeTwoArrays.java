package com.diyan.leetcode;

public class MergeTwoArrays {
    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * Note:
     *  The number of elements initialized in nums1 and nums2 are m and n respectively.
     *  You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public int[] merge(int[] nums1, int m, int[] nums2, int n){
        int i = 0, j = 0, mergedArrLength = m;
        for ( ; i < n; i++){
            if( j < mergedArrLength ){
                while(nums2[i] >= nums1[j] && j < mergedArrLength){
                    j++;
                }
                moveArrElementToTheRight(nums1, j);
                nums1[j] = nums2[i];
                j++;
                mergedArrLength++;
            } else {
                nums1[j] = nums2[i];
                j++;
            }

        }
        return nums1;
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
        for(i = arrLength - 1; i > index; i--){
            arr[i] = arr[i - 1];
        }
    }
}
