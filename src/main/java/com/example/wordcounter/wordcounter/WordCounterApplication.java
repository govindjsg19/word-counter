package com.example.wordcounter.wordcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class WordCounterApplication {

	public static void main(String[] args) {

		SpringApplication.run(WordCounterApplication.class, args);
	}
	@Bean
	public WordCounter wordCounter() {
		return new WordCounter();
	}

	@Bean
	public Translator translator() {
		return new Translator();
	}
}
