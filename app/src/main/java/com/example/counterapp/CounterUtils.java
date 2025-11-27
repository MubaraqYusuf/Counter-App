package com.example.counterapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CounterUtils {
        // Count sentences using regex
        public static int countSentences(String text) {
            Pattern pattern = Pattern.compile("[.!?]+");
            Matcher matcher = pattern.matcher(text);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        }

        // Count words (not regex)
        public static int countWords(String text) {
            if (text.trim().isEmpty()) return 0;
            String[] words = text.trim().split("[\\s,\\.]+");
            return words.length;
        }

        // Count characters (not regex)
        public static int countChars(String text) {
            return text.length();
        }

        // Count numbers using regex
        public static int countNumbers(String text) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        }
    }


