package org.example;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = bf.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);

        String[] poketList = new String[N + 1];
        HashMap<String, Integer> poketMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = bf.readLine();
            poketList[i] = name;
            poketMap.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String tmp = bf.readLine();
            if (isNumeric(tmp)) {
                bw.write(poketList[Integer.parseInt(tmp)] + "\n");
            } else {
                bw.write(poketMap.get(tmp) + "\n");
            }
        }

        bw.flush();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}