package programmers.LV0.p120851;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
        System.out.println(new Solution().solution("1a2b3c4d123"));
    }
}