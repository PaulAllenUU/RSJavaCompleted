package com.example.questions;

public class UniqueCharacters {
    /*
    Thoughts before coding
    Questions: is the input String ASCII characters or uni code characters?
    Am I allowed to use extra space?
    - Assume that I am not allowed to change the return type of the method below so has to return boolean
    - If the String is all ASCII then theres only possible 128 characters without repeating values
    - Need to iterate over each character in the String, keep track of the current value
     and check if this element has occured before
    - if so then can return false
    - Use a boolean array and add the characters in the string and turn the booleans to true when added
    - check the values in the boolean array and if the value is found then return false if not then to the boolean
    array and continue looping

    - PseudoCode
    assuming ASCII string chracters can check if string.length is greater than 128 -
    - check if(args.length) is greater than 128 and if so immediately return false
    - create new boolean array and use for loop to iterate over array checking flag for true false
    - if (boolean true) then element array exists in array so return false
    - add element to char array and continue looping

    Runtime Complexity O(n) where n is the numbers of chracters in the string but could be argued
    it is O(1) because the loop will never execute more than 128 times
     */
    public static boolean checkCharacters(String args){

        if(args.length() > 128) return false;

        boolean [] charSet = new boolean[128];
        for(int i=0; i<args.length(); i++){
            int val = args.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
