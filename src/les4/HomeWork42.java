package les4;

import java.util.Scanner;

public class HomeWork42 {
    public static void main(String[] args) {
        System.out.print("Це Українсько-англійський перекладач, введіть одно з слів яке він знає: Вітер, Дощ, Сніг, Сонце, Туман, Хмарно, Гроза, Град, Спека, Холод \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введить слово для перекладу з словника: ");
        String a = in.nextLine();
        String word = String.valueOf(a);
        switch (word) {
            case "Вітер":
                System.out.println("Wind");
                break;
            case "Дощ":
                System.out.println("Rain");
                break;
            case "Сніг":
                System.out.println("Snow");
                break;
            case "Сонце":
                System.out.println("Sun");
                break;
            case "Туман":
                System.out.println("Fog");
                break;
            case "Хмарно":
                System.out.println("Cloudy");
                break;
            case "Гроза":
                System.out.println("Thunderstorm");
                break;
            case "Град":
                System.out.println("Hail");
                break;
            case "Спека":
                System.out.println("Heat");
                break;
            case "Холод":
                System.out.println("Cold");
                break;
            default:
                System.out.println("Словар не містить слова " + word);
        }
    }

}