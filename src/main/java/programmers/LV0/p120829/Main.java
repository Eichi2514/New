package programmers.LV0.p120829;

class Solution {
    static int solution(int angle) {
        if ((0 < angle) && (angle < 90)) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if ((90 < angle) && (angle < 180)) {
            return 3;
        }
        return 4;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(70));
        System.out.println(new Solution().solution(91));
        System.out.println(new Solution().solution(180));
    }
}