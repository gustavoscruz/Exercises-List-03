/* Faça a verificação da validade de uma data completa (dia, mês e ano).
Obs. um ano é bissexto, cujo mês de fevereiro possui 29 dias, se o resto
da divisão do ano por 4 e também por 100 for zero, ou ainda se o resto da
divisão por 400 for zero.  Os meses com 30 dias são 4, 6, 9 e 11, os demais tem 31 dias. */

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth, monthOfBirth, yearOfBirth;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter the birth day: ");
        dayOfBirth = input.nextInt();

        System.out.print("Enter the birth month: ");
        monthOfBirth = input.nextInt();

        System.out.print("Enter the birth year: ");
        yearOfBirth = input.nextInt();

        //date validation conditions
        if (dayOfBirth < 1 || dayOfBirth > 31 || monthOfBirth < 1 || monthOfBirth > 12) {
            System.out.println("Invalid date");
        } else if (dayOfBirth == 31 && (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11)) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth + ", " + yearOfBirth);
        } else if (dayOfBirth == 29 && monthOfBirth == 2 && (yearOfBirth % 4 == 0)) {
            System.out.println("You're born in " + months[monthOfBirth - 1] + " " + dayOfBirth + ", " + yearOfBirth);
        } else if (dayOfBirth > 28 && monthOfBirth == 2 && (yearOfBirth % 4 != 0)) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth + ", " + yearOfBirth);
        }
        else {
            System.out.println("You're born in " + months[monthOfBirth - 1] + " " + dayOfBirth + ", " + yearOfBirth);
        }


        input.close();
    }

}
