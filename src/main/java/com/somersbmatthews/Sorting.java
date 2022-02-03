package com.somersbmatthews;

public class Sorting {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j - 1];

                    arr[j - 1] = temp;

                }

            }
        }
        return arr;
    }

    public static void mergeSort(int[] Array, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            mergeSort(Array, left, mid);
            mergeSort(Array, mid + 1, right);
            merge(Array, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int middle, int right) {
        int[] leftTempArray = new int[middle - left + 2];
        int[] rightTempArray = new int[right - middle + 1];
        for (int i = 0; i <= middle - left; i++) {
            leftTempArray[i] = A[left + i];
        }
        for (int i = 0; i <= right - middle; i++) {
            rightTempArray[i] = A[middle + 1 + i];
        }

        leftTempArray[middle - left + 1] = Integer.MAX_VALUE;
        rightTempArray[right - middle] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArray[i] < rightTempArray[j]) {
                A[k] = leftTempArray[i];
                i++;
            } else {
                A[k] = rightTempArray[i];
                j++;
            }
        }
    }
}
