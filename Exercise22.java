/* IVerifique se duas datas de aniversário (dia e mês) são iguais. */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth1, monthOfBirth1, dayOfBirth2, monthOfBirth2;

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

        if((dayOfBirth1 == dayOfBirth2) && (monthOfBirth1 == monthOfBirth2)){
            System.out.println("The dates are equal");
        }
        else{
            System.out.println("The dates aren't equal");
        }


        input.close();
    }

}
