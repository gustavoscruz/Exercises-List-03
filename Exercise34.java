/* Exiba 50 números sorteados de 1 a 100 para o usuário. */

import java.util.Random;

public class Exercise34 {
    public static void main(String[] args){

        Random random = new Random(5871293);

        for (int i = 1; i <= 50; i++){
            System.out.println(random.nextInt(1,101));
        }
    }
}
