package programmers.LV0.p120908;

class Solution {
    public static int solution(String str1, String str2) {
        int answer = 2;

        if (str1.contains(str2)) answer = 1;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(new Solution().solution("ppprrrogrammers", "pppp"));
        System.out.println(new Solution().solution("AbcAbcA", "AAA"));
    }
}