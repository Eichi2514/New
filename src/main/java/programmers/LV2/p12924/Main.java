package programmers.LV2.p12924;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = i + 1; j <= n; j++) {
                num += j;
                if (num >= n) break;
            }
            if (num == n) answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
    }
}