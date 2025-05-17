package baekjoon.LV14.p1_10815;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[] tmps1 = bf.readLine().split(" ");

        int m = Integer.parseInt(bf.readLine());
        String[] tmps2 = bf.readLine().split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(tmps2[i], 0);
        }
        for (int i = 0; i < n; i++) {
            map.put(tmps1[i], 1);
        }

        for (int i = 0; i < m; i++) {
            bw.write(map.get(tmps2[i]) + " ");
        }

        bw.flush();
    }
}