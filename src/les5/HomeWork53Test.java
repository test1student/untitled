package les5;

import java.util.Scanner;

public class HomeWork53Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int D = scan.nextInt();
        int[] S = new int[D];
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            S[i] = scan.nextInt();
        }

        System.out.println(S);

        for (int i = 0; i < D; i++) {
            if (S[i] - S[n - 1] == D) {
                System.out.println(D);
            } else {
                System.out.println(0);
            }
        }
        System.out.println(S);
    }
}
