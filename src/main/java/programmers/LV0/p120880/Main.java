package programmers.LV0.p120880;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int max = n + 1;
        int min = n - 1;
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (n == numlist[i]) {
                answer[index] = numlist[i];
                index++;
            }
        }
        while (true) {
            if (max <= 10000) {
                for (int i = 0; i < numlist.length; i++) {
                    if (max == numlist[i]) {
                        answer[index] = numlist[i];
                        index++;
                    }
                }
                max++;
            }
            if (min > 0) {
                for (int i = 0; i < numlist.length; i++) {
                    if (min == numlist[i]) {
                        answer[index] = numlist[i];
                        index++;
                    }
                }
                min--;
            } else if (max == 10001 && min == 0) break;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        int[] result2 = new Solution().solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}