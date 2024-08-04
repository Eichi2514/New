package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{1,3},{0,4}};
        System.out.println(Solution.solution(b));
    }
}
class Solution {
    public static int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer++;
                }
            }
        }
        if (answer == arr.length*arr[0].length) {
            return 1;
        } else return 0;
    }
}