package programmers.LV0.p181853;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{12, 4, 15, 46, 38, 1, 14});

        System.out.println(Arrays.toString(result1));
    }
}