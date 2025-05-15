package programmers.LV0.p120809;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = new Solution().solution(new int[]{1, 2, 100, -99, 1, 2, 3});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}