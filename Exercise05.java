/* Calcule e exiba o valor final de uma dívida.
Para isto pergunte ao usuário o valor inicial do
débito, a quantidade de meses e os juros mensais.
Use o calculo de juros simples. */

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float initialValue,  monthlyInterest, debtValue;
        int numberOfMonths;

        System.out.print("Enter initial value debt: ");
        initialValue = input.nextFloat();

        System.out.print("Enter number of months: ");
        numberOfMonths = input.nextInt();

        System.out.print("Enter monthly interest : ");
        monthlyInterest = input.nextFloat();

        debtValue = initialValue + (initialValue * (monthlyInterest / 100) * numberOfMonths);

        System.out.printf("You owe %.3f dollars", debtValue);

        input.close();
    }

}
