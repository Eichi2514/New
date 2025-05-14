package programmers.LV1.p12926;

class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("AB", 1));
        System.out.println(new Solution().solution("z", 1));
        System.out.println(new Solution().solution("a B z", 4));
    }
}