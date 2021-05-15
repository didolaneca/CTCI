package com.diyan.edu;

public class ArraySorting {
    /**
     * Sorting an array of integers recursively in place, takes an integer
     * @param array parameter, and
     * @param n which is starting index from which the sorting to begin, usually 0
     */
    public static void sortArrayRecursively(int[] array, int n) {
        // Write your code here
        //base case
        int arrayLength = array.length;
        if(arrayLength == n){
            return;
        } else {
            for(int i = 1; i < arrayLength; i++){
                if(array[i] < array[i - 1]){
                    swap(array, i);
                }
            }
            sortArrayRecursively(array, n + 1);
        }
        System.out.print("Sorted Array:");
    }

    private static void swap(int[] array, int index){
        int temp = array[index];
        array[index] = array[index - 1];
        array[index - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arrOne = {4, 3, 2, 8, 5};
        sortArrayRecursively(arrOne, 0);
    }
}
