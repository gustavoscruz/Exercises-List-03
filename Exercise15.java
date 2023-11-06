/* Verifique a validade de uma data de aniversário (solicite apenas onúmero do dia e do mês).
Além de falar se a data está ok, informe também o nome do mês.
Dica: meses com 30 dias: abril, junho, setembro e novembro. */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth, monthOfBirth;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter the birth day: ");
        dayOfBirth = input.nextInt();

        System.out.print("Enter the birth month: ");
        monthOfBirth = input.nextInt();

        if (dayOfBirth < 1 || dayOfBirth > 31 || monthOfBirth < 1 || monthOfBirth > 12) {
            System.out.println("Invalid date");
        } else if (dayOfBirth == 31 && monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        } else if (dayOfBirth > 29 && monthOfBirth == 2) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        }
        else {
            System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth);
        }

        input.close();
    }

}
