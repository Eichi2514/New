package programmers.LV0.p120895;

class Solution {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i != num1 && i != num2) answer += my_string.charAt(i);
            else if (i == num1) answer += my_string.charAt(num2);
            else if (i == num2) answer += my_string.charAt(num1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", 1, 2));
        System.out.println(new Solution().solution("I love you", 3, 6));
    }
}