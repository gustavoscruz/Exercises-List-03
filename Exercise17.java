/* Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa. */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfBirth, monthOfBirth;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter the birth day: ");
        dayOfBirth = input.nextInt();

        System.out.print("Enter the birth month: ");
        monthOfBirth = input.nextInt();

        if (dayOfBirth < 1 || dayOfBirth > 31 || monthOfBirth < 1 || monthOfBirth > 12) {
            System.out.println("Invalid date");
        } else if (dayOfBirth == 31 && (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11)) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        } else if (dayOfBirth > 29 && monthOfBirth == 2) {
            System.out.println("It's not possible to be born in " + months[monthOfBirth - 1] + " " + dayOfBirth);
        }
        else {
            //trimester
            if(monthOfBirth >= 1 && monthOfBirth <= 3){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the first trimester, ");
            }
            else if(monthOfBirth >= 4 && monthOfBirth <= 6){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the second trimester, ");
            }
            else if(monthOfBirth >= 6 && monthOfBirth <= 9){
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the third trimester, ");
            }
            else {
                System.out.println("You're born in " + months[monthOfBirth - 1] + ", " + dayOfBirth + ", in the fourth trimester, ");
            }

            //horoscope
            if((dayOfBirth >= 21 && monthOfBirth == 1) || (dayOfBirth <= 19 && monthOfBirth == 2)){
                System.out.println("Your sign is Aquarius");
            }
            else if((dayOfBirth >= 20 && monthOfBirth == 2) || (dayOfBirth <= 20 && monthOfBirth == 3)){
                System.out.println("Your sign is Pisces");
            }
            else if((dayOfBirth >= 21 && monthOfBirth == 3) || (dayOfBirth <= 20 && monthOfBirth == 4)){
                System.out.println("Your sign is Aries");
            }
            else if((dayOfBirth >= 21 && monthOfBirth == 4) || (dayOfBirth <= 20 && monthOfBirth == 5)){
                System.out.println("Your sign is Taurus");
            }
            else if((dayOfBirth >= 21 && monthOfBirth == 5) || (dayOfBirth <= 20 && monthOfBirth == 6)){
                System.out.println("Your sign is Gemini");
            }
            else if((dayOfBirth >= 21 && monthOfBirth == 6) || (dayOfBirth <= 21 && monthOfBirth == 7)){
                System.out.println("Your sign is Cancer");
            }
            else if((dayOfBirth >= 22 && monthOfBirth == 7) || (dayOfBirth <= 22 && monthOfBirth == 8)){
                System.out.println("Your sign is Leo");
            }
            else if((dayOfBirth >= 23 && monthOfBirth == 8) || (dayOfBirth <= 22 && monthOfBirth == 9)){
                System.out.println("Your sign is Virgo");
            }
            else if((dayOfBirth >= 23 && monthOfBirth == 9) || (dayOfBirth <= 22 && monthOfBirth == 10)){
                System.out.println("Your sign is Libra");
            }
            else if((dayOfBirth >= 23 && monthOfBirth == 10) || (dayOfBirth <= 21 && monthOfBirth == 11)){
                System.out.println("Your sign is Scorpio");
            }
            else if((dayOfBirth >= 22 && monthOfBirth == 11) || (dayOfBirth <= 21 && monthOfBirth == 12)){
                System.out.println("Your sign is Sagittarius");
            }
            else if((dayOfBirth >= 22 && monthOfBirth == 12) || (dayOfBirth <= 20 && monthOfBirth == 1)){
                System.out.println("Your sign is Capricorn");
            }


        }


        input.close();
    }

}
