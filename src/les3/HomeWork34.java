package les3;

import java.util.Scanner;

public class HomeWork34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sum all digits of a number \n");
        System.out.print("Enter a five-digit number: ");
        int N = in.nextInt();
        int N1 = N / 10000;
        int N2 = N / 1000 % 10;
        int N3 = N / 100 % 10;
        int N4 = N / 10 % 10;
        int N5 = N % 10;
        int S = N1 + N2 + N3 + N4 + N5;
        System.out.print("Sum: "+S);
    }
}