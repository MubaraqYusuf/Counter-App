package com.example.counterapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CounterUtilsTest {

    @Test
    public void test_countSentences() {
        String text = "Hello world. This is Great! Do You Agree?";
        assertEquals(3, CounterUtils.countSentences(text));
    }

    @Test
    public void test_countSentences_noPunctuation() {
        String text = "This is a Sentence Without Punctuation";
        assertEquals(0, CounterUtils.countSentences(text));
    }

    @Test
    public void test_countWords() {
        String text = "This is a Simple Test";
        assertEquals(5, CounterUtils.countWords(text));
    }

    @Test
    public void test_countWords_withCommasAndDots() {
        String text = "Apple, Banana. Mango Orange";
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
        String text = "I Have 2 Apples and 15 Oranges. Total 17 Fruits.";
        assertEquals(3, CounterUtils.countNumbers(text));
    }

    @Test
    public void test_countNumbers_noNumbers() {
        String text = "No Numbers Here";
        assertEquals(0, CounterUtils.countNumbers(text));
    }
}
