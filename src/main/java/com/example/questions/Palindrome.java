package com.example.questions;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Palindrome {

    /*thoughts before coding
    * - palindrome is a word or sentence which is the same backwards as it is forwards
    * - all palindromes will have a pivot character around which each half rotate: Example Dog & God rotate around the 'o'
    * - do I have to valid the input? Eg consider spaces, capital letters, numbers, punctuation, null values?
    * - for example if capital letter are important Dog & God would not be palindromes
    *
    * - convert all chars of String to lower case, validate input for space, numbers, punctuation etc
    * - can use two pointer approach with a loop to solve this problem
    * - one pointer to keep track of character and start and at end, compare and if they are not them then false
    * - increment low pointer, decrement high pointer, keep looping and evaluating until both pointers are at the pivot
    *
    * Pseudocode
    * validate input String - character class can check for non letter values if spaces are being discarded
    * also check for null String
    * declare variables for low and high index of String
    *
    * check whether they are equal
    * if not equal immediately return false
    * increment low index and decrement high index and evaluate
    * return true
    * Run Time Complexity of O(n) where n is the numbers of characters in the String */
    public static boolean palindromeChecker(String args){

        int low=0, high=args.length()-1;

        //helper methods to validate input
        checkInputStringNotNull(args);
        //characterValidation(args);
        //use apache commons to delete white space
        StringUtils.deleteWhitespace(args);

        String argsLower = args.toLowerCase();
        while(low < high){
            if(argsLower.charAt(low) != argsLower.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    private static void checkInputStringNotNull(String args) {
        if(args == null){
            throw new IllegalArgumentException("Input string must not be null");
        }
    }

    /*private static void characterValidation(String args) {
        for(int i = 0; i< args.length(); i++){
            if(!Character.isLetter(args.charAt(i))){
                throw new IllegalArgumentException("Invalid input, string must contain only characters");
            }
        }
    }*/
}
