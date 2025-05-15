package programmers.LV0.p181931;

class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] nums = new int[included.length];
        for (int i = a, j = 0; j < included.length; i += d, j++) {
            nums[j] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (included[i]) {
                answer += nums[i];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(new Solution().solution(7, 1, new boolean[]{false, false, false, true, false, false, false}));
    }
}