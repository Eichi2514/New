package programmers.LV0.p120899;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 8, 3});
        int[] result2 = new Solution().solution(new int[]{9, 10, 11, 8});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}