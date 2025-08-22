package programmers.LV2.p42584;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = prices.length - 1 - pop;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 2, 3})));
    }
}