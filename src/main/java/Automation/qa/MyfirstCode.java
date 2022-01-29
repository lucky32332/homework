package Automation.qa;

import java.io.PrintStream;
import java.util.Scanner;

public class MyfirstCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String hobby = scanner.nextLine();

        System.out.printf("Enter your first name: %s second name: %s age: %d and and your hobby: %s"
                , firstName, lastName, age, hobby);
    }
}