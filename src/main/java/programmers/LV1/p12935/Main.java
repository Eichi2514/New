package programmers.LV1.p12935;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if (arr.length > 1) {
            answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            int index = 0;
            for (int i : arr) {
                if (i != min) {
                    answer[index++] = i;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{4, 3, 2, 1});
        int[] result2 = new Solution().solution(new int[]{10});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}