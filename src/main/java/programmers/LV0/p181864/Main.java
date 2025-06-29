package programmers.LV0.p181864;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "a");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("a", "B");
        if (myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("ABBAA", "AABB"));
        System.out.println(new Solution().solution("ABAB", "ABAB"));
    }
}