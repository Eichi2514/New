package programmers.LV0.p120904;

class Solution {
    public static int solution(int num, int k) {
        int count = 1;
        int answer = -1;
        boolean chack = false;
        while (num > 0) {
            if (num % 10 == k) {
                answer = count;
                chack = true;
            }
            num = num / 10;
            count++;
        }
        if (chack) {
            answer = count - answer;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29183, 1));
        System.out.println(new Solution().solution(232443, 4));
        System.out.println(new Solution().solution(123456, 7));
    }
}