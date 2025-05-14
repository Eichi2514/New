package programmers.LV2.p138476;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        Integer[] arr = new Integer[map.size()];
        int index = 0;

        for (int value : map.values()) {
            arr[index++] = value;
        }

        Arrays.sort(arr, (a, b) -> b - a);

        int count = 0;
        int answer = 0;

        for (int a : arr) {
            count += a;
            answer++;
            if (count >= k) {
                break;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(new Solution().solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(new Solution().solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}