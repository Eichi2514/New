package programmers.LV0.p181892;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{2, 1, 6}, 3);
        int[] result2 = new Solution().solution(new int[]{5, 2, 1, 7, 5}, 2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}