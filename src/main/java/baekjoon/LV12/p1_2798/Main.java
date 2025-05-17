package baekjoon.LV12.p1_2798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NM = bf.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        String[] cardsText = bf.readLine().split(" ");
        int[] cards = new int[cardsText.length];
        for (int i = 0; i < cardsText.length; i++) {
            cards[i] = Integer.parseInt(cardsText[i]);
        }
        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int cardSum = cards[i] + cards[j] + cards[k];
                    if (cardSum <= M) {
                        sum = Math.max(sum, cardSum);
                    }
                }
            }
        }
        bw.write(sum + "");
        bw.flush();
    }
}