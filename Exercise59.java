/* Exiba as 10 tabuadas (de 1 a 10).   */
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //multiplication table
        for(int a = 1; a <= 10; a++){
            System.out.println("Multiplication table of " + a);
            for(int b = 1; b <= 10; b++){
                System.out.println(a + " X " + b + " = " + a * b);
            }
            System.out.println("");
        }


        input.close();
    }
}