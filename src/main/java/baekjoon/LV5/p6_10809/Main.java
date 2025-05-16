package baekjoon.LV5.p6_10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = bf.readLine();
        int[] numbers = new int[26];
        for (int i = 0; i < 26; i++) {
            numbers[i] = -1;
        }
        for (int i = 0; i < tmp.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (tmp.charAt(i) == j + 97 && numbers[j] == -1) {
                    numbers[j] = i;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(numbers[i] + " ");
        }
        bw.flush();
    }
}