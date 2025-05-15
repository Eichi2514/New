package programmers.LV0.p181911;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}