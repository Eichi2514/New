package programmers.LV0.p181917;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        if ((x1 || x2) && (x3 || x4)) answer = true;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(false, true, true, true));
        System.out.println(new Solution().solution(true, false, false, false));
    }
}