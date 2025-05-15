package programmers.LV0.p181908;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int count = 0;
        if (my_string.length() < is_suffix.length()) return answer;
        for (int i = 1; i <= is_suffix.length(); i++) {
            if (my_string.charAt(my_string.length() - i) == is_suffix.charAt(is_suffix.length() - i)) {
                count++;
            }
        }
        if (count == is_suffix.length()) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana", "ana"));
        System.out.println(new Solution().solution("banana", "nan"));
        System.out.println(new Solution().solution("banana", "wxyz"));
        System.out.println(new Solution().solution("banana", "abanana"));
    }
}