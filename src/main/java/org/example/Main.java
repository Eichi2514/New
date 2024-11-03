package org.example;

class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for(char ch : s.toCharArray()){
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution("1234"));
    }
}

