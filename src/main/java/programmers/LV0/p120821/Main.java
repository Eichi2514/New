package programmers.LV0.p120821;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[i] = num_list[index];
            index++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = new Solution().solution(new int[]{1, 1, 1, 1, 1, 2});
        int[] result3 = new Solution().solution(new int[]{1, 0, 1, 1, 1, 3, 5});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}