package com.somersbmatthews;

public class Searching {
    // binary search
    // binary tree search

    // TODO: BINARY SEARCH

    public int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;

        while (arr[middle] != value) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        if (arr[middle] == value) {
            return middle;
        } else {
            return -1;
        }

    }

}
