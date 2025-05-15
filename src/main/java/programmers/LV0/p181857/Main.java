package programmers.LV0.p181857;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int idx = 1;
        while (idx < arr.length) {
            idx *= 2;
        }
        int[] answer = new int[idx];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5, 6});
        int[] result2 = new Solution().solution(new int[]{58, 172, 746, 89});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}