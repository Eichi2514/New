package org.example;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // int[] asd = {1,2,3,4};
        String[] qwe = {"Jane", "Kim"};
        System.out.println(new Solution().solution(qwe));
    }
}

