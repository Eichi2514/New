package programmers.LV0.p181939;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c1 = a + "" + b;
        String c2 = b + "" + a;
        if (Integer.parseInt(c1) >= Integer.parseInt(c2)) {
            answer = Integer.parseInt(c1);
        } else answer = Integer.parseInt(c2);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(9, 91));
        System.out.println(new Solution().solution(89, 8));
    }
}