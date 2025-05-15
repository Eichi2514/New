package programmers.LV0.p181870;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].contains("ad"))) answer.add(strArr[i]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"and", "notad", "abcd"}));
        System.out.println(new Solution().solution(new String[]{"there", "are", "no", "a", "ds"}));
    }
}