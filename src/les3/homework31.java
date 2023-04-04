package les3;

import java.util.Scanner;

public class homework31 {
    public static void main(String[] args) {
        System.out.print("Find the speed in seconds \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance Km: ");
        double S = in.nextDouble();
        System.out.print("Enter the time in minutes: ");
        double T = in.nextDouble();
        in.close();
        double T1 = T*60;
        double S1 = S*1000;
        double V = S1/T1;
        System.out.println("Spead: "+V+" m/s");
    }
}
