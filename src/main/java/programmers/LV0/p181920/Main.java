package programmers.LV0.p181920;

import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(3,10);

        System.out.println(Arrays.toString(result1));
    }
}