package programmers.LV0.p181901;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = k, j = 0; i <= n; i += k, j++) {
            answer[j] = i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(10, 3);
        int[] result2 = new Solution().solution(15, 5);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}