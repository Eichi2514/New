package programmers.LV0.p181878;

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        int answer = 0;
        if (myString.contains(pat)) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("AbCdEfG", "aBc"));
        System.out.println(new Solution().solution("aaAA", "aaaaa"));
    }
}