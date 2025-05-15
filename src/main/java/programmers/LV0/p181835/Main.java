package programmers.LV0.p181835;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) answer[i] = arr[i] + k;
            else answer[i] = arr[i] * k;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
        int[] result2 = new Solution().solution(new int[]{1, 2, 3, 100, 99, 98}, 2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}