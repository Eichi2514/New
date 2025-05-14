package programmers.LV2.p12953;

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        int answer = arr[0];

        while (true) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] == 0) count++;
            }

            if (count == arr.length) break;
            else answer += arr[0];
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 6, 8, 14}));
        System.out.println(new Solution().solution(new int[]{1, 2, 3}));
    }
}