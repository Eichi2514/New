package programmers.LV2.p42883;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length();

        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        return sb.substring(0, sb.length() - k);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("1924", 2));
        System.out.println(sol.solution("1231234", 3));
        System.out.println(sol.solution("4177252841", 4));
    }
}