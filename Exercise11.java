/* A partir da idade informada de um cidadão diga se
ele não pode votar (idade inferior a 16),
ou se o voto é facultativo (idade menor ou igual a 16,
ou maior ou igual a 65),  ou ainda se o voto é obrigatório. */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("How old are you: ");
        age = input.nextInt();

        if(age < 16){
            System.out.print("you can't vote");
        }
        else if(age >= 18 && age <= 65){
            System.out.print("You are required to vote");
        }
        else{
            System.out.println("Optional vote");
        }


        input.close();
    }

}
