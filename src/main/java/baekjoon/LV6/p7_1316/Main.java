package baekjoon.LV6.p7_1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] checks = new int[26];
            int check = 0;
            String tmp = bf.readLine();
            int A = -1;
            for (int j = 0; j < tmp.length(); j++) {
                int a = tmp.charAt(j);
                if (check != a) {
                    if (checks[a - 'a'] == 0) {
                        checks[a - 'a'] = 1;
                        check = a;
                    } else {
                        A = 0;
                        break;
                    }
                }
                A = 1;
            }
            if (A == 1) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}