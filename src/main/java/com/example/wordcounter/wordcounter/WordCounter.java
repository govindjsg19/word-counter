package com.example.wordcounter.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private final Map<String, Integer> wordCountMap = new HashMap<>();

    public void addWords(String... words) {
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }

    public int getCount(String word) {
        return wordCountMap.getOrDefault(word, 0);
    }
}
