package programmers.LV2.p42586;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int day = (int) Math.ceil((double) remaining / speeds[i]);
            daysQueue.offer(day);
        }

        while (!daysQueue.isEmpty()) {
            int current = daysQueue.poll();
            int count = 1;

            while (!daysQueue.isEmpty() && daysQueue.peek() <= current) {
                daysQueue.poll();
                count++;
            }

            answerList.add(count);
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        System.out.println(new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}