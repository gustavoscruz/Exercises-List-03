/* Exiba uma quantidade de números sorteados determinada pelo
usuário. Peça também que o usuário determine a faixa do sorteio.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random(5871293);
        int numberQuantity, origin, bound;

        System.out.print("Enter the quantity of numbers: ");
        numberQuantity = input.nextInt();

        System.out.print("Enter the origin: ");
        origin = input.nextInt();

        System.out.print("Enter the bound: ");
        bound = 1 + input.nextInt();

        for (int i = 1; i <= numberQuantity; i++){
            System.out.println(random.nextInt(origin,bound));
        }
    }
}