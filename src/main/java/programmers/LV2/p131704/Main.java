package programmers.LV2.p131704;

import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int box = 1;
        int idx = 0;

        while (box <= order.length) {
            if (order[idx] == box) {
                answer++;
                idx++;
                box++;
            } else if (!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                answer++;
                idx++;
            } else {
                stack.push(box);
                box++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == order[idx]) {
            stack.pop();
            answer++;
            idx++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{4, 3, 1, 2, 5}));
        System.out.println(sol.solution(new int[]{5, 4, 3, 2, 1}));
    }
}