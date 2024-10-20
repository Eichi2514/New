package org.example;

class Solution {
    public String solution(String s) {
        String answer="";
        String[] words = s.split("");
        if (words.length%2 == 0) {
            answer = words[(words.length/2)-1] + words[words.length/2];
        }else {
            answer = words[words.length/2];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution("abcde"));
    }
}

