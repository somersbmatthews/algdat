package com.somersbmatthews;

// steps to writing recursive algorithm
// 1.) Recursive case 

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int factorial(int n) {
        // unintentional case
        if (n < 1) {
            return -1;
        }
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        return n * factorial(n - 1);
    }

}
