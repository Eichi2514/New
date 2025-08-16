package programmers.LV2.p42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        int order = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.add(current);
            } else {
                order++;
                if (current[0] == location) {
                    return order;
                }
            }
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(sol.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}