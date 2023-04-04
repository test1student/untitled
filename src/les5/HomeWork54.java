package les5;

import java.util.Scanner;

public class HomeWork54 {
    public static void main (String[] args) {
        System.out.print("Fibonacci sequence \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Until which number: ");
        long n = in.nextLong();
        long a = 0;
        long b = 1;
        long fi = 0;
        for (long i = 0; fi <= n; ++i) {
            System.out.println(fi);
            fi = a + b;
            a = b;
            b = fi;
        }
    }
}
