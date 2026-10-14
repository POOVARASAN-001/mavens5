package com.example;

public class App {
    public int[] swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
