package programmers.LV0.p120853;

class Solution {
    public int solution(String s) {
        String[] words = s.split(" ");
        int answer = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("Z")) {
                answer += Integer.parseInt(words[i]);
            } else {
                answer -= Integer.parseInt(words[i - 1]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 Z 3"));
        System.out.println(new Solution().solution("10 20 30 40"));
        System.out.println(new Solution().solution("10 Z 20 Z 1"));
        System.out.println(new Solution().solution("10 Z 20 Z"));
        System.out.println(new Solution().solution("-1 -2 -3 Z"));
    }
}