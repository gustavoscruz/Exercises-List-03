/* Calcule e exiba a comissão de 10% de um garçom num
restaurante a partir do valor da despesa de um cliente. */

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float moneySpent;

        System.out.print("How much money did the costumer spend: ");
        moneySpent = input.nextFloat();

        System.out.print("The tip of the waiter will be: " + moneySpent * 0.1 + " dollars");

        input.close();
    }

}
