/* Solicite o nome e a idade de duas pessoas.
Em seguida exiba o nome da pessoa mais
velha e o nome da pessoa mais nova. */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;


        System.out.print("Enter the name: ");
        name1 = input.nextLine();
        System.out.print("How old are you: ");
        int age1 = input.nextInt();

        System.out.print("Enter the name: ");
        name2 = input.next();
        System.out.print("How old are you: ");
        int age2 = input.nextInt();


        if (age1 > age2) {
            System.out.println(name1 + " is older than " + name2);
        } else {
            System.out.println(name2 + " is older than " + name1);
        }
    }
}