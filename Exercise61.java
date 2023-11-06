/* Desenhe a seguinte pirâmide de asteriscos.
O usuário determina a quantidade de linhas.  */

import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        int controller = numberOfLines - 1;

        for(int a = 1; a <= numberOfLines; a++){
            for(int b = 1; b <= (numberOfLines - controller); b++){
                System.out.print("*");
            }
            System.out.println("");
            controller--;
        }

        input.close();
    }
}
