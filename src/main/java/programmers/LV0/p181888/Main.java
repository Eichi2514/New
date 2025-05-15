package programmers.LV0.p181888;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        double le = Math.ceil(num_list.length / (double) n);
        int[] answer = new int[(int) le];
        int index = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                answer[index] = num_list[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{4, 2, 6, 1, 7, 6}, 2);
        int[] result2 = new Solution().solution(new int[]{4, 2, 6, 1, 7, 6}, 4);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}