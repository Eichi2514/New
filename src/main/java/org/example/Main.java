package org.example;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if (arr.length > 1) {
            answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            int index = 0;
            for (int i : arr) {
                if (i != min) {
                    answer[index++] = i;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        int[] asd = {4, 3, 2, 1};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(asd));
    }
}

