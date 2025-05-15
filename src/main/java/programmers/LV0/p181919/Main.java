package programmers.LV0.p181919;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList <> ();
        int num = n;
        while (num != 1) {
            answer.add(num);
            if (num % 2 == 0) num /= 2;
            else num = 3 * num + 1;
        }
        answer.add(1);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }
}