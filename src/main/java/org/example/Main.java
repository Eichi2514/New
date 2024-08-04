package org.example;



public class Main {
    public static void main(String[] args) {
        int[] a = {12, 4, 15, 1, 14};
//        int[][] b = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        System.out.println(Solution.solution(a));
    }
}

class Solution {
    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if ((num_list[i] % 2) == 0) {
                    num_list[i] /= 2;
                    answer++;
                }
                else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}