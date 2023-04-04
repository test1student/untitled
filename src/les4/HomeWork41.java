package les4;

import java.util.Scanner;

public class HomeWork41 {
    public static void main(String[] args) {
        System.out.print("Find the maximum, minimum and middle of the three numbers \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Number one: ");
        int a = in.nextInt();
        System.out.print("Number two: ");
        int b = in.nextInt();
        System.out.print("Number three: ");
        int c = in.nextInt();
        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int mid = a + b + c - (min + max);
        System.out.print("________________ \n");
        System.out.println("Number max: "+max);
        System.out.println("Number min: "+min);
        System.out.println("Number mid: "+mid);
    }
}
