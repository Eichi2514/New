package programmers.LV1.p12917;

import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";
        for (String str : arr) {
            answer += str;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Zbcdefg"));
    }
}