/* Receba do usuário o nome de um mês. Exiba o número equivalente. */

import java.awt.*;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {"january" ,"february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        System.out.print("Enter a valid month: ");
        String month = input.nextLine().toLowerCase();

        for(int i = 0; i < months.length; i++){
            if(month.equals(months[i])){
                System.out.println("The number of the month is " + (i + 1));
                break;
            }
        }

        input.close();
    }

}
