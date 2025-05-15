package programmers.LV0.p181906;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int count = 0;
        if (my_string.length() > is_prefix.length()) {
            for (int i = 0; i < is_prefix.length(); i++) {
                if (my_string.charAt(i) == is_prefix.charAt(i)) {
                    count++;
                }
            }
        }
        if (count == is_prefix.length()) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana", "ban"));
        System.out.println(new Solution().solution("banana", "nan"));
        System.out.println(new Solution().solution("banana", "abcd"));
        System.out.println(new Solution().solution("banana", "bananan"));
    }
}