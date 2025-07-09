package codeup.UP1600.p1640;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ss = new String[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.length() <= 3 || s.contains("tap") || s.contains("xocure")) {
                ss[count] = s;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(ss[i]);
        }

        if(count <= 3) System.out.println("safe");
        else if (count <= 6) System.out.println("warning");
        else System.out.println("danger");
    }
}