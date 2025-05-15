package programmers.LV0.p181927;

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else answer[num_list.length] = num_list[num_list.length - 1] * 2;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{2, 1, 6});
        int[] result2 = new Solution().solution(new int[]{5, 2, 1, 7, 5});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}