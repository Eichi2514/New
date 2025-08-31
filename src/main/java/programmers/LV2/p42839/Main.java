package programmers.LV2.p42839;

import java.util.*;

class Solution {
    Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        permutation("", numbers);

        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    private void permutation(String prefix, String remaining) {
        if (!prefix.equals("")) {
            numberSet.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < remaining.length(); i++) {
            permutation(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("17"));
        System.out.println(sol.solution("011"));
    }
}