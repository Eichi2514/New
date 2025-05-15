package programmers.LV0.p181899;

import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[(start_num - end_num) + 1];
        for (int i = start_num, j = 0; i >= end_num; i--, j++) {
            answer[j] = i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(10, 3);

        System.out.println(Arrays.toString(result1));
    }
}