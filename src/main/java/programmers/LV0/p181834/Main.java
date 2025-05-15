package programmers.LV0.p181834;

class Solution {
    public String solution(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 108) {
                myString = myString.replace(myString.charAt(i), 'l');
            }
        }
        String answer = myString;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcdevwxyz"));
        System.out.println(new Solution().solution("jjnnllkkmm"));
    }
}