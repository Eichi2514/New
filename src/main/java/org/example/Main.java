package org.example;



public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
//        int[][] b = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        System.out.println(Solution.solution(a));
    }
}

class Solution {
    public static int[] solution(int[] arr) {
        int idx = 1;
        while (idx < arr.length) {
            idx *= 2;
        }
        int[] answer = new int[idx];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}