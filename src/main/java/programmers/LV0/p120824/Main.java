package programmers.LV0.p120824;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int S = 0;
        int Y = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) S++;
            else if (num_list[i] % 2 != 0) Y++;
        }
        answer[0] = S;
        answer[1] = Y;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = new Solution().solution(new int[]{1, 3, 5, 7});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}