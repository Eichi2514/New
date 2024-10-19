package org.example;

class Solution {
    public String solution(String phone_number) {
        String a = "";
        for (int i = 0; i < phone_number.length()-4; i++) {
            a +=  "*";
        }
        String b = phone_number.substring(phone_number.length()-4);
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {4, 3, 2, 1};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution("01033334444"));
    }
}

