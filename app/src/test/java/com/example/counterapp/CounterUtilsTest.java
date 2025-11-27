package com.example.counterapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CounterUtilsTest {

    @Test
    public void test_countSentences() {
        String text = "Hello world. This is great! Do you agree?";
        assertEquals(3, CounterUtils.countSentences(text));
    }

    @Test
    public void test_countSentences_noPunctuation() {
        String text = "This is a sentence without punctuation";
        assertEquals(0, CounterUtils.countSentences(text));
    }

    @Test
    public void test_countWords() {
        String text = "This is a simple test";
        assertEquals(5, CounterUtils.countWords(text));
    }

    @Test
    public void test_countWords_withCommasAndDots() {
        String text = "Apple, Banana. Mango orange";
        assertEquals(4, CounterUtils.countWords(text));
    }

    @Test
    public void test_countWords_emptyString() {
        assertEquals(0, CounterUtils.countWords(""));
    }

    @Test
    public void test_countChars() {
        String text = "Hello!";
        assertEquals(6, CounterUtils.countChars(text));
    }

    @Test
    public void test_countNumbers() {
        String text = "I have 2 apples and 15 oranges. Total 17 fruits.";
        assertEquals(3, CounterUtils.countNumbers(text));
    }

    @Test
    public void test_countNumbers_noNumbers() {
        String text = "No numbers here";
        assertEquals(0, CounterUtils.countNumbers(text));
    }
}
