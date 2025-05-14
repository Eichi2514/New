package programmers.LV1.p12918;

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("a234"));
        System.out.println(new Solution().solution("1234"));
    }
}