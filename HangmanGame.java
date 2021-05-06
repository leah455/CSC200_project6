package com.company;

import java.util.Locale;
import java.util.Scanner;

public class HangmanGame {

    /**
     * Initiates new hangman object and prompts user to input the secret word.
     * Loops until the word is found and outputs the secret word along with the amount of incorrect and total guesses.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Hangman game = new Hangman();

        System.out.println("Enter in secret word");
        String newWord = keyboard.nextLine();
        game.setSecretWord(newWord);

        while (!game.isFound()) {
            System.out.println("The disguised word is " + game.getDisguisedWord());
            System.out.println("Enter in a letter to guess");

            String guess = keyboard.next();
            guess = guess.toLowerCase(Locale.ROOT);
            game.makeGuess(guess.charAt(0));
        }

        System.out.println("The secret word was " + game.getSecretWord());
        System.out.println("It took you " + game.getGuessCount() + " tries and you had " + game.getWrongGuesses() +
                " wrong guesses.");
    }
}
