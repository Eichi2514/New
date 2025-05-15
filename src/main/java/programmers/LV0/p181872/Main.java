package programmers.LV0.p181872;

class Solution {
    public static String solution(String myString, String pat) {
        String answer = "";
        String[] tmp = new String[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            tmp[i] = myString.substring(0, i + 1);
        }
        for (int i = 0; i < tmp.length; i++) {
            int counter = 0;
            for (int j = 0; j < pat.length(); j++) {
                if (tmp[i].charAt(tmp[i].length() - 1) == pat.charAt(pat.length() - 1)) {
                    counter++;
                }
                if (counter == pat.length()) answer = tmp[i];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("AbCdEFG", "dE"));
        System.out.println(new Solution().solution("AAAAaaaa", "a"));
    }
}