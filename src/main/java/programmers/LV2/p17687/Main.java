package programmers.LV2.p17687;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String all = "";
        int num = 0;

        while (all.length() < t * m) {
            String tmp = Integer.toString(num++, n).toUpperCase();
            all += tmp;
        }

        String answer = "";

        for (int i = 0; i < t; i++) {
            answer += all.charAt(i * m + (p - 1));
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(2, 4, 2, 1));
        System.out.println(sol.solution(16, 16, 2, 1));
        System.out.println(sol.solution(16, 16, 2, 2));
    }
}