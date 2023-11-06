/* 1. Determine qual é a idade que o usuário faz no ano atual.
Para isso solicite o seu ano de nascimento e o ano atual. */

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yearOfBirth, currentYear;

        System.out.print("What's your year of birth: ");
        yearOfBirth = input.nextInt();

        System.out.print("What's the current year: ");
        currentYear = input.nextInt();

        if(currentYear > yearOfBirth) {
            System.out.println("Your age in the current year will be " + (currentYear - yearOfBirth) + " years");
        }
        else{
            System.out.println("It's not possible");
        }

        input.close();
    }

}
