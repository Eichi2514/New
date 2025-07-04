package programmers.LV2.p12939;

import java.util.*;

class Solution {
    public String solution(String s) {

        String[] strs = s.split(" ");

        int[] nums = new int[strs.length];

        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(nums);

        String answer = nums[0] + " " + nums[nums.length-1];

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 3 4"));
        System.out.println(new Solution().solution("-1 -2 -3 -4"));
        System.out.println(new Solution().solution("-1 -1"));
    }
}