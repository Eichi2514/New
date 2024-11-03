package org.example;

class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        int max = a;
        int min = (n * m) / max;
        return new int[]{max, min};
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1,2}, {2,3}};
        // int[][] asd4 = {{3,4}, {5,6}};
        System.out.println(new Solution().solution(2, 5));
    }
}

