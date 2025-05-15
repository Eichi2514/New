package programmers.LV0.p181912;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < intStrs.length; i++) {
            if (Integer.parseInt(intStrs[i].substring(s, s + l)) > k)
                answer.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5));
    }
}