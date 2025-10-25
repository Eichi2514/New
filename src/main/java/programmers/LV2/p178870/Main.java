package programmers.LV2.p178870;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int left = 0, right = 0;
        int sum = sequence[0];

        int answerLeft = 0, answerRight = 0;
        int minLength = Integer.MAX_VALUE;

        while (left <= right && right < n) {
            if (sum < k) {
                right++;
                if (right < n) {
                    sum += sequence[right];
                }
            } else if (sum > k) {
                sum -= sequence[left];
                left++;
                if (left > right && left < n) {
                    right = left;
                    sum = sequence[left];
                }
            } else {
                if (right - left < minLength) {
                    minLength = right - left;
                    answerLeft = left;
                    answerRight = right;
                }

                sum -= sequence[left];
                left++;
            }
        }

        return new int[]{answerLeft, answerRight};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 2, 2, 2, 2}, 6)));
    }
}