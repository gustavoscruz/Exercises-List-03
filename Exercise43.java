/* Calcule a média aritmética de 500 valores fornecidos pelo usuário. */

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float value, valueSum = 0;

        for(int i = 1; i <= 500; i++){
            System.out.print("Enter the value: ");
            value = input.nextFloat();
            valueSum += value;
        }

        System.out.print("The average is " + valueSum / 500);

        input.close();
    }
}
