package programmers.LV0.p181942;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i) + "" + str2.charAt(i);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aaaaa", "bbbbb"));
    }
}