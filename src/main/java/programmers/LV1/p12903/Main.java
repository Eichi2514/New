package programmers.LV1.p12903;

class Solution {
    public String solution(String s) {
        String answer="";
        String[] words = s.split("");
        if (words.length%2 == 0) {
            answer = words[(words.length/2)-1] + words[words.length/2];
        }else {
            answer = words[words.length/2];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcde"));
        System.out.println(new Solution().solution("qwer"));
    }
}