package programmers.LV1.p81301;

class Solution {
    public int solution(String s) {
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("one", "1");
        s = s.replaceAll("two", "2");
        s = s.replaceAll("three", "3");
        s = s.replaceAll("four", "4");
        s = s.replaceAll("five", "5");
        s = s.replaceAll("six", "6");
        s = s.replaceAll("seven", "7");
        s = s.replaceAll("eight", "8");
        s = s.replaceAll("nine", "9");

        return Integer.parseInt(s);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("one4seveneight"));
        System.out.println(new Solution().solution("23four5six7"));
        System.out.println(new Solution().solution("2three45sixseven"));
        System.out.println(new Solution().solution("123"));
    }
}