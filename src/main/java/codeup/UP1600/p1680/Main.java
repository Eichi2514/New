package codeup.UP1600.p1680;

public class Main {
    public static void main(String[] args) {

        for (int S = 0; S <= 9; S++) {
            for (int O = 0; O <= 9; O++) {
                for (int T = 0; T <= 9; T++) {
                    if (S == O || S == T || O == T) {
                        continue;
                    }

                    int SO = S * 10 + O;
                    int TOO = T * 100 + O * 10 + O;


                    if (SO + SO == TOO) {
                        System.out.println(S + "" + O + "+" + S + "" + O + "=" + T + "" + O + O);
                    }
                }
            }
        }
    }
}
