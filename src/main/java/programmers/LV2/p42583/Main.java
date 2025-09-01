package programmers.LV2.p42583;

import java.util.*;

class Solution {
    private static class Truck {
        int w;
        int exit;
        Truck(int w, int exit) { this.w = w; this.exit = exit; }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Truck> bridge = new ArrayDeque<>();
        int currWeight = 0;
        int time = 0;
        int nextEnter = 1;
        int answer = 0;

        for (int w : truck_weights) {
            while (true) {
                time = Math.max(time, nextEnter);

                while (!bridge.isEmpty() && bridge.peekFirst().exit <= time) {
                    currWeight -= bridge.pollFirst().w;
                }

                if (bridge.size() < bridge_length && currWeight + w <= weight) {
                    int exitTime = time + bridge_length;
                    bridge.addLast(new Truck(w, exitTime));
                    currWeight += w;
                    answer = exitTime;

                    nextEnter = time + 1;
                    break;
                }

                time = bridge.peekFirst().exit;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(sol.solution(100, 100, new int[]{10}));
        System.out.println(sol.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}