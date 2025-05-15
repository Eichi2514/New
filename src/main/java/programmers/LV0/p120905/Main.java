package programmers.LV0.p120905;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n, int[] numlist) {
        int j = 0;
        int count = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        int[] result2 = new Solution().solution(5, new int[]{1, 9, 3, 10, 13, 5});
        int[] result3 = new Solution().solution(12, new int[]{2, 100, 120, 600, 12, 12});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}