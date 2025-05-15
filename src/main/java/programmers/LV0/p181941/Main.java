package programmers.LV0.p181941;

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"a", "b", "c"}));
    }
}