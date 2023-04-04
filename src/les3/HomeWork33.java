package les3;

import java.util.Scanner;

public class HomeWork33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String N = in.nextLine();
        System.out.print("Your surname: ");
        String Sn = in.nextLine();
        System.out.print("Your patronymic: ");
        String P = in.nextLine();
        System.out.print("Your age: ");
        int A = in.nextInt();
        System.out.print("Your salary: ");
        int S = in.nextInt();
        System.out.print(Sn+" "+N+" "+P+"\n");
        System.out.print("Age: "+A+", Salary: "+S);
    }
}
