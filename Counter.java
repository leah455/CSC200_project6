package com.company;

//Program records count of non negative whole number. Can increase or decrease count by 1 but count cannot be negative.

public class Counter {

    private int count;

    public void setCount() {
        count = 0;
    }

    public void increaseCount() {
        count += 1;
    }

    public void decreaseCount() {
        if (count > 0) {
            count -= 1;
        } else {
            System.out.println("Count can not go below 0");
        }
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "Current count is " + count;
    }

    public static void main(String[] args) {
    }
}
