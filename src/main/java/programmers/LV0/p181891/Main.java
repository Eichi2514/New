package programmers.LV0.p181891;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            if (i + n < num_list.length) answer[i] = num_list[i + n];
            else answer[i] = num_list[(i + n) - num_list.length];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{2, 1, 6}, 1);
        int[] result2 = new Solution().solution(new int[]{5, 2, 1, 7, 5}, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}