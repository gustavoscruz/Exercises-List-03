/* Exiba todos os números pares de 10 a 200. */

public class Exercise33 {
    public static void main(String[] args){
        for (int i = 11; i < 200; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
