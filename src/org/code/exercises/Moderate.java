package org.code.exercises;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Moderate {

    //https://code-exercises.com/programming/medium/6/fizz-buzz
    public static String fizzBuzz(Integer i) {
        if (i % 5 == 0 && i % 3 == 0)
            return "FizzBuzz";
        if (i % 5 == 0)
            return "Buzz";
        if (i % 3 == 0)
            return "Fizz";
        return i.toString();
    }

    //https://code-exercises.com/programming/medium/8/prime-number
    public static boolean isPrime(Integer n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //https://code-exercises.com/programming/medium/9/fibonacci-number
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == -1) {
            return 1;
        } else {
            if (n > 0) {
                return fibonacci(n - 1) + fibonacci(n - 2);
            } else {
                return fibonacci(n + 2) - fibonacci(n + 1);
            }
        }
    }

    //https://code-exercises.com/programming/medium/3/palindrome-check
    public static boolean isPalindrome(String word) {
        char[] s = word.toCharArray();
        int length = s.length;
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
        String b = new String(s);
        return word.equals(b);
    }

    //https://code-exercises.com/programming/medium/9/fibonacci-number
    public static int fibonacciEvenSum(int n) {
        int x = 1;
        int y = 0;
        int ans = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            ans = x + y;
            x = y;
            y = ans;
            if (ans > n) {
                break;
            }
            if (ans % 2 == 0) {
                sum += ans;
            }
        }
        return sum;
    }

    //https://code-exercises.com/programming/medium/14/greatest-common-divisor
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    //https://code-exercises.com/programming/medium/16/package-rice-bags
    public static boolean packageRice(int big, int small, int goal) {
        if (big * 5 >= goal) {
            if (small >= goal % 5)
                return true;
        } else {
            if (small >= goal - big * 5) {
                return true;
            }
        }
        return false;
    }

    //https://code-exercises.com/programming/medium/19/filter-strings-java-8-lambdas-and-streams
    public static List<String> search(List<String> list) {
        return list
                .stream()
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.length() == 3)
                .collect(Collectors.toList());
    }

    //https://code-exercises.com/programming/medium/22/comma-separated-java-8-lambdas-and-streams
    public static String getString(List<Integer> list) {
        return list
                .stream()
                .map(x -> x % 2 == 0 ? "e" + x : "o" + x)
                .collect(joining(","));
    }

    //https://code-exercises.com/programming/medium/23/ceasar-cipher
    public static String decode(String code) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder decoded = new StringBuilder();
        for (char c : code.toCharArray()) {
            int index = alphabet.indexOf(c);
            if (c == ' ') {
                decoded.append(' ');
            } else if (25 - index >= 5) {
                decoded.append(alphabet.charAt(index + 5));
            } else {
                decoded.append(alphabet.charAt(index - 26 + 5));
            }
        }
        return decoded.toString();
    }
}
