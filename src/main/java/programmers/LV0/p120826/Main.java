package programmers.LV0.p120826;

class Solution {
    public static String solution(String my_string, String letter) {

        return my_string.replace(letter, "");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcdef", "f"));
        System.out.println(new Solution().solution("BCBdbe", "B"));
    }
}