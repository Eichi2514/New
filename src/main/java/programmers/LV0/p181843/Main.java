package programmers.LV0.p181843;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana", "ana"));
        System.out.println(new Solution().solution("banana", "wxyz"));
    }
}