package com.company;

public class CounterTest {

    public static void main(String[] args) {

        Counter countValue = new Counter();

        countValue.setCount();
        countValue.decreaseCount();
        countValue.increaseCount();
        countValue.increaseCount();
        countValue.decreaseCount();

        System.out.println(countValue.getCount());
        System.out.println(countValue);
    }
}
