/* Valide um horário composto de horas, minutos e segundos. */

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours, minutes, seconds;

        System.out.print("Enter the hours: ");
        hours = input.nextInt();

        System.out.print("Enter the minutes: ");
        minutes = input.nextInt();

        System.out.print("Enter the seconds: ");
        seconds = input.nextInt();

        //hours validation conditions
        if((hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59)){
            System.out.println(hours + ":" + minutes + ":" + seconds + " is valid");
        }
        else {
            System.out.println(hours + ":" + minutes + ":" + seconds + " is invalid");
        }


        input.close();
    }

}
