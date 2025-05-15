package programmers.LV0.p181838;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int day1 = (date1[0] * 365) + (date1[1] * 30) + date1[2];
        int day2 = (date2[0] * 365) + (date2[1] * 30) + date2[2];
        if (day1 < day2) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(new Solution().solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }
}