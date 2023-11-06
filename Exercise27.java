/* Determine o maior valor de uma lista de 100 números fornecidos pelo usuário. */


/* Aproveitando o algoritmo do exercício anterior, exiba uma
lista de 40 grupos de números sorteados de 0 a 59. Cada grupo
possui 3 números e deve exibido em ordem crescente. */

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int largestNumber = 0, equalNumbers = 0;

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter the number[" + i + "]: ");
            numbers[i] = input.nextInt();
        }

        largestNumber = numbers[0];

        for(int i = 1; i < numbers.length; i++){

            if(numbers[i] == largestNumber){
                equalNumbers++;
            }

            if(numbers[i] >= largestNumber){
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number is " + largestNumber);
        if(equalNumbers != 0){
            System.out.println(equalNumbers + 1 + " numbers are equal");
        }

        input.close();
    }
}

