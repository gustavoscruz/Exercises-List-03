/* Apresente uma tabela contendo a evolução do valor de uma
dívida ao longo dos meses e anos a partir de janeiro de 2007..  */

import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the debt value: ");
        float debtValue = input.nextInt();
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter the correction rate: ");
        float correctionRate = input.nextFloat();

        for(int a = 1; a <= numberOfYears; a++){
            for(int b = 1; b <= 12; b++){
                debtValue = debtValue * (1 + (correctionRate / 100));
                System.out.printf("%.2f ", debtValue);
            }
            System.out.println("");
        }




        input.close();
    }
}
