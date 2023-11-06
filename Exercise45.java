/* Determine o maior valor de uma lista de 100 números fornecidos pelo usuário. */

import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value, largestValue = 0;

        for(int i = 1; i <= 100; i++){

            System.out.print("Enter the value: ");
            value = input.nextInt();

            if(i == 1){
                largestValue = value;
            }

            if(value > largestValue){
                largestValue = value;
            }

        }

        System.out.print("The largest value is " + largestValue);

        input.close();
    }
}
