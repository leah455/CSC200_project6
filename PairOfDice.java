package com.company;

/* Program is composed of 2 die objects that can be set as well as rolled.
   Methods to also get individual die values and one to return sum of two die values.
*/

public class PairOfDice {

    private Die die1;
    private Die die2;
    private int dieValue1, dieValue2;

    public PairOfDice() {
        die1 = new Die(6);
        die2 = new Die(6);
        roll();
    }

    public void setDie1(int newDie1) {
        dieValue1 = newDie1;
    }
    public void setDie2(int newDie2) {
        dieValue2 = newDie2;
    }

    public int getDie1() {
        return die1.getValue();
    }
    public int getDie2() {
        return die2.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        dieValue1 = die1.getValue();
        dieValue2 = die2.getValue();
    }

    int sum;
    public int sumOfDies() {
        sum = dieValue1 + dieValue2;
        return sum;
    }

    public static void main(String[] args) {}
}
