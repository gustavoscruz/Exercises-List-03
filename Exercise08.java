/* Transforme um número Racional (formado por numerador e denominador) para um número
Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
mensagem de alerta ao usuário se for zero. */

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator;
        double realNumber;

        System.out.print("Enter the numerator: ");
        numerator = input.nextInt();

        System.out.print("Enter the denominator: ");
        denominator = input.nextInt();
        while (denominator == 0){
            System.out.print("denominator cannot be equal to zero, enter again: ");
            denominator = input.nextInt();
        }

        realNumber = (double)numerator / denominator;

        System.out.print("The real number is " + realNumber);


        input.close();
    }

}
