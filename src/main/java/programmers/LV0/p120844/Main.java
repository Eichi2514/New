package programmers.LV0.p120844;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i != 0) answer[i] = numbers[i - 1];
                else answer[i] = numbers[numbers.length - 1];
            }
        }
        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i != numbers.length - 1) answer[i] = numbers[i + 1];
                else answer[i] = numbers[0];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3}, "right");
        int[] result2 = new Solution().solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}