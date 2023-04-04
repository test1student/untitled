package les6;

public class ClassIf {
    static int Calc(int a, int b, int operation) {
        int result = 0;
        switch (operation) {
            case 1:
                result = (a + b);
                break;
            case 2:
                result = (a - b);
                break;
            case 3:
                result = (a * b);
                break;
            case 4:
                result = (a / b);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }

    static double Calc(double a, int b, int operation) {
        double result = 0;
        switch (operation) {
            case 1:
                result = (a + b);
                break;
            case 2:
                result = (a - b);
                break;
            case 3:
                result = (a * b);
                break;
            case 4:
                result = (a / b);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }

    static double Calc(int a, double b, int operation) {
        double result = 0;
        switch (operation) {
            case 1:
                result = (a + b);
                break;
            case 2:
                result = (a - b);
                break;
            case 3:
                result = (a * b);
                break;
            case 4:
                result = (a / b);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }

    static double Calc(double a, double b, int operation) {
        double result = 0;
        switch (operation) {
            case 1:
                result = (a + b);
                break;
            case 2:
                result = (a - b);
                break;
            case 3:
                result = (a * b);
                break;
            case 4:
                result = (a / b);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Calc(20,30,  2));
    }
}
