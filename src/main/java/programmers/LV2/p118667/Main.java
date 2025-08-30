package programmers.LV2.p118667;

import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0, sum2 = 0;
        int n = queue1.length;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int num : queue1) {
            q1.add(num);
            sum1 += num;
        }

        for (int num : queue2) {
            q2.add(num);
            sum2 += num;
        }

        int count = 0;
        int limit = n * 3;

        while (count <= limit) {
            if (sum1 == sum2) return count;

            if (sum1 > sum2) {
                int x = q1.poll();
                sum1 -= x;
                sum2 += x;
                q2.add(x);
            } else {
                int x = q2.poll();
                sum2 -= x;
                sum1 += x;
                q1.add(x);
            }

            count++;
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        System.out.println(sol.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
        System.out.println(sol.solution(new int[]{1, 1}, new int[]{1, 5}));
    }
}