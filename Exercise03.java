/* Solicite a quantidade de homens e de mulheres de uma turma da faculdade.
Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma. */

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfMen, numberOfWomen, totalStudents = 0;

        System.out.print("How many men are there in the class: ");
        numberOfMen = input.nextInt();

        System.out.print("How many women are there in the class: ");
        numberOfWomen = input.nextInt();

        totalStudents = numberOfWomen + numberOfMen;

        System.out.println(((double)numberOfMen / totalStudents) + " % are man");
        System.out.println(((double)numberOfWomen / totalStudents) + " % are women");

        input.close();
    }

}
