/*
Author: Jamie Irby
Uber Career Prep Assignment 1 Part 2
Methods to implement: isStringPermutation(String s1, String s2) and 
	pairsThatEqualSum(int[] inputArr, int targetSum)
*/


import java.util.ArrayList;
import java.util.List;

public class Part2 {

	public static void main(String[] args) {
        System.out.println(isStringPermutation(args[0], args[1]));
    }

    // This function takes two strings and returns true if one string is a
    // permutation of the other, false otherwise.
    public static Boolean isStringPermutation(String s1, String s2) {

        // Test case: empty strings
        if (s1.equals("") || s2.equals("")) {
            return false;
        }
        // Test case: one string is longer than another
        if (s1.length() != s2.length()) {
            return false;
        }
        return recurse(s1, s2);
    }

    private static Boolean recurse(String s1, String s2) {
        if (s2.length() == 1) {
            return s1.contains(s2);
        } else {
            String check = s2.substring(0, 1);
            if (s1.contains(check)) {
                int s1Index = s1.indexOf(check);
                String newS1 = s1.substring(0, s1Index)
                        + s1.substring(s1Index + 1);
                return recurse(newS1, s2.substring(1));
            }
            return false;
        }
    }
    
    
 // This function takes an array of integers and a target integer to
    // which the array elements must sum. It returns an array of all pairs
    // of integers from the input array whose sum equals the target.
    public static List<int[]> pairsThatEqualSum(int[] inputArray,
            int targetSum) {
        List<int[]> pairs = new ArrayList<int[]>();
        if (inputArray.length == 0) {
            return pairs;
        }

        for (int num : inputArray) {
            int[] pair = new int[2];
            for (int i = 0; i < inputArray.length; i++) {
                if (num + inputArray[i] == targetSum) {
                    pair[0] = num;
                    pair[1] = inputArray[i];
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }
}

