package com.method;

import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String a, String b) {
    	 // Remove spaces and special characters
        a = a.replaceAll("[^a-zA-Z0-9]", "");
        b = b.replaceAll("[^a-zA-Z0-9]", "");

        // Convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths are different
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        // Sort the char arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Compare the sorted char arrays
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        String string1 = "act";
        String string2 = "tac";

        if (areAnagrams(string1, string2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
