package programmers.LV1.p1845;

import java.util.*;

class Solution {
    public static int solution(int[] nums) {
        int answer = 1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                answer++;
            }
        }

        if (answer * 2 > nums.length) {
            answer = nums.length / 2;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 1, 2, 3}));
        System.out.println(new Solution().solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(new Solution().solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}