package programmers.LV1.p12930;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                sb.append(' ');
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                idx++;
            }
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("try hello world"));
    }
}