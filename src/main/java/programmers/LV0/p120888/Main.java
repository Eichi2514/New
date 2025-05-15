package programmers.LV0.p120888;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        while (!my_string.equals("")) {
            answer += my_string.charAt(0);
            String a = String.valueOf(my_string.charAt(0));
            my_string = my_string.replace(a, "");
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("people"));
        System.out.println(new Solution().solution("We are the world"));
    }
}