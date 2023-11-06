/* Verifique se um número é perfeito, ou seja, se a soma dos
seus divisores (exceto o próprio número) é igual a ele mesmo.
 */

import java.util.Scanner;

public class Exercise39
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


        for(int i = 1; i < number; i++){
            if(number % i == 0){
                dividers += i;
            }
        }

        if(dividers == number){
            System.out.println(number + " is perfect");
        }
        else {
            System.out.println(number + " isn't perfect");
        }

    }
}