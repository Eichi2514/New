package baekjoon.LV9.p3_9506;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String tmp = bf.readLine();
            if (tmp.equals("-1")) {
                break;
            }
            int n = Integer.parseInt(tmp);
            int n2 = 0;
            ArrayList list = new ArrayList();
            for (int i = 1; i <= n - 1; i++) {
                if (n % i == 0) {
                    list.add(i);
                    n2 += i;
                }
            }
            if (n2 == n) {
                bw.write(n + " = 1");
                for (int i = 1; i < list.size(); i++) {
                    bw.write(" + " + list.get(i));
                }
            } else {
                bw.write(n + " is NOT perfect.");
            }
            bw.newLine();
        }
        bw.flush();
    }
}