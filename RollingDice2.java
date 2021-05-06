package com.company;

public class RollingDice2 {

    public static void main(String[] args){
        PairOfDice roll = new PairOfDice();
        System.out.println("The value of dice 1 is " + roll.getDie1());
        System.out.println("The value of dice 2 is " + roll.getDie2());
        System.out.println("The sum of the two die values is " + roll.sumOfDies());

        roll.setDie1(3);
        roll.setDie2(5);
        System.out.println("If I set die1 to 3 and die2 to 5, then the sum is " + roll.sumOfDies());
    }
}
