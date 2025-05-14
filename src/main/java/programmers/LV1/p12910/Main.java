package programmers.LV1.p12910;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) answer.add(-1);
        Collections.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(new Solution().solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(new Solution().solution(new int[]{3, 2, 6}, 10));
    }
}