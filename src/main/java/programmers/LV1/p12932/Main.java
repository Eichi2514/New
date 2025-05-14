package programmers.LV1.p12932;

import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        while (n > 0) {
            answer.add(n % 10);
            n /= 10;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(12345));
    }
}