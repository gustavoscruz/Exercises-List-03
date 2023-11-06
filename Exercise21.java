/* Exiba o valor do empréstimo possível para um funcionário de uma empresa. */

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String post = input.nextLine().toLowerCase();

        if (post.equals("diretoria")) {
            System.out.println("30% of salary");
        }
        else if(post.equals("gerencia")) {
            System.out.println("25% of salary");
        }
        else if(post.equals("operacional")) {
            System.out.println("20% of salary");
        }
        else{
            System.out.println("Not found");
        }

    }
}