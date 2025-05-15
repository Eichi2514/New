package programmers.LV0.p181884;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (answer <= n) answer += numbers[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(new Solution().solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}