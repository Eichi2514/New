package programmers.LV0.p181933;

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag) answer = a + b;
        else answer = a - b;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(-4, 7, true));
        System.out.println(new Solution().solution(-4, 7, false));
    }
}