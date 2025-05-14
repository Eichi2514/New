package programmers.LV1.p147355;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tNumber = Long.parseLong(t.substring(i, i + p.length()));
            if (tNumber <= pNumber) {
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3141592", "271"));
        System.out.println(new Solution().solution("500220839878", "7"));
        System.out.println(new Solution().solution("10203", "15"));
    }
}