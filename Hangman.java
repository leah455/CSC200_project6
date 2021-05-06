package com.company;

//Program lets you play hangman with secret word and return disguised word, total guess count and wrong guess count.

import java.util.Locale;
import java.util.Scanner;

public class Hangman {

    private String secretWord;
    private String disguisedWord;
    private int guessCount;
    private int wrongGuesses;

    //Constructor
    public Hangman(){
        secretWord = "";
        disguisedWord = "";
        guessCount = 0;
        wrongGuesses = 0;
    }

    /**
     * Precondition: secret word is a string with any mix of characters.
     * Sets secretWord instance and disguisedWord from length of secretWord.
     */
    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord.toLowerCase(Locale.ROOT);
        for (int i = 0; i < secretWord.length(); i++) {
            disguisedWord += "?";
        }
    }

    /**
     * Precondition: guess is a lowercase character.
     * Checks if guess is a character of the secret word and if it is not it adds a ? to a string.
     * If guess is a character of the secret word then it adds the guess to a string.
     * Returns if the correct is correct or incorrect.
     */
    public void makeGuess(char guess) {
        guessCount += 1;
        StringBuilder guessWord = new StringBuilder();

        for (int i = 0; i < secretWord.length(); i++) {
            if (guess == secretWord.charAt(i)) {
                guessWord.append(secretWord.charAt(i));
            } else {
                guessWord.append(disguisedWord.charAt(i));
            }
        }

        if (guessWord.toString().equals(disguisedWord)) {
            System.out.println("Incorrect guess. Try again");
            wrongGuesses += 1;
        }
        else {
            disguisedWord = guessWord.toString();
        }

    }

    /**
     * Precondition: The instance variable disguisedWord has a value.
     * Returns the disguisedW word.
     */
    public String getDisguisedWord() {
        return disguisedWord;
    }

    /**
     * Precondition: The instance variable secretWord has a value.
     * Returns the secret word.
     */
    public String getSecretWord() {
        return secretWord;
    }

    /**
     * Precondition: The instance variable guessCount has a value.
     * Returns the total amount of guesses made.
     */
    public int getGuessCount() {
        return guessCount;
    }

    /**
     * Precondition: The instance variable wrongGuesses has a value.
     * Returns the amount of wrong guesses made.
     */
    public int getWrongGuesses() {
        return wrongGuesses;
    }

    /**
     * Precondition: The instance variables secretWord and disguisedWord have values.
     * Returns the true if the secretWord is now equal to the disguisedWord, or it returns false.
     */
    public boolean isFound() {
        if (secretWord.equalsIgnoreCase(disguisedWord)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){}
}
