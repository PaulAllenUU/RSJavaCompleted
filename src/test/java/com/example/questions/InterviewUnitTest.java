package com.example.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterviewUnitTest {

    @Test
    void areTheCharactersOfAStringUnique(){
        System.out.println("*** Test: Unique characters?\n");
        assertFalse(UniqueCharacters.checkCharacters("Benny")); // false
        assertTrue(UniqueCharacters.checkCharacters("Ben")); // true
        assertTrue(UniqueCharacters.checkCharacters("Alex")); // true
        assertFalse(UniqueCharacters.checkCharacters("Gillian")); // false
    }


    @Test
    void isAPhraseAPalindrome(){
        System.out.println("*** Test: Palindrome Permutation\n");
        assertTrue(Palindrome.palindromeChecker("tenet")); // true
        assertFalse(Palindrome.palindromeChecker("race the car")); // false
        assertTrue(Palindrome.palindromeChecker("radar")); // true
        assertFalse(Palindrome.palindromeChecker("willow")); // false
    }
}
