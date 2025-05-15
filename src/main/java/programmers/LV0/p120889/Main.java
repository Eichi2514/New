package programmers.LV0.p120889;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] answer2 = array;
        Arrays.sort(array);
        answer[0] = array[array.length - 1];
        for (int i = 0; i < answer2.length - 1; i++) {
            if (answer2[i] == array[array.length - 1]) {
                answer[1] = i;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3});
        int[] result2 = new Solution().solution(new int[]{3, 6, 2});
        int[] result3 = new Solution().solution(new int[]{199, 72, 222});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}