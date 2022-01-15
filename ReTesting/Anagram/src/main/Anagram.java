package main;

import java.util.*;

public class Anagram {
    public boolean isAnagram(String string1) throws IllegalArgumentException {
        if (string1 == null) {
            throw new IllegalArgumentException();
        }
        if (string1.length() >= 2) {
            String string = string1.toLowerCase();
            List<Character> listOfCharacters = string.chars().mapToObj(e -> (char) e).toList();
            List<Character> reversedList = new ArrayList<>(listOfCharacters);
            Collections.reverse(reversedList);
            if (listOfCharacters.equals(reversedList)) {
                return true;
            }
        }
        return false;
    }
}
