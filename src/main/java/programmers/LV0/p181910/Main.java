package programmers.LV0.p181910;

class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("ProgrammerS123", 11));
        System.out.println(new Solution().solution("He110W0r1d", 5));
    }
}