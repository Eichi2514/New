package programmers.LV2.p12909;

class Solution {
    boolean solution(String s) {

        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(') count++;
            else count--;

            if (count < 0) return false;
        }

        boolean answer = (count == 0);

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("()()"));
        System.out.println(new Solution().solution("(())()"));
        System.out.println(new Solution().solution(")()("));
        System.out.println(new Solution().solution("(()("));
    }
}