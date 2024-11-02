package org.example;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++) {
            answer += (price * i);
        }
        if (answer > money) return answer - money;
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(3, 20, 4));
    }
}

