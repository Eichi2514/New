package programmers.LV0.p181882;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && (arr[i] % 2) == 0) answer[i] = arr[i] / 2;
            else if (arr[i] < 50 && arr[i] % 2 != 0) answer[i] = arr[i] * 2;
            else answer[i] = arr[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 100, 99, 98});

        System.out.println(Arrays.toString(result1));
    }
}