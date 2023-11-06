/* Aproveitando o algoritmo do exercício anterior, exiba uma
lista de 40 grupos de números sorteados de 0 a 59. Cada grupo
possui 3 números e deve exibido em ordem crescente. */

import java.util.Scanner;
import java.util.Random;

public class Exercise42 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random(5871293);

        for(int i = 1; i <= 40; i++){
            int number1 = random.nextInt(1,101);
            int number2 = random.nextInt(1,101);
            int number3 = random.nextInt(1,101);

            if(number1 > number2 && number2 > number3){
                System.out.println(number3 + " " + number2 + " " + number1);
            }
            else if(number1 > number3 && number3 > number2){
                System.out.println(number2 + " " + number3 + " " + number1);
            }
            else if(number2 > number1 && number1 > number3){
                System.out.println(number3 + " " + number1 + " " + number2);
            }
            else if(number2 > number3 && number3 > number1){
                System.out.println(number1 + " " + number3 + " " + number2);
            }
            else if(number3 > number2 && number2 > number1){
                System.out.println(number1 + " " + number2 + " " + number3);
            }
            else {
                System.out.println(number2 + " " + number1 + " " + number3);
            }

        }

        input.close();
    }
}
