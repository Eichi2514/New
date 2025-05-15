package programmers.LV0.p120841;

class Solution {
    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        }
        if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 4}));
        System.out.println(new Solution().solution(new int[]{-7, 9}));
    }
}