package programmers.LV0.p181842;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abc", "aabcc"));
        System.out.println(new Solution().solution("tbt", "tbbttb"));
    }
}