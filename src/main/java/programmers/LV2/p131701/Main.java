package programmers.LV2.p131701;

import java.util.*;

class Solution {
    public static int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> sums = new HashSet<>();

        int[] extended = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extended[i] = elements[i];
            extended[i + n] = elements[i];
        }

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = 0; k < len; k++) {
                    sum += extended[start + k];
                }
                sums.add(sum);
            }
        }

        return sums.size();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{7,9,1,1,4}));
    }
}