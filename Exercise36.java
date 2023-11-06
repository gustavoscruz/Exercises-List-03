/* Exiba todos os números ímpares existentes entre
dois números informados pelo usuário. Dica: use o
operador % para calcular o resto da divisão entre dois números.
*/

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int origin, bound;

        System.out.print("Enter the origin: ");
        origin = input.nextInt();

        System.out.print("Enter the bound: ");
        bound = input.nextInt();

        for (origin = origin; origin < bound; origin++){
            if(origin % 2 != 0){
                System.out.println(origin);
            }
        }
    }
}