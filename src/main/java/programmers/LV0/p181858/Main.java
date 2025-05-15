package programmers.LV0.p181858;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        arr = Arrays.stream(arr).distinct().toArray();
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        for (int i = 0; i < arr.length && i < k; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{0, 1, 1, 2, 2, 3}, 3);
        int[] result2 = new Solution().solution(new int[]{0, 1, 1, 1, 1}, 4);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}