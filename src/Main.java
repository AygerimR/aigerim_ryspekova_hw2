import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in, "Cp1251");

        String name;
        System.out.print("Введите ваше  имя :");
        name = userInput.next();

        String greeting;
        System.out.print("Привет,");
        greeting= userInput.next();

        String full;
        full = name + " " + greeting;

        System.out.println("Введите ваше имя :" + full);








    }
}