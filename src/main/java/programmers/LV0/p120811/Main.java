package programmers.LV0.p120811;

import java.util.Arrays;

class Solution {
    public static int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(new Solution().solution(new int[]{9, -1, 0}));
    }
}