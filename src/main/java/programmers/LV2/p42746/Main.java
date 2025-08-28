package programmers.LV2.p42746;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{6, 10, 2}));
        System.out.println(sol.solution(new int[]{3, 30, 34, 5, 9}));
    }
}