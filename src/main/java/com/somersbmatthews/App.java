package com.somersbmatthews;

import java.util.Arrays;

// steps to writing recursive algorithm
// 1.) Recursive case 

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // int result = factorial(5);
        // System.out.println(result);
    }

    public static int factorial(int n) {
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

    public static int fibonacci(int n) {
        // unintentional case
        if (n < 0) {
            return -1;
        }
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfDigits(int n) {

        // unintentional and base cases
        if (n == 0 || n < 0) {
            return 0;
        }
        // recursive case
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int power(int base, int exp) {
        // unintentional case
        if (exp < 0) {
            return -1;
        }
        // base case
        if (exp == 0) {
            return 1;
        }
        // recursive case
        return base * power(base, exp - 1);
    }

    public static int GCD(int numerator, int denominator) {
        // unintentional case
        if (numerator < 0 || denominator < 0) {
            return -1;
        }
        // base case
        if (denominator == 0) {
            return numerator;
        }
        // recursive case
        return GCD(denominator, numerator % denominator);
    }

    public static int decimalToBinary(int n) {
        // unintentional case
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        return n % 2 + 10 * decimalToBinary(n / 2);
    }

    public static int productofArray(int A[], int N) {
        // unintentional case
        // base case
        if (N == 0) {
            return 1;
        }
        // recursive case
        return A[N - 1] * productofArray(A, N - 1);
    }

    public int recursiveRange(int num) {
        // unintentional case
        // base case
        if (num == 0) {
            return 0;
        }
        // recursive case
        return num + recursiveRange(num - 1);
    }

    public String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public boolean someRecursive(int[] arr, IntRunnable odd) {
        if (arr.length == 0) {
            return false;
        }
        if (odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }

}
