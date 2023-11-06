/* Calcule o fatorial de um número. */

import java.util.Scanner;
public class Exercise37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        long fatorial;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        fatorial = number * (number - 1);

        for (int i = number - 2; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("fatorial is " + fatorial);

    }
}
