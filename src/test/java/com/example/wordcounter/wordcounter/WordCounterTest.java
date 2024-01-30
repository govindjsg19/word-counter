package com.example.wordcounter.wordcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void testAddWords() {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWords("hello", "world", "hello");
        assertEquals(2, wordCounter.getCount("hello"));
        assertEquals(1, wordCounter.getCount("world"));
    }

    @Test
    public void testGetCountWithNonExistingWord() {
        WordCounter wordCounter = new WordCounter();
        assertEquals(0, wordCounter.getCount("nonexistent"));
    }
}
