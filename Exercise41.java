/* Crie um jogo para o usuário descobrir um número sorteado de 1 a 100.
A cada tentativa dele, forneça uma dica falando se o número é maior ou menor.
Quando ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.
 */

import java.util.Scanner;
import java.util.Random;

public class Exercise41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random(5871293);

        int correctNumber = random.nextInt(1,101);

        System.out.print("Enter the number: ");
        int playerNumber = input.nextInt();

        while (playerNumber != correctNumber){
            if(playerNumber > correctNumber){
                System.out.println("the correct number is shorter");
            } else {
                System.out.println("the correct number is larger");
            }
            System.out.print("Enter the number: ");
            playerNumber = input.nextInt();
        }

        System.out.print("Congratulations!!!");

        input.close();
    }
}
