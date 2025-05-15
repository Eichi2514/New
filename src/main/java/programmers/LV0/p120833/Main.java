package programmers.LV0.p120833;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int j = 0;
        for (int i = num1; i != num2 + 1; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        int[] result2 = new Solution().solution(new int[]{1, 3, 5}, 1, 2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}