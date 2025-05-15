package programmers.LV0.p181852;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});

        System.out.println(Arrays.toString(result1));
    }
}