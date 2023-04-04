package les5;

import java.util.Scanner;

public class HomeWork53 {
    public static void main(String[] args) {
    double i = 1;
    double b = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N progression: ");
        double n = in.nextDouble();
//
//        System.out.println("WhileExampleArithmetic");
//
//        while (arw <= b) {
//            System.out.println(arw);
//            arw = a1 + tmp1;
//            a1 = tmp1;
//            tmp1 = arw;
//        }
//
        System.out.println("DoExampleArithmetic");

        do {
            System.out.println(i);

        } while (i <= b);

        System.out.println("ForExampleArithmetic");

        for (i = 1; i <= b;  i = i + n) {
            System.out.println(i);
        }
    }
}