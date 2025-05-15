package programmers.LV0.p120884;

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            chicken -= 9;
            answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
        System.out.println(new Solution().solution(1081));
    }
}