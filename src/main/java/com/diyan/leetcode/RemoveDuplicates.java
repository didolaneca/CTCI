package com.diyan.leetcode;

public class RemoveDuplicates {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and
     * returns the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array
     * in-place with O(1) extra memory.
     * Clarification:
     * Confused why the returned value is an integer but your answer is an array?
     * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
     * @param nums
     * @return the elements in the arrays after removing duplicates
     */

    public int removeDuplicates(int[] nums) {
        int i, j = 1, counter = 1;
        for(i = 0; i < nums.length - 1; i++){
            if (nums[i + 1] > nums[i]) {
                nums[j] = nums[i + 1];
                j++;
                counter++;
            }
        }
        return counter;
    }
}
