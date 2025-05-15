package programmers.LV0.p120871;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            String num = Integer.toString(answer);
            while (answer % 3 == 0 || num.contains("3")) {
                answer++;
                num = Integer.toString(answer);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
        System.out.println(new Solution().solution(40));
    }
}