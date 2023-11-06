/* Exiba dois números fornecidos pelo usuário em ordem crescente. */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("In ascending order " + number2 + ", " + number1);
        } else {
            System.out.println("In ascending order " + number1 + ", " + number2);
        }
    }
}