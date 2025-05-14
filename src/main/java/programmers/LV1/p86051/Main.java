package programmers.LV1.p86051;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int j = 0; j < 10; j++) {
            boolean chack = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == j) {
                    chack = false;
                }
            }
            if (chack) answer += j;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(new Solution().solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}