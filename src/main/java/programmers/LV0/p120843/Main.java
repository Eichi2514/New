package programmers.LV0.p120843;

class Solution {
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        if (k == 1) return numbers[index];

        for (int i = 1; i < k; i++) {
            index += 2;
            if (index >= numbers.length) index -= numbers.length;
        }
        answer = numbers[index];

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(new Solution().solution(new int[]{1, 2, 3}, 3));
    }
}