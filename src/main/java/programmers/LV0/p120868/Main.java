package programmers.LV0.p120868;

class Solution {
    public int solution(int[] sides) {
        int s;
        int m;
        if (sides[0] <= sides[1]) {
            s = sides[0];
            m = sides[1];
        } else {
            s = sides[1];
            m = sides[0];
        }
        int answer = (m - ((m + 1) - s)) + ((s + m)) - m;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2}));
        System.out.println(new Solution().solution(new int[]{3, 6}));
        System.out.println(new Solution().solution(new int[]{11, 7}));
    }
}
