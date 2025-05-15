package programmers.LV0.p181854;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                if (i % 2 == 0) answer[i] = arr[i];
                else answer[i] = arr[i] + n;
            } else {
                if (i % 2 == 0) answer[i] = arr[i] + n;
                else answer[i] = arr[i];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{49, 12, 100, 276, 33}, 27);
        int[] result2 = new Solution().solution(new int[]{444, 555, 666, 777}, 100);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}