package programmers.LV0.p181905;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(e + 1, my_string.length());
        for (int i = e; i >= s; i--) {
            answer += my_string.charAt(i) + "";
        }
        answer = a + answer + b;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Progra21Sremm3", 6, 12));
        System.out.println(new Solution().solution("Stanley1yelnatS", 4, 10));
    }
}