package com.example.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    /*
    Thoughts before coding
    - Input validation : assume the array is always going to contain integer values
    - Sort the array manually or sort the array using the Array utilities class
    - Array fixed in size so not easy to remove elements, so have to create new array
    - Will need to consider that the existing array may not have duplicate elements so new array has to be the
    -the same length as the old array

    - sort the array using the the arrays utility class for convenience
    - if the array is sorted, values which are the same will be placed beside each other so can compare
    - if both compared values are the same then can add one of them to new array
    - will need another pointer to keep track of current element in populating sorted unique array

    Pseudocode
    - use arrays utility class to sort the array
    - use for loop to iterate over every other element and compare i+1 with i
    - if i==i+1 then add to new array
    - declare pointer to keep track of current place in array and increment pointer each loop

    - Runtime complexity O(n*log n) for sorting and O(n) for checking where n is the number of elements in the array
    - Simplified to O(n*log n)
     */
    public static int[] removeDuplicates(int[] nums) {

        int [] uniqueSortedArray = new int[nums.length];
        Arrays.sort(nums);
        int j = 0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                uniqueSortedArray[j++] = nums[i];
            }
        }
        return uniqueSortedArray;
    }
}
