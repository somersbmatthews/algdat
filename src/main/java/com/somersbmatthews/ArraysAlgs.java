package com.somersbmatthews;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysAlgs {
    public int[] twoSumReturnIndexes(int[] nums, int target) {
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                result = new int[2];
                // result[0] = compliment;
                // result[1] = nums[i];
                int indexOfCompliment = map.get(compliment);

                result[0] = indexOfCompliment;
                result[1] = i;
                break;

            }
            map.put(nums[i], i);
        }
        return result;
    }

    public int[] twoSumReturnAddends(int[] nums, int target) {
        int[] result = null;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (set.contains(difference)) {
                result = new int[2];
                result[0] = difference;
                result[1] = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return result;
    }

    // Function to find maximum product pair
    // in arr[0..n-1]

    static void maxProduct(int arr[], int n) {
        if (n < 2) {
            System.out.println("No pairs exists");
            return;
        }

        if (n == 2) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        // Initialize maximum and second maximum
        int posa = Integer.MIN_VALUE,
                posb = Integer.MIN_VALUE;

        // Initialize minimum and second minimum
        int nega = Integer.MIN_VALUE,
                negb = Integer.MIN_VALUE;

        // Traverse given array
        for (int i = 0; i < n; i++) {
            // Update maximum and second maximum
            // if needed
            if (arr[i] > posa) {
                posb = posa;
                posa = arr[i];
            } else if (arr[i] > posb)
                posb = arr[i];

            // Update minimum and second minimum
            // if needed
            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(nega)) {
                negb = nega;
                nega = arr[i];
            } else if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negb))
                negb = arr[i];
        }

        if (nega * negb > posa * posb)
            System.out.println("Max product pair is {"
                    + nega + ", " + negb + "}");
        else
            System.out.println("Max product pair is {"
                    + posa + ", " + posb + "}");
    }

    public boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : arr) {
            if (set.contains(i))
                return false;
            set.add(i);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (tChar != sMap.get(sChar)) {
                    return false;
                }
            } else {
                if (tMap.containsKey(tChar)) {
                    return false;
                }
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);

            }

        }
        return true;
    }
}
