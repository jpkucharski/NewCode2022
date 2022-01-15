package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class AnagramTest
{

    public Anagram anagram;

    @BeforeEach
    public void setUp(){
        anagram = new Anagram();
    }

    @Test
    public void sendingNull_ShouldTrowException() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            anagram.isAnagram(null);
        });
    }

    @Test
    public void sendingString_ShouldReturnFalse() throws IllegalArgumentException {
        Assertions.assertFalse(anagram.isAnagram("String1"));
    }

    @Test
    public void sendingStringTwoTwoAA_ShouldReturnTrue() throws IllegalArgumentException{
        Assertions.assertTrue(anagram.isAnagram("AA"));
    }

    @Test
    public void sendingStringAnagram_ShouldReturnTrue() throws IllegalArgumentException{
        Assertions.assertTrue(anagram.isAnagram("AsdsA"));
    }

    @Test
    public void sendingStringNotAnagram_ShouldReturnFalse() throws IllegalArgumentException{
        Assertions.assertFalse(anagram.isAnagram("AsdsW"));
    }
    @Test
    public void sendingStringOfLength1_ShouldReturnFalse() throws IllegalArgumentException{
        Assertions.assertFalse(anagram.isAnagram("A"));
    }
}
