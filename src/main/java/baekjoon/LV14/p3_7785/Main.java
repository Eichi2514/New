package baekjoon.LV14.p3_7785;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        HashMap<String, Boolean> map = new HashMap<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            String[] tmp = bf.readLine().split(" ");
            if (tmp[1].equals("enter")) {
                map.put(tmp[0], true);
                num++;
            } else if (tmp[1].equals("leave")) {
                map.put(tmp[0], false);
                num--;
            }
        }

        String[] tmps = new String[num];
        int index = 0;
        for (String key : map.keySet()) {
            if (map.get(key)) {
                tmps[index] = key;
                index++;
            }
        }

        Arrays.sort(tmps);

        for (int i = tmps.length - 1; i >= 0; i--) {
            bw.write(tmps[i]);
            bw.newLine();
        }

        bw.flush();
    }
}