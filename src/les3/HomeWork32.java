package les3;

import java.util.Scanner;

public class HomeWork32 {
    public static void main(String[] args) {
        System.out.print("Find the area and volume of the cube \n");
        Scanner in = new Scanner(System.in);
        System.out.print("The length of a cube face cm: ");
        double a = in.nextDouble();
        double S = 6*Math.pow(a, 2);
        double V = Math.pow(a, 3);
        System.out.println("Cube area cm: "+S);
        System.out.println("Volume of a cube cm: "+V);
    }
}