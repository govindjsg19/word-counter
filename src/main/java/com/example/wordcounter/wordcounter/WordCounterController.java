package com.example.wordcounter.wordcounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/word-counter")
    public class WordCounterController {

     private final WordCounter wordCounter;
     private final Translator translator;

     @Autowired
     public WordCounterController(WordCounter wordCounter, Translator translator) {
         this.wordCounter = wordCounter;
         this.translator = translator;
     }

     @PostMapping("/add-words")
     public void addWords(@RequestBody String[] words) {
         String[] translatedWords = translateWords(words);
         wordCounter.addWords(translatedWords);
     }

     @PostMapping("/get-count")
     public int getCount(@RequestBody String word) {
         String translatedWord = translator.translate(word);
         return wordCounter.getCount(translatedWord);
     }

     private String[] translateWords(String[] words) {
         String[] translatedWords = new String[words.length];
         for (int i = 0; i < words.length; i++) {
             translatedWords[i] = translator.translate(words[i]);
         }
         return translatedWords;
     }
 }


