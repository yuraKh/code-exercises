package org.code.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Easy {

    //https://code-exercises.com/programming/easy/1/sum-of-two-numbers
    public static int sumOfTwoNumbers(int i, int j) {
        return i + j;
    }

    //https://code-exercises.com/programming/easy/7/sum-multiples-of-three-and-five
    public static int sumMultiplesOfThreeAndFive(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //https://code-exercises.com/programming/easy/10/factorial
    public static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //https://code-exercises.com/programming/easy/10/factorial
    public static int factorialRecursivly(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorialRecursivly(n - 1));
    }

    //https://code-exercises.com/programming/easy/13/linear-search
    public static int search(int n, int[] list) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == n) {
                index = i;
                break;
            }
        }
        return index;
    }

    //https://code-exercises.com/programming/easy/15/reverse-string
    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(s.length() - 1 - i));
        }
        return result.toString();
    }

    //https://code-exercises.com/programming/easy/18/find-maximum
    public static int maximum(int[] list) {
        int max = 0;
        for (int i : list) {
            max = i > max ? i : max;
        }
        return max;
    }

    //https://code-exercises.com/programming/easy/20/average-value-java-8-lambdas-and-streams
    public static double average(List<Integer> list) {
        return list.stream().mapToInt(x -> x).average().getAsDouble();
    }

    //https://code-exercises.com/programming/easy/21/convert-to-upper-case-java-8-lambdas-and-streams
    public static List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    //https://code-exercises.com/programming/easy/24/nth-odd-element
    public static int getElement(List<Integer> list, Integer n) {
        return list.size() > n ? list.get(n) : -1;
    }
}
