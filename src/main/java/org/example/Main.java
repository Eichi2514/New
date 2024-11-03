package org.example;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr1;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        int[][] asd3 = {{1,2}, {2,3}};
        int[][] asd4 = {{3,4}, {5,6}};
        System.out.println(new Solution().solution(asd3, asd4));
    }
}

