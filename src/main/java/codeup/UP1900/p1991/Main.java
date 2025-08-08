package codeup.UP1900.p1991;

import java.util.Scanner;

public class Main {
    static int[] cd = new int[128];
    static int[][] next = {
            {0,1,2,0,1,2,0,1,2,0},
            {1,2,0,1,2,0,1,2,0,1},
            {2,0,1,2,0,1,2,0,1,2}
    };
    static int[] out = {1,0,0};

    static int f(String s, int st) {
        try {
            int d = cd[s.charAt(0)];
            return f(s.substring(1), next[st][d]);
        } catch (Exception e) {
            return st;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        cd['0']=0; cd['1']=1; cd['2']=2; cd['3']=3; cd['4']=4;
        cd['5']=5; cd['6']=6; cd['7']=7; cd['8']=8; cd['9']=9;
        System.out.println(out[f(n,0)]);
    }
}