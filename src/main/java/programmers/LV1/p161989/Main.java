package programmers.LV1.p161989;

class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int num = section[0];

        for (int i = 0; i < section.length; i++) {
            if (num + m - 1 < section[i]) {
                answer++;
                num = section[i];
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(8, 4, new int[]{2, 3, 6}));
        System.out.println(new Solution().solution(5, 4, new int[]{1, 3}));
        System.out.println(new Solution().solution(4, 1, new int[]{1, 2, 3, 4}));
    }
}