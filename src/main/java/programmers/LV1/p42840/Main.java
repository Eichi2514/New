package programmers.LV1.p42840;

import java.util.*;

class Solution {
    public static int[] solution(int[] answers) {
        int[] answer;
        int testNo1 = 0;
        int testNo2 = 0;
        int testNo3 = 0;
        int[] tester1 = {1, 2, 3, 4, 5};
        int[] tester2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] tester3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (i >= tester1.length) {
                if (answers[i] == tester1[i % 5]) {
                    testNo1++;
                }
            } else {
                if (answers[i] == tester1[i]) {
                    testNo1++;
                }
            }

            if (i >= tester2.length) {
                if (answers[i] == tester2[i % 8]) {
                    testNo2++;
                }
            } else {
                if (answers[i] == tester2[i]) {
                    testNo2++;
                }
            }

            if (i >= tester3.length) {
                if (answers[i] == tester3[i % 10]) {
                    testNo3++;
                }
            } else {
                if (answers[i] == tester3[i]) {
                    testNo3++;
                }
            }
        }

        if (testNo1 == testNo2 && testNo1 == testNo3) {
            answer = new int[]{1, 2, 3};
        } else if (testNo1 == testNo2) {
            if (testNo3 > testNo1) {
                answer = new int[]{3};
            } else answer = new int[]{1, 2};
        } else if (testNo2 == testNo3) {
            if (testNo1 > testNo2) {
                answer = new int[]{1};
            } else answer = new int[]{2, 3};
        } else if (testNo1 == testNo3) {
            if (testNo2 > testNo1) {
                answer = new int[]{2};
            } else answer = new int[]{1, 3};
        } else {
            if (testNo1 > testNo2 && testNo1 > testNo3) answer = new int[]{1};
            else if (testNo2 > testNo1 && testNo2 > testNo3) answer = new int[]{2};
            else answer = new int[]{3};
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = new Solution().solution(new int[]{1, 3, 2, 4, 2});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}