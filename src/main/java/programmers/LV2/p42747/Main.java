package programmers.LV2.p42747;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        int h = 0;

        for (int i = 0; i < n; i++) {
            int cited = citations[n - 1 - i];
            int candidate = i + 1;
            if (cited >= candidate) {
                h = candidate;
            } else {
                break;
            }
        }
        return h;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 0, 6, 1, 5}));
    }
}