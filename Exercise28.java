/* Coloque em ordem crescente três números quaisquer.
Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão. */


import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number[1]: ");
        int number1 = input.nextInt();
        System.out.print("Enter the number[2]: ");
        int number2 = input.nextInt();
        System.out.print("Enter the number[3]: ");
        int number3 = input.nextInt();


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


        input.close();
    }
}

