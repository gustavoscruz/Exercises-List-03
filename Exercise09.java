/* Verifique se o usuário é maior de idade ou não. */

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("How old are you: ");
        age = input.nextInt();

        if(age > 18){
            System.out.print("you are of legal age");
        }
        else if(age > 0 && age < 18){
            System.out.print("you are underage");
        }
        else{
            System.out.println("undetermined age");
        }


        input.close();
    }

}
