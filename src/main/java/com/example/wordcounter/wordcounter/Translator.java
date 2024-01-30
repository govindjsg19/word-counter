package com.example.wordcounter.wordcounter;

import org.springframework.stereotype.Service;

@Service
public class Translator {

    public String translate(String word) {
        // For simplicity, let's assume it returns the same word for now.
        return word;
    }
}
