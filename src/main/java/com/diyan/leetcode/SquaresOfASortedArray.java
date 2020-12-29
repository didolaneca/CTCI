package com.diyan.leetcode;

public class SquaresOfASortedArray {
    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
     * sorted in non-decreasing order.
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int i, numsLength = nums.length;
        int[] tempArr = new int[numsLength];
        //first we square all numbers in the array
        for(i = 0; i < numsLength; i++){
            tempArr[i] = nums[i] * nums[i];
        }
        //second we sort the array in non-decreasing
        quickSort(tempArr, 0, tempArr.length - 1);
        return tempArr;
    }

    public static void quickSort(int[] arr, int start, int end){
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end],
        pIndex = start, i;
        for (i = start; i < end; i++){
            if(arr[i] <= pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    private static void swap(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
