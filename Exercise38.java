/* Verifique se um número é primo ou não.*/

import java.util.Scanner;

public class Exercise38
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividers = 0;

        System.out.print("Enter the natural number: ");
        int number = input.nextInt();

        if(number < 1){
            System.out.print("Enter the natural number: ");
            number = input.nextInt();
        }


        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                dividers++;
            }
        }

        if(dividers > 2){
            System.out.println(number + " isn't prime");
        }
        else {
            System.out.println(number + " is prime");
        }

    }
}