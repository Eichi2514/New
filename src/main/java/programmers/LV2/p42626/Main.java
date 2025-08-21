package programmers.LV2.p42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> tmp = new PriorityQueue<>();
        for (int s : scoville) {
            tmp.add(s);
        }

        int answer = 0;
        while (tmp.size() > 1 && tmp.peek() < K) {
            int first = tmp.poll();
            int second = tmp.poll();
            int mixed = first + (second * 2);
            tmp.add(mixed);
            answer++;
        }

        if (tmp.peek() >= K) {
            return answer;
        } else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}