/* Modifique o problema anterior para que a quantidade
de valores também seja fornecida pelo usuário. */

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float value, valueSum = 0;

        System.out.print("Enter the quantity of values: ");
        int quantityOfValues = input.nextInt();

        for(int i = 1; i <= quantityOfValues; i++){
            System.out.print("Enter the value: ");
            value = input.nextFloat();
            valueSum += value;
        }

        System.out.print("The average is " + valueSum / quantityOfValues);

        input.close();
    }
}
