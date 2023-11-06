/* Verifique quem entre duas pessoas faz aniversário primeiro.
Exiba o nome do primeiro aniversariante considerando que estamos
no dia 1 de janeiro. Use como entrada o nome, o dia e o mês de nascimento de cada pessoa.
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth1, monthOfBirth1, dayOfBirth2, monthOfBirth2;
        String name1;
        String name2;

        //first person
        System.out.print("Enter the name: ");
        name1 = input.nextLine();

        System.out.print("Enter the birth day: ");
        dayOfBirth1 = input.nextInt();
        while(dayOfBirth1 < 1 || dayOfBirth1 > 31){
            System.out.print("Enter the valid birth day: ");
            dayOfBirth1 = input.nextInt();
        }

        System.out.print("Enter the birth month: ");
        monthOfBirth1 = input.nextInt();
        while(monthOfBirth1 < 1 || monthOfBirth1 > 12){
            System.out.print("Enter the valid birth month: ");
            dayOfBirth1 = input.nextInt();
        }

        //second person
        System.out.print("Enter the name: ");
        name2 = input.next();

        System.out.print("Enter the birth day: ");
        dayOfBirth2 = input.nextInt();
        while(dayOfBirth2 < 1 || dayOfBirth2 > 31){
            System.out.print("Enter the valid birth day: ");
            dayOfBirth1 = input.nextInt();
        }

        System.out.print("Enter the birth month: ");
        monthOfBirth2 = input.nextInt();
        while(monthOfBirth2 < 1 || monthOfBirth2 > 12){
            System.out.print("Enter the valid birth month: ");
            dayOfBirth1 = input.nextInt();
        }

        //conditions
        if((dayOfBirth1 > dayOfBirth2) && (monthOfBirth1 >= monthOfBirth2)){
            System.out.print(name2 + " is older than " + name1);
        }
        else{
            if((dayOfBirth1 > dayOfBirth2) && (monthOfBirth1 < monthOfBirth2)){
                System.out.print(name1 + " is older than " + name2);
            }
            else if((dayOfBirth1 < dayOfBirth2) && (monthOfBirth1 <= monthOfBirth2)){
                System.out.print(name1 + " is older than " + name2);
            }
            else if((dayOfBirth1 < dayOfBirth2) && (monthOfBirth1 > monthOfBirth2)){
                System.out.print(name2 + " is older than " + name1);
            }
            else {
                System.out.print(name2 + " is the same age of " + name1);
            }
        }


        input.close();
    }

}
