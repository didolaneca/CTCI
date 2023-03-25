package com.diyan.programmingelements;

import java.util.List;

public class CyclicallySortedArrayWithImplementation {
    public static void main(String[] args) {
        List<Integer> test1 = List.of(243, 456, 578, 699, 108, 167, 198, 211, 221, 241);

        //should print 4
        System.out.println(searchSmallest(test1));

        List<Integer> test2 = List.of(243, 456, 578, 699, 701, 108, 167, 198, 211, 221, 241);

        //should print 5
        System.out.println(searchSmallest(test2));

        List<Integer> test3 = List.of(699, 701, 108, 167, 198, 211, 221, 241, 243, 456, 578);

        //should print 2
        System.out.println(searchSmallest(test3));

    }


    /**
     * An array is said to be cyclically sorted if it's possible to cyclically shift it entries so that
     * it becomes, sorted. For Example, the array [243, 456, 578, 699, 108, 167, 198, 211, 221, 241] it is
     * cyclically sorted --- a cyclic left shift by leads to a sorted array.
     * <p>
     * Question: Design an O(log n) algorithm for finding the position of the smallest element in a cyclically
     * sorted array. Assume all elements are distinct.
     *
     */
    public static int searchSmallest(List<Integer> integerList){
        //write your implementation below
        int left = 0, right = integerList.size() - 1;
        while(left < right){
            int mid = left + ((right - left) / 2);//3
            if(integerList.get(mid) > integerList.get(right)){
                //minimum must be in the right half
                left = mid + 1;
            } else { // mid < right
                //minimum cannot be in the
                right = mid;
            }
        }
        //loop ends when left == right
        return left;
    }

}
