package programmers.LV0.p181871;

class Solution {
    public static int solution(String myString, String pat) {
        int answer = 0;
        String[] tmp = new String[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            tmp[i] = myString.substring(i);
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].startsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana", "ana"));
        System.out.println(new Solution().solution("aaaa", "aa"));
    }
}